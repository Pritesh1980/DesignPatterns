package net.pritesh.patterns.structural.facade;


import net.pritesh.patterns.structural.Facade.AwsLogAggregator;
import net.pritesh.patterns.structural.Facade.AzureLogAggregator;
import net.pritesh.patterns.structural.Facade.LocalLogAggregator;
import net.pritesh.patterns.structural.Facade.LogAggregatorFacade;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class LogAggregatorFacadeTest
{
    @Test
    public void testFacade()
    {
        // Given
        LogAggregatorFacade facade = new LogAggregatorFacade(   new LocalLogAggregator(),
                                                                new AwsLogAggregator(),
                                                                new AzureLogAggregator());
        final String expected = "All logs from local machine\n" +
                "All logs from AWS\n" +
                "All logs from Azure\n";

        // When
        String out = facade.getAllLogs();

        // Then
        assertTrue(String.format("%s does not match %s", out, expected), out.equals(expected));

    }

}
