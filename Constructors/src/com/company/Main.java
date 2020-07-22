package com.company;

import java.lang.reflect.AccessibleObject;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();//111111, 100,
                //"John Smith", "john@mail.com",
               // " 02 11 111");

        System.out.println(account.getAccountNumber());
        account.depositFunds(200);
        account.withdrawFunds(305);
        account.withdrawFunds(300);
        System.out.println(account.getBalance());


//        BankAccount newAccount = new BankAccount("Tim", "tim@email.com", "2345");
//
//        VipCustomer customer1 = new VipCustomer();
//        System.out.println(customer1.getName());
//
//        VipCustomer customer2 = new VipCustomer("Bob", 2500);
//        System.out.println(customer2.getName());
//
//        VipCustomer customer3 = new VipCustomer("Tim", 100.00, "tim@mail.com");
//        System.out.println(customer3.getName());

//        Point first = new Point(6, 5);
//        Point second = new Point(3, 1);
//        System.out.println("distance(0,0)= " + first.distance());
//        System.out.println("distance(second)= " + first.distance(second));
//        System.out.println("distance(2,2)= " + first.distance(2, 2));
//        Point point = new Point();
//        System.out.println("distance()= " + point.distance());

//        Carpet carpet = new Carpet(3.5);
//        Floor floor = new Floor(2.75, 4.0);
//        Calculator calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());
//        carpet = new Carpet(1.5);
//        floor = new Floor(5.4, 4.5);
//        calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());

    }
}
