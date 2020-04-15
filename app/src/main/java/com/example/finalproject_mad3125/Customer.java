package com.example.finalproject_mad3125;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Customer implements Serializable
{


    private int customerId;
    private String customerFirstName;
    private String customerLastName;
    private String customerEmailAddress;
    private int amount;
    private int custImage;
    private Bill bill;
    private String billType;

    

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

    public Customer()
    {

    }
    // Parcelling part
    public Customer(Parcel in){
        this.customerId = in.readInt();
        this.customerFirstName = in.readString();
        this.customerLastName = in.readString();
        this.customerEmailAddress = in.readString();
        this.amount = in.readInt();
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.customerId);
        dest.writeString(this.customerFirstName);
        dest.writeString(this.customerLastName);
        dest.writeString(this.customerEmailAddress);
        dest.writeInt(this.amount);

    }
    @Override
    public String toString() {
        return "Customer Name='" + customerFirstName + '\n' +
                "Customer Id='" + customerId + '\n' +
                "Bill Amount ='" + amount + '\n' +
                "Customer email = '" + customerEmailAddress + '\n' +
                "Customer last name = '" + customerLastName + '\n'
                ;
    }

}
