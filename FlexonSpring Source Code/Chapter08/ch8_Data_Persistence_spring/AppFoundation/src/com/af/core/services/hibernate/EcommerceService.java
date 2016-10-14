package com.af.core.services.hibernate;

import com.af.core.domain.ProductsH;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

public interface EcommerceService 
{
	@Transactional(readOnly=true)
	List<ProductsH> getProducts();
	
	@Transactional(readOnly=false)
	ProductsH insertProduct(ProductsH product);
	
	@Transactional(readOnly=false)
	void deleteProduct(ProductsH product);
	
	@Transactional(readOnly=false)
	void updateProduct(ProductsH product);
}