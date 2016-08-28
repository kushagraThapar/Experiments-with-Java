package com.dhawal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by kushagrathapar on 4/28/16 at 6:22 PM.
 */
public class UberInterview {
    public List<Integer> elevator(ArrayList<Integer> floors, int direction, int currentFloor) {
        List<Integer> outputOrder = new ArrayList<>();
        List<Integer> upwardFloors = new ArrayList<>();
        List<Integer> downwardFloors = new ArrayList<>();
        Set<Integer> visitedFloors = new HashSet<>();
        for (Integer i : floors) {
            if (direction > 0) {
                if (i > currentFloor) {
                    upwardFloors.add(i);
                }
            } else {
                if (i < currentFloor) {
                    downwardFloors.add(i);
                }
            }
        }
        int max = 0;
        for (int i = currentFloor; visitedFloors.size() == floors.size(); i = i + direction) {
            direction = -1 * direction;
        }
        return outputOrder;
    }
}

