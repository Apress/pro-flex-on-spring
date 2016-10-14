package com.af.core.dao.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.af.common.util.AFObjID;
import com.af.core.dao.InvoiceDao;
import com.af.core.domain.InvoiceDetails;
import com.af.core.domain.Invoices;

@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class InvoiceDaoImpl extends HibernateDaoSupport implements InvoiceDao 
{   
	AFObjID aSingleton = AFObjID.getInstance();
	
	// Invoices
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public List<Invoices> getInvoices(long key){
		return getHibernateTemplate().find("from Invoices where assocobjectid=?", key);
	}
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
    public Invoices insertInvoice(Invoices invoices){
		invoices.setObjectIdentifier(aSingleton.NewObjectIdentifier());
		return (Invoices) getHibernateTemplate().merge(invoices);
	}

	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void deleteInvoice(Invoices invoices){
		getHibernateTemplate().delete(invoices);
	}
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void updateInvoice(Invoices invoices){
		getHibernateTemplate().delete(invoices);
	}
	
	// Invoice Detail
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public List<InvoiceDetails> getInvoiceDetails(long key){
		return getHibernateTemplate().find("from InvoiceDetails where assocobjectid=?", key);
	}
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
    public InvoiceDetails insertInvoiceDetail(InvoiceDetails invoiceDetails){
		invoiceDetails.setObjectIdentifier(aSingleton.NewObjectIdentifier());
		return (InvoiceDetails) getHibernateTemplate().merge(invoiceDetails);
	}

	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void deleteInvoiceDetail(InvoiceDetails invoiceDetails){
		getHibernateTemplate().delete(invoiceDetails);
	}
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void updateInvoiceDetail(InvoiceDetails invoiceDetails){
		getHibernateTemplate().delete(invoiceDetails);
	}
}
