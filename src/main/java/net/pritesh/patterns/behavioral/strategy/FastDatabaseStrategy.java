package net.pritesh.patterns.behavioral.strategy;

public class FastDatabaseStrategy extends DatabaseStrategy
{
    @Override
    public String doStuff( Database db )
    {
        return "FAST";
    }
}
