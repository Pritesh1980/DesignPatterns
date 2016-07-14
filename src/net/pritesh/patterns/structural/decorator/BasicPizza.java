package net.pritesh.patterns.structural.decorator;


public class BasicPizza implements Pizza
{
    @Override
    public String make()
    {
        return "Cheese & Tomato Pizza";
    }
}
