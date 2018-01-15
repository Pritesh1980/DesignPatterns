package net.pritesh.patterns.behavioral.strategy;

public class ConsistentDatabaseStrategy extends DatabaseStrategy
{
    @Override
    public String doStuff( Database db )
    {
        return "CONSISTENT";
    }
}
