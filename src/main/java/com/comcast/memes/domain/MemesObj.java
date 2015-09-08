package com.comcast.memes.domain;

public class MemesObj {

	private String id;
	private String name;
	private String url;
	private int width;
	private int height;
	private int lulz;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getLulz() {
		return lulz;
	}

	public void setLulz(int lulz) {
		this.lulz = lulz;
	}

	@Override
	public String toString() {
		return "MemesObj [id=" + id + ", name=" + name + ", url=" + url
				+ ", width=" + width + ", height=" + height + ", lulz=" + lulz
				+ "]";
	}

}
