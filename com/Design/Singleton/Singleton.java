package com.Design.Singleton;

import java.io.Serializable;

public class Singleton implements Cloneable,Serializable {

	private static Singleton singletonObject;

	private Singleton() {

	}

// To prevention from new Keyword
	public static Singleton getSingletonObject() {
		synchronized (Singleton.class) { // prevention in multithreading
			if (singletonObject == null) {
				return singletonObject = new Singleton();
			} else {
				return singletonObject;
			}

		}

	}
	//To prevention from clone();
	@Override
	public Object clone() throws CloneNotSupportedException {
		//return super.clone();
		return singletonObject;
	}
	
	public Object readResolve() {
		return singletonObject;
	}

}
