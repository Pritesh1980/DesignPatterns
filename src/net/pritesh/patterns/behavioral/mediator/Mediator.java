package net.pritesh.patterns.behavioral.mediator;


import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Mediator
{
    private List<Light> lights = new ArrayList<>();

    public void registerLight(Light light)
    {
        lights.add(light);
    }

    public String turnOffAllLights()
    {
        StringJoiner sj = new StringJoiner("-");

        for( Light light : lights )
        {
            if( light.isOn() )
            {
                sj.add(light.toggle());
            }
        }

        return sj.toString();
    }

    public String turnOnAllLights()
    {
        StringJoiner sj = new StringJoiner("-");

        for( Light light : lights )
        {
            if( !light.isOn() )
            {
                sj.add(light.toggle());
            }
        }

        return sj.toString();
    }
}
