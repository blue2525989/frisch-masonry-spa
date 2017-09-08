package com.frisch.model;

public class GalleryImage {

	private String title;
	
	private String alt;
	
	private String description;
	
	private String url;
	
	public GalleryImage() {}
	
	public GalleryImage(String title, String alt, String description, String url) {
		this.setTitle(title);
		this.setAlt(alt);
		this.setDescription(description);
		this.setUrl(url);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAlt() {
		return alt;
	}

	public void setAlt(String alt) {
		this.alt = alt;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
