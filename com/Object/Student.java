package com.Object;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*Object Creation- We can create Object by using following ways
1.By using new Keyword
2. By using clone();
3.By Using Deserialization
4.By using reflection newInstance() & Class.forName();
5.By using reflection newInstance() & Constructor();*/
public class Student implements Cloneable, Serializable {

	public static void main(String[] args) throws CloneNotSupportedException {
		// 1) By using new Keyword
		Student student1 = new Student();
		System.out.println(student1.hashCode());
		// 2)By using clone();
		Student student2 = (Student) student1.clone();
		System.out.println(student2.hashCode());
		// 3)By using Deserialization
		try {
			Student student3 = new Student();
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"));
			oos.writeObject(student3);
			oos.flush();
			oos.close();
			System.out.println(student3.hashCode());
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"));
			Student student4 = (Student) ois.readObject();
			System.out.println(student4.hashCode());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// 4)By using Reflection Class.forName();
		try {
			Class obj = Class.forName("com.Object.Student");
			Student student5 = (Student) obj.newInstance();
			System.out.println(student5.hashCode());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// 5)By using reflection Constructor();
		try {
			Student student6 = Student.class.getConstructor().newInstance();
			System.out.println(student6.hashCode());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
