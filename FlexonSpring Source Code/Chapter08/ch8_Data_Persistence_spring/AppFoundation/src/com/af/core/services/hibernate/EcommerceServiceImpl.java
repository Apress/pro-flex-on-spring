package com.af.core.services.hibernate;

import com.af.core.dao.hibernate.EcommerceDao;
import com.af.core.domain.ProductsH;

import java.util.List;
import java.io.Serializable;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
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
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public List<ProductsH> getProducts() {
		return ecommerceDao.getProducts();
	}
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public ProductsH insertProduct(ProductsH product) {	
		return ecommerceDao.insertProduct(product);
	}
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void deleteProduct(ProductsH product) {
		ecommerceDao.deleteProduct(product);
	}
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void updateProduct(ProductsH product)  {
		ecommerceDao.updateProduct(product);
	}
}