package net.pritesh.patterns.structural.Facade;


public class AwsLogAggregator implements LogAggregator
{
    @Override
    public String getLogs()
    {
        return "All logs from AWS";
    }
}
