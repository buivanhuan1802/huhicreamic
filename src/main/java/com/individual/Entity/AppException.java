package com.individual.Entity;

public class AppException {
private String errorMessage;
private String detail;

public AppException(String errorMessage,String detail) {
	this.errorMessage = errorMessage;
	this.detail=detail;
}

public String getErrorMessage() {
	return errorMessage;
}

public void setErrorMessage(String errorMessage) {
	this.errorMessage = errorMessage;
}

public String getDetail() {
	return detail;
}

public void setDetail(String detail) {
	this.detail = detail;
}


}
