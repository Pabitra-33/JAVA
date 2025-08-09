package com.demoExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionQuantifiers {
	public static void main(String[] args) {
		//Pattern p = Pattern.compile("a");//0-------a //2-------a //3-------a
		Pattern p = Pattern.compile("a+");//0-------a //2-------aa //5-------aaa
		//Pattern p = Pattern.compile("a*");//0-------a //1-------//2-------aa
		//Pattern p = Pattern.compile("a?");
		
		Matcher m = p.matcher("abaabaaab");
		while(m.find()) {
			System.out.println(m.start()+"-------"+m.group());
		}
	}
}