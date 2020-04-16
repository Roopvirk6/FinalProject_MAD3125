package com.example.finalproject_mad3125;

import java.io.Serializable;

public class Mobile extends Bill implements Serializable {

        private String providerName;
        private int internetGB;

        public Mobile(){
            super();
        }

        public Mobile(int billID, String billDate, String billType,double billAmount, String providerName, int internetGB )
        {
            super(billID,billDate,"Mobile",billAmount);
            this.providerName = providerName;
            this.internetGB = internetGB;
        }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public int getInternetGB() {
        return internetGB;
    }

    public void setInternetGB(int internetGB) {
        this.internetGB = internetGB;
    }

    public void Bill()
        {

        }

        @Override
        public void printMyData()
        {
            System.out.println("Customer has a mobile bill of ");
            System.out.println("\tBILL ID:           " + getBillID());
            System.out.println("\tBILL TYPE:   " + getBillType());
            System.out.println("\tBill Date:           " + getBillDate());
            System.out.println("\tBill Amount:  " + getBillAmount());
            System.out.println("\tProvider Name:      " + getProviderName());
            System.out.println("\tInternet Used:       "+ getInternetGB()+"GB");
        }
    }


