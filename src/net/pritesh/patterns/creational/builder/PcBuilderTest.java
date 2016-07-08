package net.pritesh.patterns.creational.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PcBuilderTest
{
    @Test
    public void buildTest() throws Exception
    {
        // Given
        final String CPU = "Intel";
        final String MEMORY = "32GB";
        final String GRAPHICS = "Nvidia M60";
        final String PSU = "750W";

        Pc.Builder builder = new Pc.Builder();

        // When
        builder.cpu(CPU).memory(MEMORY).graphics(GRAPHICS).psu(PSU);
        Pc pc = builder.build();

        // Then
        assertEquals(pc.getCpu(), CPU);
        assertEquals(pc.getMemory(), MEMORY);
        assertEquals(pc.getGraphics(), GRAPHICS);
        assertEquals(pc.getPsu(), PSU);
    }
}
