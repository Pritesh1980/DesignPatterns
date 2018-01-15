package net.pritesh.patterns.behavioral.mediator;

public class AllLightsOffCommand implements Command
{
    private Mediator mediator;

    public AllLightsOffCommand( Mediator med )
    {
        this.mediator = med;
    }

    @Override
    public String execute()
    {
        return mediator.turnOffAllLights();
    }
}
