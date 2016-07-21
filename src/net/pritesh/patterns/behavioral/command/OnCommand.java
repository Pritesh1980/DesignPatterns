package net.pritesh.patterns.behavioral.command;


public class OnCommand implements Command
{
    private final Light light;

    public OnCommand( Light light )
    {
        this.light = light;
    }

    @Override
    public String execute()
    {
        return light.on();
    }
}
