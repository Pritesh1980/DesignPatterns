package net.pritesh.patterns.behavioral.visitor;

public class Bread implements Consumable
{
    @Override
    public String accept( ConsumableVisitor visitor )
    {
        return visitor.visit(this);
    }
}
