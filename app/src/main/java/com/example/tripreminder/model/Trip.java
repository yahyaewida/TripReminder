package com.example.tripreminder.model;

import java.util.Date;
import java.util.Vector;

public class Trip {

    public static final int UPCOMING = 1;
    public static final int DONE = 2;

    private int tripId;
    private int tripStatus;
    private String tripName;
    private TripLocation startLocation;
    private TripLocation endLocation;
    private Vector<String> notes;
    private Date tripDate;

    public Trip() {
    }

    public Trip(int tripId, int tripStatus, String tripName, TripLocation startLocation,
                TripLocation endLocation, Vector<String> notes, Date tripDate) {
        this.tripId = tripId;
        this.tripStatus = tripStatus;
        this.tripName = tripName;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.notes = notes;
        this.tripDate = tripDate;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public int getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(int tripStatus) {
        this.tripStatus = tripStatus;
    }

    public String getTripName() {
        return tripName;
    }

    public void setTripName(String tripName) {
        this.tripName = tripName;
    }

    public TripLocation getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(TripLocation startLocation) {
        this.startLocation = startLocation;
    }

    public TripLocation getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(TripLocation endLocation) {
        this.endLocation = endLocation;
    }

    public Vector<String> getNotes() {
        return notes;
    }

    public void setNotes(Vector<String> notes) {
        this.notes = notes;
    }

    public Date getTripDate() {
        return tripDate;
    }

    public void setTripDate(Date tripDate) {
        this.tripDate = tripDate;
    }
}
