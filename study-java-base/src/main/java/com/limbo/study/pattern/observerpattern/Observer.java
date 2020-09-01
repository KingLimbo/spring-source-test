package com.limbo.study.pattern.observerpattern;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
