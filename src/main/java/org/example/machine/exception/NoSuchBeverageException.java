package org.example.machine.exception;

public class NoSuchBeverageException extends Exception {

	private static final long serialVersionUID = 5182125103145409844L;

	public NoSuchBeverageException() {
	}

	public NoSuchBeverageException(String message) {
		super(message);
	}

	public NoSuchBeverageException(Throwable cause) {
		super(cause);
	}

	public NoSuchBeverageException(String message, Throwable cause) {
		super(message, cause);
	}

	public NoSuchBeverageException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
