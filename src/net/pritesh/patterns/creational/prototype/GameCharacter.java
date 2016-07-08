package net.pritesh.patterns.creational.prototype;


/**
 * A base character class containing common attributes
 */
public abstract class GameCharacter implements Cloneable
{
    private String type;

    private int strength;
    private int intellect;
    private int discipline;
    private int agility;

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    public String getType()
    {
        return type;
    }

    public void setType( String type )
    {
        this.type = type;
    }

    public int getStrength()
    {
        return strength;
    }

    public void setStrength( int strength )
    {
        this.strength = strength;
    }

    public int getIntellect()
    {
        return intellect;
    }

    public void setIntellect( int intellect )
    {
        this.intellect = intellect;
    }

    public int getDiscipline()
    {
        return discipline;
    }

    public void setDiscipline( int discipline )
    {
        this.discipline = discipline;
    }

    public int getAgility()
    {
        return agility;
    }

    public void setAgility( int agility )
    {
        this.agility = agility;
    }
}
