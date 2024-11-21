package com.springrest.springrest.model;

import java.util.List;

public class PostResponse {
	private boolean isSuccess;
    private String userId;
    private String email;
    private String rollNumber;
    private List<String> numbers;
    private List<String> alphabets;
    private String highestLowercaseAlphabet;
    private boolean isPrimeFound;
    private FileDetails fileDetails;
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public List<String> getNumbers() {
		return numbers;
	}
	public void setNumbers(List<String> numbers) {
		this.numbers = numbers;
	}
	public List<String> getAlphabets() {
		return alphabets;
	}
	public void setAlphabets(List<String> alphabets) {
		this.alphabets = alphabets;
	}
	public String getHighestLowercaseAlphabet() {
		return highestLowercaseAlphabet;
	}
	public void setHighestLowercaseAlphabet(String highestLowercaseAlphabet) {
		this.highestLowercaseAlphabet = highestLowercaseAlphabet;
	}
	public boolean isPrimeFound() {
		return isPrimeFound;
	}
	public void setPrimeFound(boolean isPrimeFound) {
		this.isPrimeFound = isPrimeFound;
	}
	public FileDetails getFileDetails() {
		return fileDetails;
	}
	public void setFileDetails(FileDetails fileDetails) {
		this.fileDetails = fileDetails;
	}
	@Override
	public String toString() {
		return "PostResponse [isSuccess=" + isSuccess + ", userId=" + userId + ", email=" + email + ", rollNumber="
				+ rollNumber + ", numbers=" + numbers + ", alphabets=" + alphabets + ", highestLowercaseAlphabet="
				+ highestLowercaseAlphabet + ", isPrimeFound=" + isPrimeFound + ", fileDetails=" + fileDetails + "]";
	}
	
	
}
