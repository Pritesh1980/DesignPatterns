package net.pritesh.patterns.behavioral.strategy;

public class AvailableDatabaseStrategy extends DatabaseStrategy
{
    @Override
    public String doStuff( Database db )
    {
        return "AVAILABLE";
    }
}
