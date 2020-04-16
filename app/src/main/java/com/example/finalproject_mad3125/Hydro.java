package com.example.finalproject_mad3125;

import java.io.Serializable;

public class Hydro extends Bill implements Serializable
{
    private String agencyName;
    private String unitConsumed;

    public Hydro()
    {
        super();
    }

    public Hydro(int billID, String billDate, String billType, double billAmount, String agencyName, String unitConsumed)
    {
        super(billID,billDate,"Hydro",billAmount);
        this.agencyName = agencyName;
        this.unitConsumed = unitConsumed;
    }

    

}
