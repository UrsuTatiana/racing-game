package com.racinggame;

public class App {
    public static void main( String[] args )
    {
       Car carReference = new Car();
       carReference.name = "Ferrari";
       carReference.maxSpeed = 300;
       carReference.fuelLevel = 60;
       carReference.mileage = 12.5;
       carReference.totalTraveledDistance = 0;
       carReference.damaged = true;
       carReference.doorCount = 1;
       carReference.color = "Red";

        System.out.println("Properties of car: " + carReference.name);
        System.out.println("Max speed: " + carReference.maxSpeed);
        System.out.println("Fuel level: " + carReference.fuelLevel);
        System.out.println("Mileage: " + carReference.mileage);
        System.out.println("Total distance: " + carReference.totalTraveledDistance);
        System.out.println("Damaged: " + carReference.damaged);
        System.out.println("Door count: " + carReference.doorCount);
        System.out.println("Colour: " + carReference.color);

        
        Car car2 = new Car();
        car2.name = "Renault";
        car2.fuelLevel = 70;
        car2.totalTraveledDistance = 100;

        System.out.println("Properties of Car2: " + car2.name);
        System.out.println("Max speed: " + car2.maxSpeed);
        System.out.println("Fuel level: " + car2.fuelLevel);
        System.out.println("Mileage: " + car2.mileage);
        System.out.println("Total distance: " + car2.totalTraveledDistance);
        System.out.println("Damaged: " + car2.damaged);
        System.out.println("Door count: " + car2.doorCount);
        System.out.println("Colour: " + car2.color);


        System.out.println("Initial name for car1: " + carReference.name);

        carReference.name = "Audi";
        System.out.println("Changed name for car1: " + carReference.name);


        carReference = new Car();
        System.out.println("Name of new car; "+ carReference.name);
        carReference.name = "BMW";

        carReference = car2;
        System.out.println("Name of car referenced from 2 variables carReference: " + carReference.name);
        System.out.println("Name of car referenced from 2 variables car2: " + car2.name);

        car2.name = "Dacia";
        System.out.println("Updated name of car referenced from 2 variables carReference: " + car2.name);
        System.out.println("Updated name of car referenced from 2 variables car2: " + car2.name);

        car2 = null;

        System.out.println(carReference.name);


    }
}
