package net.pritesh.patterns.structural.bridge;


public class PlayerAttribute
{
    private String name;
    private String value;

    public PlayerAttribute( String name, String value )
    {
        this.name = name;
        this.value = value;
    }

    public String getName()
    {
        return name;
    }

    public String getValue()
    {
        return value;
    }
}
