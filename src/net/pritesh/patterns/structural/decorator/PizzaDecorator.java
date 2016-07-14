package net.pritesh.patterns.structural.decorator;


/**
 * The decorator. Contains an instance of the object being decorated.
 * Subclass implementations of {@link #make()} do the actual decorating.
 */
public abstract class PizzaDecorator implements Pizza
{
    protected Pizza customPizza;

    public PizzaDecorator( Pizza pizza )
    {
        this.customPizza = pizza;
    }

    public String make()
    {
        return customPizza.make();
    }

}
