package net.pritesh.patterns.behavioral.state;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PrinterTest
{

    @Test
    public void progress()
    {
        // Given
        Printer printer = new Printer();

        // Then
        assertTrue("Printer in incorrect state", printer.toString().equals("Printer is off"));

        // When
        printer.progress();

        // Then
        assertTrue("Printer in incorrect state", printer.toString().equals("Printer is heating"));

        // When
        printer.progress();

        // Then
        assertTrue("Printer in incorrect state", printer.toString().equals("Printer is printing"));

        // When
        printer.progress();

        // Then
        assertTrue("Printer in incorrect state", printer.toString().equals("Printer is off"));
    }
}
