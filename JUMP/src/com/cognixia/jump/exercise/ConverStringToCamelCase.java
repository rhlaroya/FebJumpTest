package com.cognixia.jump.exercise;

import java.lang.StringBuilder;
class ConverStringToCamelCase{
  public static void main(String[] args) {
	System.out.println(toCamelCase("pop-art_shirt"));
//	Integer pin = 0; Integer.
}

  static String toCamelCase(String s){
	String word;
	String [] hold = new String[s.length()];
    if(s.contains("-")) {
    	s.split("-");
    } else if(s.contains("_")) {
    	s.split("_");
    }
    return word = s.toUpperCase();
  }
}

