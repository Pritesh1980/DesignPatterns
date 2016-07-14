package net.pritesh.patterns.structural.Facade;


public class AzureLogAggregator implements LogAggregator
{
    @Override
    public String getLogs()
    {
        return "All logs from Azure";
    }
}
