package com.af.core.dao.hibernate;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

import com.af.core.domain.ProductsH;

public interface EcommerceDao {
	
	@Transactional(readOnly=true, propagation=Propagation.SUPPORTS)
	List<ProductsH> getProducts();
	
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	ProductsH insertProduct(ProductsH productsH);

	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	void deleteProduct(ProductsH productsH);
		
	@Transactional(readOnly=true, propagation=Propagation.REQUIRED)
	void updateProduct(ProductsH productsH);
}
