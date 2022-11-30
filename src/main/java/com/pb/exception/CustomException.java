package com.pb.exception;

import org.hibernate.boot.model.naming.IllegalIdentifierException;

public class CustomException extends IllegalArgumentException {
 public CustomException(String msg) {
	 super();
 }
}
