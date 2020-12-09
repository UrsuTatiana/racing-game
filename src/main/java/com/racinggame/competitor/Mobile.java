package com.racinggame.competitor;

public interface Mobile {

    double accelerate(double speed, double durationInHour);

    double getTotalTraveledDistance();

    boolean canMove();

    String getName();
}
