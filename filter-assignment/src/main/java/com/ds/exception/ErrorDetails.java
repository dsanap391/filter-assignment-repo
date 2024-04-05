package com.ds.exception;

import java.time.LocalDateTime;

public class ErrorDetails {
	private int status;
    private String error;
    private String path;
    private String message;
    private LocalDateTime timestamp;
    
    public ErrorDetails() {
	}

	public ErrorDetails(int status, String error, String message, LocalDateTime timestamp, String path) {
		this.status = status;
		this.error = error;
		this.message = message;
		this.timestamp = timestamp;
		this.path = path;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
