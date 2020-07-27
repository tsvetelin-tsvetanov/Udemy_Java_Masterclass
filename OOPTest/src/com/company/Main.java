package com.company;

public class Main {

    public static void main(String[] args) {
//        Hamburger hamburger = new Hamburger("Basic", "Sausage",
//                3.56, "White roll");
//        double price = hamburger.itmemizeHamburger();
//        hamburger.addHamburgerAddition1("Tomato", 0.27);
//        hamburger.addHamburgerAddition2("Lettuce", 0.75);
//        hamburger.addHamburgerAddition3("Cheese", 1.13);
//        System.out.println("Total burger price is " +
//                hamburger.itmemizeHamburger());
//
//        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
//        healthyBurger.itmemizeHamburger();
//        healthyBurger.addHealthAddition1("Egg", 5.43);
//        healthyBurger.addHealthAddition2("Lentils", 3.41);
//        healthyBurger.itmemizeHamburger();
//        System.out.println("Total healthy burger price is " +
//                healthyBurger.itmemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Total deluxe burger price is " +
                db.itmemizeHamburger());
    }
}
