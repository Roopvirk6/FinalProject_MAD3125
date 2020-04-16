package com.example.finalproject_mad3125;

import java.io.Serializable;

public class Mobile extends Bill implements Serializable
{
    private String manufacturerName;
    private String planName;
    private int mobileNumber;
    private int internetGBUesd;
    private int minutes;

    public Mobile()
    {
        super();
    }

    public Mobile(int billID, String billDate, String billType, double billAmount, String manufacturerName, String planName,
                  int mobileNumber, int internetGBUesd, int minutes)
    {
        super(billID,billDate,"Mobile",billAmount);
        this.manufacturerName = manufacturerName;
        this.planName = planName;
        this.mobileNumber = mobileNumber;
        this.internetGBUesd = internetGBUesd;
        this.minutes = minutes;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getInternetGBUesd() {
        return internetGBUesd;
    }

    public void setInternetGBUesd(int internetGBUesd) {
        this.internetGBUesd = internetGBUesd;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }


    
}
