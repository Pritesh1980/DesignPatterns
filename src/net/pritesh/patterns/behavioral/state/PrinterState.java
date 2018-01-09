package net.pritesh.patterns.behavioral.state;

public abstract class PrinterState
{
    public void handleRequest()
    {
        System.out.println("Shouldn't be able to get here.");
    }
}
