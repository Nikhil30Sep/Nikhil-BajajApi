package com.springrest.springrest.model;


public class FileDetails {
	 private boolean fileValid;
	 private String fileMimeType;
	 @Override
	public String toString() {
		return "FileDetails [fileValid=" + fileValid + ", fileMimeType=" + fileMimeType + ", fileSizeKb=" + fileSizeKb
				+ "]";
	}
	private double fileSizeKb;
	public boolean isFileValid() {
		return fileValid;
	}
	public void setFileValid(boolean fileValid) {
		this.fileValid = fileValid;
	}
	public String getFileMimeType() {
		return fileMimeType;
	}
	public void setFileMimeType(String fileMimeType) {
		this.fileMimeType = fileMimeType;
	}
	public double getFileSizeKb() {
		return fileSizeKb;
	}
	public void setFileSizeKb(double fileSizeKb) {
		this.fileSizeKb = fileSizeKb;
	}
}
