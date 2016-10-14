package com.af.core.services;

import com.af.core.dao.EcommerceDao;
import com.af.core.domain.Product;

import java.util.List;
import java.io.Serializable;

public class EcommerceServiceImpl implements Serializable, EcommerceService {
	
	// injected by Spring
	EcommerceDao ecommerceDao; 
	
	public EcommerceDao getEcommerceDao() {
		return ecommerceDao;
	}
	
	public void setEcommerceDao(EcommerceDao ecommerceDao) {
		this.ecommerceDao = ecommerceDao;
	}

	// Products
	public List<Product> getProducts() {
		return ecommerceDao.getProducts();
	}
	
	public int insertProduct(Product product) throws Exception{	
		return ((Integer)ecommerceDao.insertProduct(product));
	}
 
	public int deleteProduct(int productID) throws Exception {
       return ((Integer)ecommerceDao.deleteProduct(productID));
	}
	
	public int updateProduct(Product product) throws Exception {
       return ((Integer)ecommerceDao.updateProduct(product));
	}
}