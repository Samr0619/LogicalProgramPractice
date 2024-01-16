package com.practice;

public class SingletonExample{

	public static void main(String[] args) {
		SingletonClass ins = SingletonClass.getInstance();
		SingletonClass ins2 = SingletonClass.getInstance();
		
		System.out.println(ins.toString());
		System.out.println(ins2.toString());
	}
}


class SingletonClass {
	
	private static SingletonClass instance;
	
	
	private SingletonClass() {
		
	}
	
	public static synchronized SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }

}
