package com.directi.training.lsp.exercise;

public class ElectronicDuck extends Duck
{
    private boolean _on = false;

    @Override
    public void quack()
    {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            System.out.println("Electronic duck is off and cannot quack, please turn the duck on first");
        }
    }

    @Override
    public void swim()
    {
        if (_on) {
            System.out.println("Electronic duck swim");
        } else {
            System.out.println("Electronic duck is off and cannot swim, please turn the duck on first.");
        }
    }

    public void turnOn()
    {
        _on = true;
    }

    public void turnOff()
    {
        _on = false;
    }
}