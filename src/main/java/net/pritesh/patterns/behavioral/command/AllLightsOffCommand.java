package net.pritesh.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class AllLightsOffCommand implements Command
{
    private List<Light> lights = new ArrayList<>();

    public AllLightsOffCommand( List<Light> lights )
    {
        this.lights = lights;
    }

    @Override
    public String execute()
    {
        StringJoiner sj = new StringJoiner("-");

        for( Light light : lights)
        {
            sj.add(light.off());
        }

        return sj.toString();
    }
}

