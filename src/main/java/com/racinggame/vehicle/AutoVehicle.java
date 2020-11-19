package com.racinggame.vehicle;

import com.racinggame.Engine;

public class AutoVehicle extends  Vehicle {

    // has a relationship or aggregation
    private Engine engine;


    // constructor overloading
    public AutoVehicle(){
        this(new Engine());
        //engine = new Engine();
    }


   public AutoVehicle(Engine engine){
       this.engine = engine;

       System.out.println("Custom constructor");
    }


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}