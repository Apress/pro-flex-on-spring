package com.af.core.services;

import java.util.List;

import com.af.core.domain.InvoiceDetails;
import com.af.core.domain.Invoices;

public interface InvoiceService 
{
	// Invoices
	List<Invoices> getInvoices(long key);
	
	void insertInvoice(Invoices invoices);
	
	void deleteInvoice(Invoices invoices);
	
	void updateInvoice(Invoices invoices);
	
	// Invoice Details
	List<InvoiceDetails> getInvoiceDetails(long key);
	
	void insertInvoiceDetail(InvoiceDetails invoiceDetails);
	
	void deleteInvoiceDetail(InvoiceDetails invoiceDetails);
	
	void updateInvoiceDetail(InvoiceDetails invoiceDetails);
}