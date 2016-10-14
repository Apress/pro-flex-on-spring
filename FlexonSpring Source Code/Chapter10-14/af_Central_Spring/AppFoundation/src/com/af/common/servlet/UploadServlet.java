package com.af.common.servlet;

import com.oreilly.servlet.MultipartRequest;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

public class UploadServlet extends HttpServlet {
    protected void doGet( HttpServletRequest req, HttpServletResponse res ) throws ServletException, IOException {;}

    protected void doPost( HttpServletRequest req, HttpServletResponse res ) throws ServletException, IOException {
    	
    	// set the directory to build for the file
    	String directoryName = req.getParameter("directoryName");
    	
    	// get the properties file
		Properties props = new Properties();
		try {
			InputStream in = new FileInputStream("webapps/af_Central/WEB-INF/classes/Central.properties");
			props.load(in);
			in.close();
		}catch(IOException e){
			System.out.println("An error occurred while retrieving the Central.properties file.");
			throw new RuntimeException(e);
		}		
		
		try 
		{
			File fDir = new File(props.getProperty("UPLOAD_PATH")+directoryName);		
			if (fDir.exists())
			{			
				//System.out.println("Dir already exists!");		
			}		
			else{			
				fDir.mkdir();			
				//System.out.println("Dir created! " + directoryName);		
			}
			
	    	MultipartRequest parts = new MultipartRequest( req, props.getProperty("UPLOAD_PATH")+directoryName, 144*1024*1024 );
	        PrintWriter out = res.getWriter();
	        out.close();
		} catch (IOException e) { 
			System.out.println("Error: " + e); 
		} 
    }
}