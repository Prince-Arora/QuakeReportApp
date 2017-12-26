package com.example.android.quakereport;

/**
 * Created by LAPTOP on 24-12-2017.
 */

public class earthquake {

    private double Magnitude;
    private String Location;
    private long Date;

    public earthquake(double m,String L,long D)
    {
        Magnitude=m;
        Location=L;
        Date=D;
    }
    public double CallMagnitude()
    {
        return Magnitude;
    }
    public String CallLocation()
    {
        return Location;
    }
    public long CallDate()
    {
        return Date;
    }

}
