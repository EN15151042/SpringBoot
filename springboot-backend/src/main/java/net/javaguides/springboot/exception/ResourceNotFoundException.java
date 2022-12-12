package net.javaguides.springboot.exception;

public class ResourceNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String resourceName;
	private  String fieldName;
	private  Object fieldValue;
	
	
	public ResourceNotFoundException() {
		super(String.format("resourceName", "fieldName","fieldValue"));
		// TODO Auto-generated constructor stub
	}


	public ResourceNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}


	public ResourceNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}


	public ResourceNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}


	public ResourceNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}


	public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
		super();
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	
}
