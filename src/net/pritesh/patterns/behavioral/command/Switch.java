package net.pritesh.patterns.behavioral.command;

// Invoker
public class Switch
{
    public String storeAndExecute(Command command)
    {
        return command.execute();
    }

}
