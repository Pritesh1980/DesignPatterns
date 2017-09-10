package net.pritesh.patterns.behavioral.memento;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class PrinterCaretakerTest
{
    @Test
    public void testHistory()
    {
        // Given
        PrinterCaretaker caretaker = new PrinterCaretaker();
        PrinterSetting setting = new PrinterSetting("PLA", 190, 50.0);

        //System.out.println("Setting before save: " + setting);


        // When
        caretaker.save(setting);
        setting.setSpeed(100.0);

        // Then
        assertEquals(setting.getSpeed(), 100.0);

        // When
        caretaker.save(setting);
        setting.setSpeed(120.0); // Not being saved
        caretaker.revert(setting);

        // Then
        assertEquals(setting.getSpeed(), 100.0);
    }

}
