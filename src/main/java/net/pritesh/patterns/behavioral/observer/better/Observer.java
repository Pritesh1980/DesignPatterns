package net.pritesh.patterns.behavioral.observer.better;

public abstract class Observer
{
    protected Subject subject;
    abstract void update();
}
