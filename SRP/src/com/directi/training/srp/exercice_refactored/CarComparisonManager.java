package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarComparisonManager
{
    public Car getBestCar()
    {
        Car bestCar = null;
        for (Car car : _carsDb) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
