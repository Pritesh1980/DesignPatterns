package net.pritesh.patterns.behavioral.observer.better;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueueToInspectTest
{

    @Test
    public void testQueueToInspect()
    {
        // Given
        Subject msgQueue = new QueueToInspect();
        PhoneClient phoneClient = new PhoneClient(msgQueue);

        // When
        phoneClient.addMessage("*");

        // Then
        assertEquals( "* [phone]", msgQueue.getState());
    }

}
