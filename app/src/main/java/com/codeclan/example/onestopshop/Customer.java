package com.codeclan.example.onestopshop;

import java.util.ArrayList;

/**
 * Created by user on 24/02/2017.
 */

public class Customer implements Payable {

    private ArrayList<String> methods;
    private Double funds;

    //    constructor
    public Customer(ArrayList<String> methods, double funds) {
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

    public String getPaymentMethodAtIndex(int index) {
        return methods.get(index);
    }

    public String getPaymentMethod() {
        return "Not ready";
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
