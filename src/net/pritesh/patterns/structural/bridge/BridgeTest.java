package net.pritesh.patterns.structural.bridge;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BridgeTest
{
    private static FantasyFootballPlayer player1;
    private static FantasyFootballPlayer player2;
    private static Formatter htmlFormatter = new HtmlFormatter();
    private static Formatter jsonFormatter = new JsonFormatter();

    @BeforeClass
    public static void setup()
    {
        player1 = new FantasyFootballPlayer("Kun Aguero", 28, "MCY", "STR", 15);
        player2 = new FantasyFootballPlayer("Alexis Sanchez", 27, "ARS", "MID", 12);
    }

    @Test
    public void basicHtmlTest() throws Exception
    {
        // Given
        Printer basic = new BasicPrinter(player1);
        String expectedOutput = "<h1>Kun Aguero</h1><table><tr><td>Position</td><td>STR</td></tr><tr><td>Value</td><td>15.0</td></tr></table>";

        // When
        String output = basic.print(htmlFormatter);

        // Then
        assertEquals(expectedOutput, output);
    }

    @Test
    public void detailedHtmlTest() throws Exception
    {
        // Given
        Printer basic = new DetailedPrinter(player1);
        String expectedOutput = "<h1>Kun Aguero</h1><table><tr><td>Position</td><td>STR</td></tr><tr><td>Team</td><td>MCY</td></tr><tr><td>Value</td><td>15.0</td></tr><tr><td>Age</td><td>28</td></tr></table>";

        // When
        String output = basic.print(htmlFormatter);

        // Then
        assertEquals(expectedOutput, output);
    }

    @Test
    public void basicJsonTest() throws Exception
    {
        // Given
        Printer basic = new BasicPrinter(player2);
        String expectedOutput = "\"Alexis Sanchez\":{\n" +
                "\t\"Position\" : MID\",\n" +
                "\t\"Value\" : 12.0\",\n" +
                "}";

        // When
        String output = basic.print(jsonFormatter);

        // Then
        assertEquals(expectedOutput, output);
    }

    @Test
    public void detailedJsonTest() throws Exception
    {
        // Given
        Printer basic = new DetailedPrinter(player2);
        String expectedOutput = "\"Alexis Sanchez\":{\n" +
                "\t\"Position\" : MID\",\n" +
                "\t\"Team\" : ARS\",\n" +
                "\t\"Value\" : 12.0\",\n" +
                "\t\"Age\" : 27\",\n" +
                "}";

        // When
        String output = basic.print(jsonFormatter);

        // Then
        assertEquals(expectedOutput, output);
    }
}
