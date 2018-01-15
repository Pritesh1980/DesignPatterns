package net.pritesh.patterns.behavioral.strategy;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class StrategyDemoTest
{

    @Test
    public void testFastDb()
    {
        // Given
        Database fastDb = new Database(new FastDatabaseStrategy());

        // Then
        assertTrue(fastDb.doStuff().equals("FAST"));
    }


    @Test
    public void testConsistentDb()
    {
        // Given
        Database consistentDb = new Database(new ConsistentDatabaseStrategy());

        // Then
        assertTrue(consistentDb.doStuff().equals("CONSISTENT"));
    }

    @Test
    public void testAvailableDb()
    {
        // Given
        Database availableDb = new Database(new AvailableDatabaseStrategy());

        // Then
        assertTrue(availableDb.doStuff().equals("AVAILABLE"));
    }
}
