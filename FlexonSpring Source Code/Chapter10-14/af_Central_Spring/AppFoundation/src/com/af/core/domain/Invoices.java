package com.af.core.domain;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="AFCM_INVOICES")

public class Invoices implements java.io.Serializable
{
	static final long serialVersionUID = 6L;
	
	@Id
	@Column(name="OBJECTIDENTIFIER")
    private long objectIdentifier;
	
	@Column(name="ASSOCOBJECTID")
	private long assocobjectID;
    
	@Column(name="CLIENTNUMBER")
	private String clientNumber;
    
	@Column(name="CLIENTNAME")
	private String clientName;
    
	@Column(name="INVOICEDATE")
	private Date invoiceDate;

	@Column(name="INVOICENUMBER")
	private String invoiceNumber;
	
	@Column(name="TOBEPAIDUNTIL")
	private Date toBePaidUntil;
	
	@Column(name="COMMENTS")
	private String comments;
	
	@Column(name="PERCENTDISCOUNT")
	private Float percentDiscount;
	
    public Invoices() {}

	public long getObjectIdentifier() {
		return objectIdentifier;
	}

	public void setObjectIdentifier(long objectIdentifier) {
		this.objectIdentifier = objectIdentifier;
	}

	public long getAssocobjectID() {
		return assocobjectID;
	}

	public void setAssocobjectID(long assocobjectID) {
		this.assocobjectID = assocobjectID;
	}

	public String getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(String clientNumber) {
		this.clientNumber = clientNumber;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public Date getToBePaidUntil() {
		return toBePaidUntil;
	}

	public void setToBePaidUntil(Date toBePaidUntil) {
		this.toBePaidUntil = toBePaidUntil;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Float getPercentDiscount() {
		return percentDiscount;
	}

	public void setPercentDiscount(Float percentDiscount) {
		this.percentDiscount = percentDiscount;
	}
}
