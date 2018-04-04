package com.example.firdasahidi.carbuddy.net;

/**
 * Created by FirdaRinoa on 11/7/17.
 */

import java.util.HashMap;
import java.util.Map;

/**
 * DTO for OBD readings.
 */
public class ObdReading {
    private double latitude, longitude, altitude;
    private long timestamp;
    private String vin; // vehicle id
    private Map<String, String> readings;

    public ObdReading() {
        readings = new HashMap<>();
    }

    public ObdReading(double latitude, double longitude, double altitude, long timestamp,
                      String vin, Map<String, String> readings) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.timestamp = timestamp;
        this.vin = vin;
        this.readings = readings;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vehicleid) {
        this.vin = vehicleid;
    }

    public Map<String, String> getReadings() {
        return readings;
    }

    public void setReadings(Map<String, String> readings) {
        this.readings = readings;
    }

    public String toString() {

        return "lat:" + latitude + ";" +
                "long:" + longitude + ";" +
                "alt:" + altitude + ";" +
                "vin:" + vin + ";" +
                "readings:" + readings.toString().substring(10).replace("}", "").replace(",", ";");
    }

}
