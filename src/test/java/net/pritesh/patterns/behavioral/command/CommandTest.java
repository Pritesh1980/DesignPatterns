package net.pritesh.patterns.behavioral.command;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class CommandTest
{
    @Test
    public void testOnCommand()
    {
        // Given
        Light light = new Light();
        Switch lightSwitch = new Switch();
        Command onCommand = new OnCommand(light);

        // When
        String out = lightSwitch.storeAndExecute(onCommand);

        // Then
        assertEquals(out,"ON");
    }

    @Test
    public void testToggleCommand()
    {
        // Given
        Light light = new Light();
        Switch lightSwitch = new Switch();
        Command toggleCommand = new ToggleCommand(light);

        // When
        String out = lightSwitch.storeAndExecute(toggleCommand);

        // Then
        assertTrue(out.equals("ON"));

        // When
        out = lightSwitch.storeAndExecute(toggleCommand);

        // Then
        assertEquals(out,"OFF");
    }

    @Test
    public void testAllOffCommand()
    {
        // Given
        Light bedroomLight = new Light();
        Light loungeLight = new Light();
        Switch lightSwitch = new Switch();
        Command toggleCommand = new ToggleCommand(loungeLight);

        List<Light> lights = new ArrayList<>();
        lights.add(bedroomLight);
        lights.add(loungeLight);

        Command allLightsCommand = new AllLightsOffCommand(lights);

        // When
        lightSwitch.storeAndExecute(toggleCommand);
        String out = lightSwitch.storeAndExecute(allLightsCommand);

        // Then
        assertEquals("OFF-OFF",out);
    }

}
