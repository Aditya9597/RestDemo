package com.spingboot.rest_demo1.exception;

import org.springframework.http.HttpStatus;

public class CloudVendorException  {
	
	private final String message;
	private final Throwable throwable;	
	private final HttpStatus httpStatus;
	
	public CloudVendorException(String message, Throwable throwable, HttpStatus httpStatus) {
		super();
		this.message = message;
		this.throwable = throwable;
		this.httpStatus = httpStatus;
	}

	public String getMessage() {
		return message;
	}

	public Throwable getThrowable() {
		return throwable;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
}

