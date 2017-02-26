package com.codeclan.example.onestopshop;

import java.util.ArrayList;

/**
 * Created by user on 24/02/2017.
 */

public class Customer implements Payable {

    private ArrayList<String> methods;
    private double funds;

public Customer(ArrayList methods, double funds) {
    methods = new ArrayList<String>();
    setUpMethods();

}

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public String getPaymentMethod() {

    }
}
