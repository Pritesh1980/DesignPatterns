package net.pritesh.patterns.behavioral.chainOfResponsibility;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;


public class ChainOfResponsibilityTest
{
    private static UrgentRule urgentRule = new UrgentRule();
    private static LongEmailRule longEmailRule = new LongEmailRule();
    private static DefaultRule defaultRule = new DefaultRule();

    @BeforeClass
    public static void setupChain()
    {
        urgentRule.setSuccessor(longEmailRule);
        longEmailRule.setSuccessor(defaultRule);
    }

    @Test
    public void handleUrgentEmail() throws Exception
    {
        // Given
        Email email = new Email("", "urgent - please respond", "blah");

        // When
        String res = urgentRule.handleEmail(email);

        // Then
        assertTrue(res.equals("URGENT"));
    }

    @Test
    public void handleLongEmail() throws Exception
    {
        // Given
        Email email = new Email("", "blah", new String(new char[255]).replace('\u0000', 'X'));

        // When
        String res = urgentRule.handleEmail(email);

        // Then
        System.out.println(res);
        assertTrue(res.equals("LONG"));
    }

    @Test
    public void handleUrgentEmailWithLongBody() throws Exception
    {
        // Given
        Email email = new Email("", "urgent - please respond", new String(new char[255]).replace('\u0000', 'X'));

        // When
        String res = urgentRule.handleEmail(email);

        // Then
        assertTrue(res.equals("URGENT"));
    }

    @Test
    public void handleDefaultEmail() throws Exception
    {
        // Given
        Email email = new Email("", "foo", "bar");

        // When
        String res = urgentRule.handleEmail(email);

        // Then
        assertTrue(res.equals("DEFAULT"));
    }
}
