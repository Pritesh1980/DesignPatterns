package net.pritesh.patterns.structural.flyweight;


/**
 * An immutable object that we want to use in multiple places.
 */
public class ExpensiveObject
{
    String name;

    public ExpensiveObject( String name )
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
