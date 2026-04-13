package com.client;

import com.singleton.LoggerSingleton;

public class Demo {

	public static void main(String[] args) {
		LoggerSingleton log1=LoggerSingleton.getInstance();
		LoggerSingleton log2=LoggerSingleton.getInstance();
		System.out.println(log1==log2);
	}

}
