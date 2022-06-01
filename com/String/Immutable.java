package com.String;

public class Immutable {

	private int i;

	public Immutable(int i) {
		super();
		this.i = i;
	}

	public Immutable doModify(int i) {
		if (this.i == i) {
			return this;
		} else {
			return new Immutable(i);
		}
	}

	public static void main(String[] args) {

		Immutable obj1 = new Immutable(10);
		Immutable obj2 = obj1.doModify(15);
		Immutable obj3 = obj1.doModify(10);

	}

}
