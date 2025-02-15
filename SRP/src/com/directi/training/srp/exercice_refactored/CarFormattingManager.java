package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarFormattingManager
{
    public String buildCarsNames()
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : _carsDb) {
            sb.append(car.getCarName());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
