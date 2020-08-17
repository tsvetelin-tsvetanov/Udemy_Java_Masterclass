package com.company;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers;

    public void addCustomer(Customer customer){
        if(!this.customers.contains(customer)){
            this.customers.add(customer);
        }
    }
}
