package com.af.core.dao;

import com.af.core.domain.Product;
import java.util.List;

public interface EcommerceJdbcDao {

	public List<Product> getProducts();
	
	public void deleteProduct(Product product);

	public void insertProduct(Product product);
	
    public void updateProduct(Product product);
}
