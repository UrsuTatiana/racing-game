package com.racinggame;

import com.racinggame.vehicle.AutoVehicle;
import com.racinggame.vehicle.Car;
import com.racinggame.vehicle.Vehicle;
import com.racinggame.vehicle.cheater.CheatingVehicle;

import java.util.*;


public class App {
    public static void main( String[] args ) {


        Game game = new Game();
       game.start();


        /*String userLanguage = "en";
        Map<String,String> descriptionTranslations = new HashMap<>();
        descriptionTranslations.put("en","Some description");
        descriptionTranslations.put("ro", "o descriere");

        String description = descriptionTranslations.get(userlanguage);
        System.out.println(description);

        System.out.println("Available translation");

        for(Map.Entry <String,String> entry:descriptionTranslations.entrySet()){
            System.out.println(entry.getKey()+ ":" + entry.getValue());
        }*/


        /*Set<String> cities = new HashSet<>();
        cities.add("Cluj");
        cities.add("Bucuresti");

        Iterator<String> citiesIterator = cities.iterator();
*/
       /* for (int i = 0 ; i< cities.size(); i++){
            String nextCity = citiesIterator.next();
            System.out.println(nextCity);
        }*/

       /* while(citiesIterator.hasNext()){
            System.out.println(citiesIterator.next());
        }*/
/*
        String firstCity = citiesIterator.next();
        String secondCity = citiesIterator.next();

        System.out.println(firstCity);
        System.out.println(secondCity);
        */

/*

        List<String> favoriteAuthor = new ArrayList<>();
        favoriteAuthor.add("Ion Creanga");
        favoriteAuthor.add("Mihai Eminescu");
        favoriteAuthor.add("Cogalniceanu");
        System.out.println(favoriteAuthor);

        boolean creangaFavorite = favoriteAuthor.contains("Ion Creanga");
        System.out.println(creangaFavorite);


        //wrapper classes
        List<Integer> intigerList = Arrays.asList(1,5,20);
*/

        //int firstNumber = intigerList.get(0);
                        // sau
        //Integer firstNumber = intigerList.get(0);



       /* String email = "flaviu@fasttrackit.org";
        String[] emailParts = email.split("@");

        System.out.println("First part: " + emailParts[0]);
        System.out.println("Second part: " + emailParts[1]);*/

        //Vehicle cheatingVehicle = new CheatingVehicle();
      //  cheatingVehicle.setName("Cheater");

        //  cheatingVehicle.accelerate(60,1);


        //Object type determines object implementation
        //cheatingVehicle.accelerate(60,1);


        //variable type determines what methods can be invoked  directly
        //type casting
       // if (cheatingVehicle instanceof CheatingVehicle) {
        //    ((CheatingVehicle) cheatingVehicle).cheat();
      //  }
        //sau

       // CheatingVehicle newVar = (CheatingVehicle) cheatingVehicle;
      //  newVar.cheat();



        // Example of invoking overloaded methods and constructors

      /* Engine engine = new Engine();
        engine.setManufacturer("Renault");
        engine.setCapacity(1400);


        AutoVehicle autoVehicle = new AutoVehicle(engine);

        AutoVehicle autoVehicle2 = new AutoVehicle();

        new Car();

        autoVehicle.accelerate(100);
        autoVehicle.accelerate(100,3);


        System.out.println("Engine capacity" +  engine.getCapacity());
        System.out.println(engine.getCapacity());
        System.out.println(engine);
*/

       //Vehicle vehicle1 = new Vehicle();
       //vehicle1.setName("Dacia");


    // vehicle1.totalVehicleCount = 1;

       //Vehicle vehicle2 = new Vehicle();
       //vehicle2.setName("Lada");

      // vehicle2.totalVehicleCount = 2;

      // Vehicle.totalVehicleCount = 3;

        //System.out.println("Total count from vehicle: " + vehicle1.getName() + ": "+ vehicle1.getTotalVehicleCount());
        //System.out.println("Total count from vehicle: " + vehicle2.getName() + ": "+ vehicle2.getTotalVehicleCount());
        //System.out.println("Total count from vehicle class: " + Vehicle.getTotalVehicleCount());



        //Engine autoVehicleEngine = new Engine();
        //autoVehicleEngine.setManufacturer("VW");

        //AutoVehicle autoVehicle = new AutoVehicle(autoVehicleEngine);

        //Engine engine = new Engine();
        //Car car = new Car(engine);

      /*  Engine engine1 = new Engine();
        engine1.setManufacturer("Ferrari");
        engine1.setCapacity(3000);

       Car carReference = new Car(engine1);
       carReference.setName("Ferrari");
       carReference.setMaxSpeed(300);
       carReference.setFuelLevel(60);
       carReference.setMileage(12.5);
       carReference.setTotalTraveledDistance(0);
       carReference.setDamaged(false);
       carReference.setDoorCount(1);
       carReference.setColor("Red");


        System.out.println(carReference);*/

      /*  System.out.println("Engine capacity: " + engine1.getCapacity());
        System.out.println("Car engine capacity: " + carReference.getEngine().getCapacity());


        engine1.setCapacity(4000);*/

    //       System.out.println("Car engine capacity after update: " + carReference.getEngine().getCapacity());

    //   System.out.println("Properties of car: " + carReference.getName());
    //   System.out.println("Max speed: " + carReference.getMaxSpeed());
    //   System.out.println("Fuel level: " + carReference.getFuelLevel());
    //   System.out.println("Mileage: " + carReference.getMileage());
    //   System.out.println("Total distance: " + carReference.getTotalTraveledDistance());
    //   System.out.println("Damaged: " + carReference.isDamaged());
    //   System.out.println("Door count: " + carReference.getDoorCount());
    //   System.out.println("Colour: " + carReference.getColor());



       //Car car2 = new Car(new Engine());
       //car2.setName("Renault");
       //car2.setFuelLevel(70);
       //car2.setTotalTraveledDistance(100);
       //car2.setMaxSpeed(300);
       //car2.setMileage(10);

       //car2.getEngine().setCapacity(2000);

       //System.out.println("Properties of Car2: " + car2.getName());
       //System.out.println("Max speed: " + car2.getMaxSpeed());
       //System.out.println("Fuel level: " + car2.getFuelLevel());
       //System.out.println("Mileage: " + car2.getMileage());
       //System.out.println("Total distance: " + car2.getTotalTraveledDistance());
       //System.out.println("Damaged: " + car2.isDamaged());
       //System.out.println("Door count: " + car2.getDoorCount());
       //System.out.println("Colour: " + car2.getColor());



       //double distanceForCar1 = carReference.accelerate(60,1);

       //double distanceForCar2 = car2.accelerate(130,1);

      //System.out.println("Engine manufacturer name before repair: " + carReference.getEngine().getManufacturer());
      //Mechanic mechanic = new Mechanic();
      //mechanic.repair(carReference);
      //System.out.println("Engine manufacturer name after repair: " + carReference.getEngine().getManufacturer());


      //system.out.println("Initial name for car1: " + carReference.getName());

      //carReference.setName("Audi");
      //System.out.println("Changed name for car1: " + carReference.getName());


      //carReference = new Car(new Engine());
      // System.out.println("Name of new car; "+ carReference.getName());
      // carReference.setName("BMW");

      // carReference = car2;
      // System.out.println("Name of car referenced from 2 variables carReference: " + carReference.getName());
      // System.out.println("Name of car referenced from 2 variables car2: " + car2.getName());

      // car2.setName("Dacia");
      // System.out.println("Updated name of car referenced from 2 variables carReference: " + car2.getName());
      // System.out.println("Updated name of car referenced from 2 variables car2: " + car2.getName());

      // car2 = null;

      // System.out.println(carReference.getName());

       // System.out.println("modulo example");
       // System.out.println(4%2);




    }
}
