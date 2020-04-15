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
    


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
}
