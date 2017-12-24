package com.example.android.quakereport;

/**
 * Created by LAPTOP on 24-12-2017.
 */

public class earthquake {

    private String Magnitude;
    private String Location;
    private String Date;
    public earthquake(String m,String L,String D)
    {
        Magnitude=m;
        Location=L;
        Date=D;
    }
    public String CallMagnitude()
    {
        return Magnitude;
    }
    public String CallLocation()
    {
        return Location;
    }
    public String CallDate()
    {
        return Date;
    }

}
