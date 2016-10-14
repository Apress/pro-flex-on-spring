package com.af.core.dao;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

import com.af.core.domain.InvoiceDetails;
import com.af.core.domain.Invoices;

public interface InvoiceDao {
	
	//Invoices
	@Transactional(readOnly=true, propagation=Propagation.SUPPORTS)
	List<Invoices> getInvoices(long key);
	
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	Invoices insertInvoice(Invoices invoices);

	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	void deleteInvoice(Invoices invoices);
		
	@Transactional(readOnly=true, propagation=Propagation.REQUIRED)
	void updateInvoice(Invoices invoices);
	
	//Invoice Detail
	@Transactional(readOnly=true, propagation=Propagation.SUPPORTS)
	List<InvoiceDetails> getInvoiceDetails(long key);
	
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	InvoiceDetails insertInvoiceDetail(InvoiceDetails invoiceDetails);

	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	void deleteInvoiceDetail(InvoiceDetails invoiceDetails);
		
	@Transactional(readOnly=true, propagation=Propagation.REQUIRED)
	void updateInvoiceDetail(InvoiceDetails invoiceDetails);
}
