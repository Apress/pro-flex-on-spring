package com.af.core.dao.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

import com.af.core.dao.EcommerceDao;
import com.af.core.domain.Product;

public class EcommerceDaoImpl implements EcommerceDao 
{
    private SqlMapClientTemplate sqlMapClientTemplate;
    
    public void setSqlMapClientTemplate(SqlMapClientTemplate sqlMapClientTemplate) 
    {
    	this.sqlMapClientTemplate = sqlMapClientTemplate;
    }
    
	public List<Product> getProducts()
	{
		return sqlMapClientTemplate.queryForList("getProducts");
	}
	
	public int insertProduct(Product product)
	{      
    	return ((Integer)sqlMapClientTemplate.insert("insertProduct", product)).intValue();
    }
    
    public int deleteProduct(int productID)
    {
        return ((Integer)sqlMapClientTemplate.delete("deleteProduct", productID)).intValue();
    }
	
    public int updateProduct(Product product)
    {
        return ((Integer)sqlMapClientTemplate.update("updateProduct", product)).intValue();
    }
}