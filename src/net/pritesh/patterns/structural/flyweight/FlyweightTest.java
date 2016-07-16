package net.pritesh.patterns.structural.flyweight;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class FlyweightTest
{
    @Test
    public void process() throws Exception
    {
        // Given
        ExpensiveObjectInventory inventory = new ExpensiveObjectInventory();

        // When
        inventory.addShortcut("ObjectA", 1);
        inventory.addShortcut("ObjectB", 2);
        inventory.addShortcut("ObjectC", 3);
        inventory.addShortcut("ObjectA", 4);
        inventory.addShortcut("ObjectB", 5);

        String out = inventory.process();

        // Then
        assertFalse(out.isEmpty());
        assertEquals(5, inventory.countShortcuts());
        assertEquals(3, inventory.countExpensiveObjects());
    }

}
