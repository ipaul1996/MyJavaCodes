package com.ip;

public class CharSequence1 {
	
	
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("abcd");
		CharSequence cs = sb.subSequence(0, 2);
		
		String s= (String) cs;
		StringBuffer sf = (StringBuffer) cs;
		
		
	}

}
