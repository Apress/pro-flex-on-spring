package com.af.core.dao.jdbc;

import java.util.List;
import javax.sql.*;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.dao.DataAccessException;

import com.af.core.dao.EcommerceJdbcDao;
import com.af.core.domain.Product;

public class EcommerceJdbcDaoImpl implements EcommerceJdbcDao
{
	private SimpleJdbcTemplate simpleJdbcTemplate;
	
	public void setDataSource(DataSource dataSource) 
	{
	    this.simpleJdbcTemplate = new SimpleJdbcTemplate(dataSource);
	}
	
	public List<Product> getProducts() 
	{
		List<Product> productList = simpleJdbcTemplate.query(
		      "SELECT * FROM product",
		      ParameterizedBeanPropertyRowMapper.newInstance(Product.class));
		return productList;
	}
    
    public void deleteProduct(Product product) throws DataAccessException 
    {
    	simpleJdbcTemplate.update("DELETE FROM product WHERE productID = :productID");
    }
	
    public void insertProduct(Product product) 
    {
    	simpleJdbcTemplate.update(
    	    	"INSERT into product VALUES('', " +
    	    	":SKU," +
    	    	" :productName, " +
    	    	" :productDescription, " +
    	    	" :supplierID, " +
    	    	" :categoryID, " +
    	    	" :unitQuantity, " +
    	    	" :unitPrice, " +
    	    	" :MSRP, " +
    	    	" :availableSize, " +
    	    	" :availableColors, " +
    	    	" :size, " +
    	    	" :color, " +
    	    	" :image ",
    	    	new BeanPropertySqlParameterSource(product));
    }
    public void updateProduct(Product product) 
    {
    	simpleJdbcTemplate.update(
    	"UPDATE product SET supplierID         = :supplierID," +
    	"                    productname        = :productName, " +
    	"                    productDescription = :productDescription, " +
    	"                    SKU                = :SKU, " +
    	"                    categoryID         = :categoryID, " +
    	"                    unitQuantity       = :unitQuantity, " +
    	"                    unitPrice          = :unitPrice, " +
    	"                    MSRP               = :MSRP, " +
    	"                    availableSize      = :availableSize, " +
    	"                    availableColors    = :availableColors, " +
    	"                    size               = :size, " +
    	"                    color              = :color, " +
    	"                    image              = :image " +
    	"WHERE productID = :productID",
    	new BeanPropertySqlParameterSource(product)); 
    }
}
