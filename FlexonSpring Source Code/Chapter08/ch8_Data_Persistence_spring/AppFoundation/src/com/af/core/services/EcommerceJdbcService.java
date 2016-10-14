package com.af.core.services;

import com.af.core.domain.Product;
import java.util.List;

public interface EcommerceJdbcService {
	
	public abstract List<Product> getProducts() throws Exception;
	
	public abstract void insertProduct(Product product) throws Exception;
	
	public abstract void deleteProduct(Product product) throws Exception;

	public abstract void updateProduct(Product product) throws Exception;
	
}