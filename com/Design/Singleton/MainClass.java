package com.Design.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainClass {

	public static void main(String[] args) throws CloneNotSupportedException {

		/*
		 * Singleton s1 = new Singleton(); Singleton s2 = new Singleton();
		 * System.out.println("S1: " + s1.hashCode()); System.out.println("S2 : " +
		 * s2.hashCode());
		 */
		// Step-1 Object creation without new keyword
		Singleton s1 = Singleton.getSingletonObject();
		Singleton s2 = Singleton.getSingletonObject();
		System.out.println("S1 : " + s1.hashCode());
		System.out.println("S2 : " + s2.hashCode());
		// Step-2 Object Creation by using clone();
		Singleton s3 = (Singleton) s1.clone();
		System.out.println("S2 : " + s3.hashCode());
		// Step-3 Object Creation by using Class.forName() and newInstance();
		try {
			Class obj = Class.forName("com.Design.Singleton.Singleton");
			Singleton s4 = (Singleton) obj.newInstance();
			System.out.println("S2 : " + s4.hashCode());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// Step-4 Object Creation by using getConstructor() and newInstance();
		try {
			Singleton s5 = Singleton.class.getConstructor().newInstance();
			System.out.println("S2 : " + s5.hashCode());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// Step-5 Object Creation by using Deserialization
		try {
			Singleton single1 = Singleton.getSingletonObject();
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Singleton.txt"));
			oos.writeObject(single1);
			oos.flush();
			oos.close();
			System.out.println("Successfully Serialize");
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Singleton.txt"));
			Singleton single2 = (Singleton) ois.readObject();
			System.out.println("Successfully De-serialize");
			System.out.println("Single1 : " + single1.hashCode());
			System.out.println("Single 2: " + single2.hashCode());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
