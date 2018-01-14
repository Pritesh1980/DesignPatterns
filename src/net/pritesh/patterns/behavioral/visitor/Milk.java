package net.pritesh.patterns.behavioral.visitor;

public class Milk implements Consumable
{
    @Override
    public String accept( ConsumableVisitor visitor )
    {
        return visitor.visit(this);
    }
}
