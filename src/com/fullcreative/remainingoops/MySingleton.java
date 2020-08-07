package com.fullcreative.remainingoops;

public class MySingleton {
	
	private static MySingleton m = new MySingleton();
	
	private MySingleton() {
		
	}
	
	public static MySingleton myObj() {
		return m;
	}

}
