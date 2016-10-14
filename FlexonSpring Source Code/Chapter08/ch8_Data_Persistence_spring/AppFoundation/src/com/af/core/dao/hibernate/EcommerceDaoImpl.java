package com.af.core.dao.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.af.core.dao.hibernate.EcommerceDao;
import com.af.core.domain.ProductsH;

@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class EcommerceDaoImpl extends HibernateDaoSupport implements EcommerceDao 
{   
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public List<ProductsH> getProducts(){
		return getHibernateTemplate().find("from ProductsH");
	}
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
    public ProductsH insertProduct(ProductsH productsH){
		return (ProductsH) getHibernateTemplate().merge(productsH);
	}

	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void deleteProduct(ProductsH productsH){
		getHibernateTemplate().delete(productsH);
	}
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void updateProduct(ProductsH productsH){
		getHibernateTemplate().delete(productsH);
	}
}
