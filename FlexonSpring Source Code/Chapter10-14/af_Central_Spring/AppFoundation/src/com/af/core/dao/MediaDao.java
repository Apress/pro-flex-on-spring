package com.af.core.dao;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

import com.af.core.domain.Media;

public interface MediaDao {
	
	//Medias
	@Transactional(readOnly=true, propagation=Propagation.SUPPORTS)
	List<Media> getMedia(long key);
	
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	Media insertMedia(Media media);

	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	void deleteMedia(Media media);
		
	@Transactional(readOnly=true, propagation=Propagation.REQUIRED)
	void updateMedia(Media media);
}
