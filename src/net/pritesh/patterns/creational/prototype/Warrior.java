package net.pritesh.patterns.creational.prototype;


public class Warrior extends GameCharacter
{
    private String sword;
    private String shield;

    public String getShield()
    {
        return shield;
    }

    public void setShield( String shield )
    {
        this.shield = shield;
    }

    public String getSword()
    {
        return sword;
    }

    public void setSword( String sword )
    {
        this.sword = sword;
    }

}
