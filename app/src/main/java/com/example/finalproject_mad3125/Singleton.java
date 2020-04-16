package com.example.finalproject_mad3125;

import java.util.ArrayList;

public class Singleton
{
    private static Singleton myObj;

    ArrayList<Customer> arrayListCustomer = new ArrayList<>();
    private Singleton()
    {
        arrayListCustomer = new ArrayList<>();
    }
}
