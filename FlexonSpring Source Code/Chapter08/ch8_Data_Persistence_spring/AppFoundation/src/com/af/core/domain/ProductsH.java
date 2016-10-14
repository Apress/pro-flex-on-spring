package com.af.core.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.Index;

@Entity
@Table(name="PRODUCT")

public class ProductsH implements java.io.Serializable
{
	@Id
	@Column(name="PRODUCTID")
	@GeneratedValue(generator="InvSeq")
    @SequenceGenerator(name="InvSeq",sequenceName="group_table_seq01", allocationSize=5)
    private int productID;
	
	@Column(name="SKU")
	private String SKU;
    
	@Column(name="PRODUCTNAME")
	private String productName;
    
	@Column(name="PRODUCTDESCRIPTION")
	private String productDescription;
    
	@Column(name="SUPPLIERID")
	private int supplierID;
    
	@Column(name="CATEGORYID")
	private int categoryID;
    
	@Column(name="UNITQUANTITY")
	private int unitQuantity;
    
	@Column(name="UNITPRICE")
	private float unitPrice;
    
	@Column(name="MSRP")
	private float MSRP;
    
	@Column(name="AVAILABLESIZE")
	private String availableSize;
    
	@Column(name="AVAILABLECOLORS")
	private String availableColors;
    
	@Column(name="SIZE")
	private String size;
    
	@Column(name="COLOR")
	private String color;
    
	@Column(name="IMAGE")
	private String image;
    
	//@OneToMany(mappedBy = "ProductsH", fetch = FetchType.LAZY)
   // private List products;
	//private Set<ProductsH> groupPlanList = new HashSet<ProductsH>();
	
    public ProductsH() {
    }

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getSKU() {
		return SKU;
	}

	public void setSKU(String sku) {
		SKU = sku;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public int getUnitQuantity() {
		return unitQuantity;
	}

	public void setUnitQuantity(int unitQuantity) {
		this.unitQuantity = unitQuantity;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public float getMSRP() {
		return MSRP;
	}

	public void setMSRP(float msrp) {
		MSRP = msrp;
	}

	public String getAvailableSize() {
		return availableSize;
	}

	public void setAvailableSize(String availableSize) {
		this.availableSize = availableSize;
	}

	public String getAvailableColors() {
		return availableColors;
	}

	public void setAvailableColors(String availableColors) {
		this.availableColors = availableColors;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	/*public Set<ProductsH> getGroupPlanList() {
		return groupPlanList;
	}

	public void setGroupPlanList(Set<ProductsH> groupPlanList) {
		this.groupPlanList = groupPlanList;
	}
*/
	/*public List getProducts() {
		return products;
	}

	public void setProducts(List products) {
		this.products = products;
	}   */
}
