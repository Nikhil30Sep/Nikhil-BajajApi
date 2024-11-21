package com.springrest.springrest.model;

import java.util.List;

public class PostRequest {
	private List<String> data;
	@Override
	public String toString() {
		return "PostRequest [data=" + data + ", fileB64=" + fileB64 + "]";
	}
	private String fileB64;
	public List<String> getData() {
		return data;
	}
	public void setData(List<String> data) {
		this.data = data;
	}
	public String getFileB64() {
		return fileB64;
	}
	public void setFileB64(String fileB64) {
		this.fileB64 = fileB64;
	}
}
