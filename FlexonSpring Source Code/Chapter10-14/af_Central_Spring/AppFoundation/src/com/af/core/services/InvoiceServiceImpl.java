package com.af.core.services;

import com.af.core.dao.InvoiceDao;
import com.af.core.domain.InvoiceDetails;
import com.af.core.domain.Invoices;

import java.util.List;
import java.io.Serializable;

public class InvoiceServiceImpl implements Serializable, InvoiceService 
{
	// injected by Spring
	InvoiceDao invoiceDao; 
	
	public InvoiceDao getInvoiceDao() {
		return invoiceDao;
	}
	
	public void setInvoiceDao(InvoiceDao invoiceDao) {
		this.invoiceDao = invoiceDao;
	}

	// Invoices
	public List<Invoices> getInvoices(long key) {
		return invoiceDao.getInvoices(key);
	}
	public void insertInvoice(Invoices invoices) {	
		invoiceDao.insertInvoice(invoices);
	}
	public void deleteInvoice(Invoices invoices) {
		invoiceDao.deleteInvoice(invoices);
	}
	public void updateInvoice(Invoices invoices)  {
		invoiceDao.updateInvoice(invoices);
	}
	
	// Invoice Details
	public List<InvoiceDetails> getInvoiceDetails(long key) {
		return invoiceDao.getInvoiceDetails(key);
	}
	public void insertInvoiceDetail(InvoiceDetails invoiceDetails) {	
		invoiceDao.insertInvoiceDetail(invoiceDetails);
	}
	public void deleteInvoiceDetail(InvoiceDetails invoiceDetails) {
		invoiceDao.deleteInvoiceDetail(invoiceDetails);
	}
	public void updateInvoiceDetail(InvoiceDetails invoiceDetails)  {
		invoiceDao.updateInvoiceDetail(invoiceDetails);
	}
}