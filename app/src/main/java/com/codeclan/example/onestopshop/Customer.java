package com.codeclan.example.onestopshop;

import java.util.ArrayList;

/**
 * Created by user on 24/02/2017.
 */

public class Customer implements Payable {

    private ArrayList<String> methods;
    private double funds;

    //    constructor
    public Customer(ArrayList methods, double funds) {
        methods = new ArrayList<String>();
        setUpMethods();
    }

    //    copy of ArrayList
        public ArrayList<String> getMethods() {
            return new ArrayList<String>(methods);
    }

    //    methods
    public int getLength() {
        return methods.size();
    }

    public String getMethodsAtIndex() {
        return methods.get(index);
    }

    public String getPaymentMethod() {

    }

    private void setUpMethods() {

    }

//    getters
    public double getFunds() {
        return funds;
    }

//    setters
    public void setFunds(double funds) {
        this.funds = funds;
    }


}
