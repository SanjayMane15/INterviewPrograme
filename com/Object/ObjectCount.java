package com.Object;

public class ObjectCount {

	public static int objectCount;

	public ObjectCount() {
		objectCount++;
	}

	public static void getObjectCount() {
		System.out.println("The Number of Object present are : " + objectCount);
	}

	public static void main(String[] args) {
		ObjectCount obj1 = new ObjectCount();
		ObjectCount obj2 = new ObjectCount();
		ObjectCount obj3 = new ObjectCount();
		ObjectCount obj4 = new ObjectCount();
		getObjectCount();

	}

}
