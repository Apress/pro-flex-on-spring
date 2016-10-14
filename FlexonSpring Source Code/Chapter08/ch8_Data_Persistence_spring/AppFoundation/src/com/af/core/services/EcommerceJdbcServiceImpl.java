package com.af.core.services;

import com.af.core.dao.EcommerceJdbcDao;
import com.af.core.domain.Product;

import java.util.List;
import java.io.Serializable;

public class EcommerceJdbcServiceImpl implements Serializable, EcommerceJdbcService {
	
	// injected by Spring
	EcommerceJdbcDao ecommerceJdbcDao; 
	
	public EcommerceJdbcDao getEcommerceJdbcDao() {
		return ecommerceJdbcDao;
	}
	
	public void setEcommerceJdbcDao(EcommerceJdbcDao ecommerceJdbcDao) {
		this.ecommerceJdbcDao = ecommerceJdbcDao;
	}

	// Products
	public List<Product> getProducts() throws Exception {
		return ecommerceJdbcDao.getProducts();
	}
	
	public void insertProduct(Product product) throws Exception{	
		ecommerceJdbcDao.insertProduct(product);
	}
 
	public void deleteProduct(Product product) throws Exception {
       ecommerceJdbcDao.deleteProduct(product);
	}
	
	public void updateProduct(Product product) throws Exception {
      ecommerceJdbcDao.updateProduct(product);
	}
}