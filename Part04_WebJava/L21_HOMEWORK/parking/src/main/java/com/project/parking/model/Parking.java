package com.project.parking.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class Parking {

    private ConcurrentHashMap<Integer, Boolean> parking;

    public Parking() {
        parking = new ConcurrentHashMap<Integer, Boolean>();

        for (int i = 1; i < 21; i++) {
            parking.put(i, true);
        }
    }

    public ConcurrentHashMap<Integer, Boolean> getParking() {
        return parking;
    }

    public void setParking(ConcurrentHashMap<Integer, Boolean> parking) {
        this.parking = parking;
    }

    public ArrayList<Integer> getFreePlaces() {
        var freeList = new ArrayList<Integer>();

        for (Integer key : parking.keySet()) {
            if (parking.get(key))
                freeList.add(key);
        }

        return freeList;
    }

    public Integer setPlaceReserved() {
        if (!getFreePlaces().isEmpty()) {
            var place = getFreePlaces().get(0);
            parking.put(place, false);
            return place;
        }
        return -1;
    }

    public boolean setPlaceFree(Integer id) {
        if (!parking.get(id)) {
            parking.put(id, true);
            return true;
        }
        return false;
    }

}
