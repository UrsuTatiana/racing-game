package com.racinggame;

public class AutoVehicle extends  Vehicle {

    // has a relationship or aggregation
    Engine engine;

   public AutoVehicle(Engine engine){
       this.engine = engine;
    }



}
