package com.af.core.services;

import com.af.core.domain.Product;
import java.util.List;

public interface EcommerceService {
	
	public abstract List<Product> getProducts();
	
	public abstract int insertProduct(Product product) throws Exception;
	
	public abstract int deleteProduct(int productID) throws Exception;

	public abstract int updateProduct(Product product) throws Exception;
	
}