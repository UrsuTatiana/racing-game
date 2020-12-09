package com.racinggame.competitor;

import java.util.concurrent.ThreadLocalRandom;

public class Hulk implements Mobile{

    private double totalTraveledDistance;
    private boolean cooperative;

    public Hulk() {
       int randomNumber =  ThreadLocalRandom.current().nextInt(0,100);
       if (randomNumber <=19){
           cooperative = true;
       }
    }

    @Override
    public double accelerate(double speed, double durationInHour) {
        System.out.println("Hulk is accelerating with "+ ":" + speed + "km/h for" + durationInHour + "h");

        double distance = speed * durationInHour;

        totalTraveledDistance += distance;

        return distance;
    }

    @Override
    public double getTotalTraveledDistance() {
        return totalTraveledDistance;
    }

    @Override
    public boolean canMove() {


        return false;
    }

    @Override
    public String getName() {
        return "Hulk";
    }
}
