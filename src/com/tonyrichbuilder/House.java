package com.tonyrichbuilder;

import java.util.ArrayList;

/**
 * Created by localadmin on 7/27/16.
 */
public class House {

    private String name;
    private ArrayList<Room> rooms = new ArrayList<>();

    public House(String name) {
        this.name = name;
    }

    public void addRoom(Room newRoom){

        for (Room r: rooms){
            if (!(r.getName().equals(newRoom.getName()))){
                rooms.add(newRoom);
            }
        }
    }

    public double getTotalCost(){
        double total = 0;
        for (Room r: rooms){
            total += r.getTotalCost();
        }
        return total;
    }
}
