package com.comcast.memes.domain;

import java.util.List;

public class Memes {

	private List<MemesObj> listMemes;

	public List<MemesObj> getListMemes() {
		return listMemes;
	}

	public void setListMemes(List<MemesObj> listMemes) {
		this.listMemes = listMemes;
	}

	@Override
	public String toString() {
		return "Memes [listMemes=" + listMemes + "]";
	}

}
