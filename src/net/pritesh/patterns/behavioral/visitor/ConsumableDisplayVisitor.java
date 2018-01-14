package net.pritesh.patterns.behavioral.visitor;

public class ConsumableDisplayVisitor implements ConsumableVisitor
{
    @Override
    public String visit( Milk milk )
    {
        System.out.println("MILK");
        return "MILK";
    }

    @Override
    public String visit( Bread bread )
    {
        System.out.println("BREAD");
        return "BREAD";
    }

    @Override
    public String visit( ShoppingCart shoppingCart )
    {
        System.out.println("SHOPPINGCART");
        return "SHOPPINGCART";
    }
}
