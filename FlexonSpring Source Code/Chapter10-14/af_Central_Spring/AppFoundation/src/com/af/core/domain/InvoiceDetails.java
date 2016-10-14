package com.af.core.domain;

import javax.persistence.*;

@Entity
@Table(name="AFCM_INVOICEDETAILS")

public class InvoiceDetails implements java.io.Serializable
{
	static final long serialVersionUID = 5L;
	
	@Id
	@Column(name="OBJECTIDENTIFIER")
    private long objectIdentifier;
	
	@Column(name="ASSOCOBJECTID")
	private long assocobjectID;
    
	@Column(name="DETAIL")
	private String detail;
    
	@Column(name="QUANTITY")
	private int quantity;
    
	@Column(name="UNITPRICE")
	private Float unitPrice;

    public InvoiceDetails() {}

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

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setUnitPrice(Float unitPrice) {
		this.unitPrice = unitPrice;
	}
}
