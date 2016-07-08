package net.pritesh.patterns.creational.prototype;


public class Warlock extends GameCharacter
{
    private String staff;
    private String demon;

    public String getDemon()
    {
        return demon;
    }

    public void setDemon( String demon )
    {
        this.demon = demon;
    }

    public String getStaff()
    {
        return staff;
    }

    public void setStaff( String staff )
    {
        this.staff = staff;
    }

}
