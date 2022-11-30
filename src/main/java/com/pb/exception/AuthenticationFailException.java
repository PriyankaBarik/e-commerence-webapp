package com.pb.exception;

import org.hibernate.boot.model.naming.IllegalIdentifierException;

public class AuthenticationFailException  extends IllegalArgumentException{
   
	public AuthenticationFailException(String msg) {
		super(msg);
	}
}
