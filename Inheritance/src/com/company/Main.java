package com.company;

public class Main {

    public static void main(String[] args) {
	    Animal animal = new Animal("Animal", 1, 1, 5, 5);

	    Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");

	    //dog.eat();
	    dog.walk();
	    //dog.run();

		House blueHouse = new House("blue");
		House anotherHouse = blueHouse;

		System.out.println(blueHouse.getColor());
		System.out.println(anotherHouse.getColor());

		anotherHouse.setColor("yellow");

		System.out.println(blueHouse.getColor());
		System.out.println(anotherHouse.getColor());

		System.out.println("*************");
		House greenHouse = new House("green");
		anotherHouse = greenHouse;
		System.out.println(blueHouse.getColor());
		System.out.println(anotherHouse.getColor());
		System.out.println(greenHouse.getColor());


	}
}
