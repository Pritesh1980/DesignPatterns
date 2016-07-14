package net.pritesh.patterns.structural.Facade;


public class LocalLogAggregator implements LogAggregator
{
    @Override
    public String getLogs()
    {
        return "All logs from local machine";
    }
}
