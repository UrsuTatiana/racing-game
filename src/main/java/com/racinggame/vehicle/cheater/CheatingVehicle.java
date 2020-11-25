package com.racinggame.vehicle.cheater;

import com.racinggame.vehicle.Vehicle;

public class CheatingVehicle extends Vehicle {

    @Override
    public double accelerate(double speed, double durationInHours) {
        System.out.println(getName() + "is accelerating with" + speed + "km/h for" + durationInHours + "h");
        System.out.println("Cheater!!!");

        double distance = speed * durationInHours * 2;

        totalTraveledDistance += distance;

        System.out.println("Total traveled distance for vehicle" + getName() + ": " + totalTraveledDistance);

        return distance;

    }
//  method acces can be more permisive than in the parent class
    //co-variant return type
    @Override
    public CheatingVehicle reset() {
         super.reset();
         return this;
    }

    public void cheat(){
      //  totalTraveledDistance = totalTraveledDistance * 2;
         totalTraveledDistance *= 2;
        System.out.println("updated total distance: "  + totalTraveledDistance);
    }
}
