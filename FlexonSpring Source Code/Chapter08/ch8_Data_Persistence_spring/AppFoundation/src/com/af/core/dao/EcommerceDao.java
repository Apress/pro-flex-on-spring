package com.af.core.dao;

import com.af.core.domain.Product;
import java.util.List;

public interface EcommerceDao {

	public List getProducts();
	
	public int deleteProduct(int productID);

	public int insertProduct(Product product);
	
    public int updateProduct(Product product);
}
