package net.pritesh.patterns.structural.decorator;


public class OreganoDecorator extends PizzaDecorator
{
    public OreganoDecorator( Pizza customPizza )
    {
        super(customPizza);
    }

    @Override
    public String make()
    {
        return customPizza.make() + addOregano();
    }

    private String addOregano()
    {
        return " + oregano";
    }
}
