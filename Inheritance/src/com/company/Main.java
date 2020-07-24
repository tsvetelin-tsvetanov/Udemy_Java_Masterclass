package com.company;

import com.company.Car.Outlander;
import com.company.Cylinder.Circle;
import com.company.Cylinder.Cylinder;
import com.company.PoolArea.Cuboid;
import com.company.PoolArea.Rectangle;

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

		System.out.println("**************");

		Outlander outlander = new Outlander(36);
		outlander.accelerate(30);

		System.out.println("**************");
		Circle circle = new Circle(3.75);
		System.out.println("circle.radius= " + circle.getRadius());
		System.out.println("circle.area= " + circle.getArea());
		Cylinder cylinder = new Cylinder(5.55, 7.25);
		System.out.println("cylinder.radius= " + cylinder.getRadius());
		System.out.println("cylinder.height= " + cylinder.getHeight());
		System.out.println("cylinder.area= " + cylinder.getArea());
		System.out.println("cylinder.volume= " + cylinder.getVolume());

		System.out.println("**************");
		Rectangle rectangle = new Rectangle(5, 10);
		System.out.println("rectangle.width= " + rectangle.getWidth());
		System.out.println("rectangle.length= " + rectangle.getLength());
		System.out.println("rectangle.area= " + rectangle.getArea());
		Cuboid cuboid = new Cuboid(5,10,5);
		System.out.println("cuboid.width= " + cuboid.getWidth());
		System.out.println("cuboid.length= " + cuboid.getLength());
		System.out.println("cuboid.area= " + cuboid.getArea());
		System.out.println("cuboid.height= " + cuboid.getHeight());
		System.out.println("cuboid.volume= " + cuboid.getVolume());

	}
}
