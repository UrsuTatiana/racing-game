package com.racinggame;

public class App {
    public static void main( String[] args )
    {


        Game game = new Game();
        game.start();



       /* Engine autoVehicleEngine = new Engine();
        autoVehicleEngine.manufacturer = "VW";

        AutoVehicle autoVehicle = new AutoVehicle(autoVehicleEngine);

        Engine engine = new Engine();
        Car car = new Car(engine);

        Engine engine1 = new Engine();
        engine1.manufacturer = "Ferrari";
        engine1.capacity = 3000;

       Car carReference = new Car(engine1);
       carReference.name = "Ferrari";
       carReference.maxSpeed = 300;
       carReference.fuelLevel = 60;
       carReference.mileage = 12.5;
       carReference.totalTraveledDistance = 0;
       carReference.damaged = false;
       carReference.doorCount = 1;
       carReference.color = "Red";



        System.out.println("Engine capacity: " + engine1.capacity);
        System.out.println("Car engine capacity: " + carReference.engine.capacity);


        engine1.capacity = 4000;

        System.out.println("Car engine capacity after update: " + carReference.engine.capacity);

        System.out.println("Properties of car: " + carReference.name);
        System.out.println("Max speed: " + carReference.maxSpeed);
        System.out.println("Fuel level: " + carReference.fuelLevel);
        System.out.println("Mileage: " + carReference.mileage);
        System.out.println("Total distance: " + carReference.totalTraveledDistance);
        System.out.println("Damaged: " + carReference.damaged);
        System.out.println("Door count: " + carReference.doorCount);
        System.out.println("Colour: " + carReference.color);



        Car car2 = new Car(new Engine());
        car2.name = "Renault";
        car2.fuelLevel = 70;
        car2.totalTraveledDistance = 100;
        car2.maxSpeed = 300;
        car2.mileage = 10;

        car2.engine.capacity = 2000;

        System.out.println("Properties of Car2: " + car2.name);
        System.out.println("Max speed: " + car2.maxSpeed);
        System.out.println("Fuel level: " + car2.fuelLevel);
        System.out.println("Mileage: " + car2.mileage);
        System.out.println("Total distance: " + car2.totalTraveledDistance);
        System.out.println("Damaged: " + car2.damaged);
        System.out.println("Door count: " + car2.doorCount);
        System.out.println("Colour: " + car2.color);



        double distanceForCar1 = carReference.accelerate(60,1);

        double distanceForCar2 = car2.accelerate(130,1);

        System.out.println("Engine manufacturer name before repair: " + carReference.engine.manufacturer );
        Mechanic mechanic = new Mechanic();
        mechanic.repair(carReference);
        System.out.println("Engine manufacturer name after repair: " + carReference.engine.manufacturer );
*/

       /* System.out.println("Initial name for car1: " + carReference.name);

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

        System.out.println(carReference.name);*/

        /*System.out.println("modulo example");
        System.out.println(4%2);*/


    }
}
