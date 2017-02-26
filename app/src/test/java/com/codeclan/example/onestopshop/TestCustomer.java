package com.codeclan.example.onestopshop;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 24/02/2017.
 */

public class TestCustomer {
    Customer customer;

    private ArrayList<String>methodList;
    private Method payment;

    @Before
    public void before() {
        methodList = new ArrayList<String>();
        methodList.add("Credit Card");
        methodList.add("Debit Card");
        methodList.add("Paypal");
        customer = new Customer(25.0);
    }

    @Test
    public void testGetLength() {
        assertEquals(3, payment.getMethods().size());
    }

    public void testGetPaymentMethod() {
        assertEquals("Credit Card", payment.getMethodsAtIndex(0));
    }
}
