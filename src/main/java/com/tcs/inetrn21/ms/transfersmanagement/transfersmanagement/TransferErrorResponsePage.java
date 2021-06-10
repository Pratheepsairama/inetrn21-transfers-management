package com.tcs.inetrn21.ms.transfersmanagement.transfersmanagement;

public class TransferErrorResponsePage {
	private int status;
	private String message;
	private long timestamp;
	
	public TransferErrorResponsePage() {
		
	}

	public TransferErrorResponsePage(int status, String message, long timestamp) {
		this.status = status;
		this.message = message;
		this.timestamp = timestamp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	

}
