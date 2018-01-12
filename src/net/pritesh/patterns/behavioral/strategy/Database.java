package net.pritesh.patterns.behavioral.strategy;

public class Database
{
    private DatabaseStrategy dbStrategy;

    public Database( DatabaseStrategy dbStrategy)
    {
        this.dbStrategy = dbStrategy;
    }

    public String doStuff()
    {
        return dbStrategy.doStuff(this);
    }
}
