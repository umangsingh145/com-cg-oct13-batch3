package com.cg.oct13.batch3.day5;


public class CanNotVoteException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	CanNotVoteException() {
		super();
	}

	CanNotVoteException(String message) {
		super(message);
	}
}
