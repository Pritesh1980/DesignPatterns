package net.pritesh.patterns.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class StaticSingletonTest
{
    @Test
    public void getInstance() throws Exception
    {
        // Given

        // When
        StaticSingleton singleton_1 = StaticSingleton.getInstance();
        StaticSingleton singleton_2 = StaticSingleton.getInstance();

        // Then
        assertNotNull(singleton_1);
        assertNotNull(singleton_2);

        assertEquals(singleton_1, singleton_2);

    }

}
