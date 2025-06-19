package com.modularlib.utils.impl;

import com.modularlib.utils.api.IStringutils;

public class stringUtils implements IStringutils {
	
	@override
	public boolean isNullorEmpty (String str) {
		return str == null ||  str.trim().isEmpty();
			}
	
	@override 
	public String capitalyze (String str) {
		if (isNullorEmpty(str)) return str;
		str = str.trim();
		return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
			}
	
	@override
	public String reverse (String str) {
	return new StringBuilder(str).reverse().toString();
	}

	@override
	public int countWords (String str) {
		if (str == null || str.trim().isEmpty()) return 0;

	    int count = 0;
	    boolean inWord = false;
	    str = str.trim();

	    for (int i = 0; i < str.length(); i++) {
	        if (Character.isWhitespace(str.charAt(i))) {
	            inWord = false;
       } else if (!inWord) {
	            inWord = true;
	            count++;
	        }
	    }

	    return count;	
	}

}
