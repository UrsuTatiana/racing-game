package com.racinggame.competitor.vehicle;

import com.racinggame.competitor.Mobile;

import java.time.LocalDate;

public abstract class Vehicle implements Mobile {

    //class variables (static variables)
   private static  int totalVehicleCount;


    //instance variables
    private String name;
    private double fuelLevel;
    private double mileage;
    protected double totalTraveledDistance;
    private double maxSpeed;

    private boolean damaged;
    private String color;

    private LocalDate manufacturingDate = LocalDate.now();

    public Vehicle() {

        totalVehicleCount++;
    }

    @Override
    public boolean canMove() {
        return fuelLevel > 0 && !damaged;
    }

    //  method  overloading
    public double accelerate(double speed){
       // double distance = accelerate(speed,1);
        //return distance;   sau

        return accelerate(speed, 1);
    }

    public double accelerate(double speed, double durationInHours){

        if (!canMove()){
            System.out.println("you cannot accelerate");
            return 0;
        }

        if(speed > maxSpeed){
            System.out.println("Max speed exceeded.");
            return 0;
        }else if(speed == maxSpeed){
            System.out.println("Careful, max speed reached");
        }
        else {
            System.out.println("Valid speed entered");
        }

        //Ferrari is accelerating with 100km/h for 1h
        System.out.println(name + "is accelerating with" + speed + "km/h for" + durationInHours + "h");

        //local variable.
        double distance = speed * durationInHours;

        totalTraveledDistance = totalTraveledDistance + distance;
        // sau  totalTraveledDistance +=  distance;
        System.out.println("Total traveled distance for vehicle" + name + ": " + totalTraveledDistance);


        double mileageMultiplier = 1;
        if (speed > 120){
            mileageMultiplier = speed/100;
        }


        double usedFuel = distance * mileage * mileageMultiplier/100;

        fuelLevel = fuelLevel - usedFuel;
       // fuelLevel -= usedFuel
        System.out.println("Remaining fuel for vehicle" + name + ": " + fuelLevel);

        return distance;
    }


    protected Vehicle reset(){
        totalTraveledDistance = 0;
        damaged = false;

        return this;
    }

    public void setName(String name){
        this.name = name.trim();
    }

    public String getName(){
        return name;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getTotalTraveledDistance() {
        return totalTraveledDistance;
    }

    public void setTotalTraveledDistance(double totalTraveledDistance) {
        this.totalTraveledDistance = totalTraveledDistance;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isDamaged() {
        return damaged;
    }

    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    // read only property(doar citim nu si atribuim)
    public static int getTotalVehicleCount() {
        return totalVehicleCount;
    }
/*

    private String name;
    private double fuelLevel;
    private double mileage;
    protected double totalTraveledDistance;
    private double maxSpeed;
*/


    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", mileage=" + mileage +
                ", totalTraveledDistance=" + totalTraveledDistance +
                ", maxSpeed=" + maxSpeed +
                ", damaged=" + damaged +
                ", color='" + color + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                '}';
    }
}
