package net.pritesh.patterns.structural.Facade;

/**
 * Main interface for which subclasses will be created.
 * Those subclasses will be Facade-ed
 */
public interface LogAggregator
{
    public String getLogs();
}
