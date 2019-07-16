package com.limbo.learning.pattern.observerPattern;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
