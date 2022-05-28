package com.Object;

public class CompareObject {

	String name;
	int number;

	public CompareObject() {
	}

	public CompareObject(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}

	public static void main(String[] args) {
		System.out.println("Case 1: For Empty Object");
		// Create Multiple Object of class
		CompareObject obj1 = new CompareObject();
		CompareObject obj2 = new CompareObject();
		CompareObject obj3 = new CompareObject();

		// Compare class Object by using equals method.

		System.out.println(obj1.equals(obj2));// false
		System.out.println(obj2.equals(obj3));// false
		System.out.println(obj1.equals(obj3));// false

		// Compare class Object by using Hashcode method.
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());

		System.out.println("Case 2: For Object with Parameter");
		// Create Multiple Object of class
		CompareObject obj4 = new CompareObject("sanjay", 15);
		CompareObject obj5 = new CompareObject("shraddha", 7);
		CompareObject obj6 = new CompareObject("sanjay", 15);

		// Compare class Object by using equals method.

		System.out.println(obj4.equals(obj5));// false
		System.out.println(obj5.equals(obj6));// false
		System.out.println(obj4.equals(obj6));// false
		obj4 = obj6;
		System.out.println(obj4.equals(obj6));// true
		// Compare class Object by using Hashcode method.
		System.out.println(obj4.hashCode());
		System.out.println(obj5.hashCode());
		System.out.println(obj6.hashCode());

	}

}
