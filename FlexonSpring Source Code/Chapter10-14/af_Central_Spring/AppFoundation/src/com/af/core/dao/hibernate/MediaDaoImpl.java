package com.af.core.dao.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.af.common.util.AFObjID;
import com.af.core.dao.MediaDao;
import com.af.core.domain.Media;

@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class MediaDaoImpl extends HibernateDaoSupport implements MediaDao 
{   
	AFObjID aSingleton = AFObjID.getInstance();
	
	// Media
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public List<Media> getMedia(long key){
		return getHibernateTemplate().find("from Media where assocobjectid=?", key);
	}
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
    public Media insertMedia(Media media){
		media.setObjectIdentifier(aSingleton.NewObjectIdentifier());
		return (Media) getHibernateTemplate().merge(media);
	}

	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void deleteMedia(Media media){
		getHibernateTemplate().delete(media);
	}
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void updateMedia(Media media){
		getHibernateTemplate().delete(media);
	}
}
