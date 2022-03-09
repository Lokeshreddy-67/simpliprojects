package com.regex;
import java.util.regex.*;


public class Regex {
	public static void main(String[] args) {
		String pattern="[0-9]+";
		String check="Lokesh Reddy7";
		Pattern p=Pattern.compile(pattern);
		Matcher c=p.matcher(check);
		while(c.find())
			System.out.println(check.substring(c.start(),c.end()));
			
		}
		
		
	}

