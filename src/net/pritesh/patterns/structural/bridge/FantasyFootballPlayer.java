package net.pritesh.patterns.structural.bridge;

/**
 * Basic POJO representing a Fantasy Football Player.
 */
public class FantasyFootballPlayer
{
    private String name;
    private int age;
    private String club;
    private String position;
    private double value;

    public FantasyFootballPlayer( String name, int age, String club, String position, double value )
    {
        this.name = name;
        this.age = age;
        this.club = club;
        this.position = position;
        this.value = value;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getClub()
    {
        return club;
    }

    public String getPosition()
    {
        return position;
    }

    public double getValue()
    {
        return value;
    }
}
