package net.pritesh.patterns.behavioral.visitor;

public interface Consumable
{
    public String accept(ConsumableVisitor visitor);
}
