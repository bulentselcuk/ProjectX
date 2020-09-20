package com.Automation.Pojos;


import com.google.gson.annotations.SerializedName;

/**
 {
 "title": "San Francisco",
 "location_type": "City",
 "woeid": 2487956,
 "latt_long": "37.777119, -122.41964"
 },
 */
public class sunCities {
    private String title;
    @SerializedName("location_type ")
    private String location;
    private String woeid;
    @SerializedName ( "latt_long" )
    private String lattlong;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title=title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location=location;
    }

    public String getWoeid() {
        return woeid;
    }

    public void setWoeid(String woeid) {
        this.woeid=woeid;
    }

    public String getLattlong() {
        return lattlong;
    }

    public void setLattlong(String lattlong) {
        this.lattlong=lattlong;
    }

    @Override
    public String toString() {
        return "sunCities{" +
                "title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", woeid='" + woeid + '\'' +
                ", lattlong='" + lattlong + '\'' +
                '}';
    }
}
