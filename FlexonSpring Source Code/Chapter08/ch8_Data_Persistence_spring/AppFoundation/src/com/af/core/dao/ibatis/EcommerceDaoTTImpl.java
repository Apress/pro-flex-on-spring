package com.af.core.dao.ibatis;

import java.util.List;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.af.core.dao.EcommerceDao;
import com.af.core.domain.Product;

public class EcommerceDaoTTImpl// extends SimpleJdbcTemplate implements EcommerceJdbcDao
{	
/*	private SimpleJdbcInsert insertProduct; 
	 
	private PlatformTransactionManager transactionManager;

	public void setTransactionManager(
			PlatformTransactionManager transactionManager)
	{
		this.transactionManager = transactionManager;
	}

	public void insertProduct(final Product product)
	{
		TransactionTemplate transactionTemplate =
			new TransactionTemplate(transactionManager);
		
		transactionTemplate.execute(new TransactionCallbackWithoutResult()
		{
			protected void doInTransactionWithoutResult(TransactionStatus status)
			{
				Number newId = insertProduct.executeAndReturnKey(
				      new BeanPropertySqlParameterSource(product));
			    product.setProductID(newId.intValue());
			}
		});
	}
	*/
}