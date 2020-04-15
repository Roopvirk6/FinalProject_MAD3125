package com.example.finalproject_mad3125;

import android.os.Parcel;
import android.os.Parcelable;

public class Customer implements Parcelable
{
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Customer createFromParcel(Parcel in) {
            return new Customer(in);
        }

        public Customer[] newArray(int size) {
            return new Customer[size];
        }
    };

    private int customerId;
    private String customerFirstName;
    private String customerLastName;
    private String customerEmailAddress;
    private int amount;
    private int custImage;

    public Customer(int customerId,
                  String customerFirstName, String customerLastName, String customerEmailAddress,int amount, int custImage) {
        this.customerId=customerId;
        this.customerFirstName=customerFirstName;
        this.customerLastName=customerLastName;
        this.customerEmailAddress=customerEmailAddress;
        this.amount=amount;
        this.custImage=custImage;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCustImage() {
        return custImage;
    }

    public void setCustImage(int custImage) {
        this.custImage = custImage;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
}
