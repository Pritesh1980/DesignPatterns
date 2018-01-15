package net.pritesh.patterns.behavioral.command;


public class ToggleCommand implements Command
{
    private final Light light;

    public ToggleCommand( Light light )
    {
        this.light = light;
    }

    @Override
    public String execute()
    {
        return light.toggle();
    }
}
