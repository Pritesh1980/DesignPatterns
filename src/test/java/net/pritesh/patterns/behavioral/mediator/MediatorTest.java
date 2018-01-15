package net.pritesh.patterns.behavioral.mediator;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MediatorTest
{

    @Test
    public void testMediator()
    {
        // Given
        Mediator mediator = new Mediator();
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();
        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);
        Command turnOffAllLightsCommand = new AllLightsOffCommand(mediator);

        // When
        bedroomLight.toggle();
        String out = turnOffAllLightsCommand.execute();

        // Then
        assertEquals( "OFF", out );
    }
}
