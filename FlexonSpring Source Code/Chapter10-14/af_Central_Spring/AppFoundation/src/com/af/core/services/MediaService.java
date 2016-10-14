package com.af.core.services;

import java.util.List;

import com.af.core.domain.Media;

public interface MediaService 
{
	// Media
	List<Media> getMedia(long key);
	
	void insertMedia(Media media);
	
	void deleteMedia(Media media);
	
	void updateMedia(Media media);
}