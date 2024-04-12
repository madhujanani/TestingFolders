package org.variabletypes;

public class LocalVariables {
	public void first() {
		int a=10;
		String s="java";
		System.out.println("method First :"+a+"  "+s);
	}
	public void second() {
		int a=20;
		String s="Development";
		System.out.println("method Second :"+a+"  "+s);
	}
	public void third() {
		int a=30;
		String s="Programming";
		System.out.println("method third :"+a+"  "+s);
	}
	public static void main(String[] args) {
		LocalVariables lv1 = new LocalVariables();
		lv1.first();
		lv1.second();
		lv1.third();
	}

}
