package com.tonyrichbuilder;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by localadmin on 7/27/16.
 */
public class House {

    private String name;
    private ArrayList<Room> rooms = new ArrayList<>();

    public String getName() {
        return name;
    }

    public House(String name) {
        this.name = name;

    }

    public void addRoom(Room newRoom) throws DuplicateRoomNameException {

        if (rooms.isEmpty()){
            rooms.add(newRoom);
        }else if (isValidNameforRoom(newRoom.getName())){
            rooms.add(newRoom);
        } else {
            throw new DuplicateRoomNameException("There is a room with the same name " + newRoom.getName() + " in the house.");
        }
    }

    public boolean isValidNameforRoom(String roomName){

        for (Iterator<Room> it = rooms.iterator(); it.hasNext(); ){
            if (it.next().getName().equals(roomName)) {
                return false;
            }
        }

        return true;
    }

    public double getTotalCost(){
        double total = 0;
        for (Room r: rooms){
            total += r.getTotalCost();
        }
        return total;
    }
}
