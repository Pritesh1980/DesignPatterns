package net.pritesh.patterns.structural.decorator;


public class PepperoniDecorator extends PizzaDecorator
{
    public PepperoniDecorator( Pizza customPizza )
    {
        super(customPizza);
    }

    @Override
    public String make()
    {
        return customPizza.make() + addPepperoni();
    }

    private String addPepperoni()
    {
        return " + pepperoni";
    }
}
