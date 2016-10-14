package com.af.common.servlet;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/******************************************************************************
This class implements a HTTP servlet to fetch a document from local disk.

@version $Revision: 1.1 $
 
@author Chris Giametta

@since January 24, 2006 
<hr>
<PRE>
----------------------------------------------------------------------------
Modification Log
----------------------------------------------------------------------------
$Log:
$
</PRE>
******************************************************************************/
public class DocumentFetcherServlet extends HttpServlet {
	
    private long startTime;
    private long endTime;
    private long startTimeAll;
    private long endTimeAll;
    private long duration;
    
    
	/**************************************************************************
	* %METHOD: public void doPost(HttpServletRequest request, 
	* 							   HttpServletResponse response, 
	* 							   UserData userData)
    *							   throws ServletException, IOException
	*
	* %DESCRIPTION: Fetch the document from disk and send it back as an 
	* 				attachment.
	* 
	* @param HttpServletRequest, HttpServletResponse, UserData
	* @return 
	***************************************************************************/
	public void doGet(HttpServletRequest request, HttpServletResponse response)
    	throws ServletException, IOException {

		InputStream in = null;
		
		// set the directory to build for the file
    	String directoryName = request.getParameter("directoryName");
		String fileName = request.getParameter("name");
		
		if (fileName == null){
       		// attachErrorPage(request,response, "Invalid report or version. ", null, fileName, "DocumentFetcherServlet");
       		return;
 		}
    	String fileExtension = fileName.substring(fileName.lastIndexOf(".")+1);
    	
		// Get the properties file
		Properties props = new Properties();
		try {
			in = new FileInputStream("webapps/af_Central/WEB-INF/classes/Central.properties");
			props.load(in);
			in.close();
		}catch(IOException e){
			//log.error("An error occurred while retrieving the Central.properties file.");
			throw new RuntimeException(e);
		}	
       	try{
       		startTimeAll = System.currentTimeMillis();
          
            //open a ServletOutputStream to send document
            ServletOutputStream out = response.getOutputStream();
            if (fileExtension.equalsIgnoreCase("pdf")){
            	response.setContentType("application/pdf");
            }else if (fileExtension.equalsIgnoreCase("jpg")){
            	response.setContentType("image/jpeg");
            }else if (fileExtension.equalsIgnoreCase("doc")){
            	response.setContentType("application/msword");
            }else if (fileExtension.equalsIgnoreCase("xls")){
            	response.setContentType("application/vnd.ms-excel");
            }else if (fileExtension.equalsIgnoreCase("txt")){
            	response.setContentType("text/plain");
            }else {}
            	response.setHeader("Content-Disposition","attachment; filename=" + fileName); 
            
            byte [] buffer = new byte[2048];
            int bytes = 0;
            in = new FileInputStream(props.getProperty("DOWNLOAD_PATH") + directoryName + "/" + fileName);
            while ((bytes = in.read(buffer)) != -1) {
            	out.write(buffer, 0, bytes);
            }
//       System.out.println("save download page " + cont.getPage());     
            out.flush();
            out.close();
            in.close();
       	}catch(Exception e){
       		if (!response.isCommitted()){
       			//Set the ending servlet session on errors

       			//System.out.println("An error occurred while fetching report.", e);
       			//attachErrorPage(request,response,null, e.getCause().toString(), fileName, "DocumentFetcherServlet");
       		}
       	}
	}
}