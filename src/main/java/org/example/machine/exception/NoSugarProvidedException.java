package org.example.machine.exception;

public class NoSugarProvidedException extends Exception {

	private static final long serialVersionUID = 6522581439131643657L;

	public NoSugarProvidedException() {
		super();
	}

	public NoSugarProvidedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NoSugarProvidedException(String message, Throwable cause) {
		super(message, cause);
	}

	public NoSugarProvidedException(String message) {
		super(message);
	}

	public NoSugarProvidedException(Throwable cause) {
		super(cause);
	}

	

}
