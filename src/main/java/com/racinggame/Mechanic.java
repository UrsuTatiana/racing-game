package com.racinggame;

import com.racinggame.vehicle.AutoVehicle;

public class Mechanic {

    public void repair(AutoVehicle autoVehicle){

        autoVehicle.setEngine(new Engine());

        autoVehicle.setDamaged(false);

        // daca dorim sa scadem distanta parcursa cu 100 km la schimbarea motorului
        autoVehicle.setTotalTraveledDistance(autoVehicle.getTotalTraveledDistance() - 100);
    }
}

