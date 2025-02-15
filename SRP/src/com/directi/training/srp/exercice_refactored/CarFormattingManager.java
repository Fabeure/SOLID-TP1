package com.directi.training.srp.exercise;

import java.util.List;

public class CarFormattingManager
{
    public String buildCarsNames(List<Car> cars)
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.getCarName());
            sb.append(", ");
        }
        return sb.length() > 2 ? sb.substring(0, sb.length() - 2) : "";
    }
}