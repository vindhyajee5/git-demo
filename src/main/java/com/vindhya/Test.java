package com.vindhya;

public class Test {

	 private static void printdata(String data) {
	   if(Constant.DATA_TYPE.equals(data))
		System.out.println("data"+data);

	}
	public static void main(String[] args) {
		printdata("Hello");

	}

}
