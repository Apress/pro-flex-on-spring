package com.af.core.services;

import com.af.core.dao.MediaDao;
import com.af.core.domain.Media;

import java.util.List;
import java.io.Serializable;

public class MediaServiceImpl implements Serializable, MediaService 
{	
	// injected by Spring
	MediaDao mediaDao; 
	
	public MediaDao getMediaDao() {
		return mediaDao;
	}
	
	public void setMediaDao(MediaDao mediaDao) {
		this.mediaDao = mediaDao;
	}

	// Media
	public List<Media> getMedia(long key) {
		return mediaDao.getMedia(key);
	}
	public void insertMedia(Media media) {	
		mediaDao.insertMedia(media);
	}
	public void deleteMedia(Media media) {
		mediaDao.deleteMedia(media);
	}
	public void updateMedia(Media media)  {
		mediaDao.updateMedia(media);
	}
}