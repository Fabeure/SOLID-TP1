package com.directi.training.ocp.exercise;

public abstract class AbstractResource {
    public abstract int allocate();
    public abstract void free(int resourceId);
}