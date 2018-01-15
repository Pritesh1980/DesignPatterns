package net.pritesh.patterns.behavioral.visitor;

public interface ConsumableVisitor
{
    String visit( Milk milk );

    String visit( Bread bread );

    String visit( ShoppingCart shoppingCart );
}
