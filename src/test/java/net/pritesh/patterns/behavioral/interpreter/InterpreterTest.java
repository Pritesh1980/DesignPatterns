package net.pritesh.patterns.behavioral.interpreter;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;


public class InterpreterTest
{


    @BeforeClass
    public static void setupExpressions()
    {

    }

    @Test
    public void interpretTrue() throws Exception
    {
        // Given
        Expression terminal1 = new TerminalExpression("Linux");
        String context = "Linux";

        // When
        boolean res = terminal1.interpret(context);

        // Then
        assertTrue(res);
    }

    @Test
    public void interpretFalse() throws Exception
    {
        // Given
        Expression terminal1 = new TerminalExpression("Linux");
        String context = "OSX";

        // When
        boolean res = terminal1.interpret(context);

        // Then
        assertFalse(res);
    }

    @Test
    public void interpretOr() throws Exception
    {
        // Given
        Expression terminal1 = new TerminalExpression("Linux");
        Expression terminal2 = new TerminalExpression("OSX");

        Expression or1 = new OrExpression(terminal1,terminal2);
        String context = "Linux";


        // When
        boolean res = or1.interpret(context);

        // Then
        assertTrue(res);
    }

    @Test
    public void interpretAnd() throws Exception
    {
        // Given
        Expression terminal1 = new TerminalExpression("Linux");
        Expression terminal2 = new TerminalExpression("OSX");

        Expression and1 = new AndExpression(terminal1,terminal2);
        String context = "Linux";


        // When
        boolean res = and1.interpret(context);

        // Then
        assertFalse(res);
    }

    @Test
    public void interpretCombination() throws Exception
    {
        // Given
        Expression linux = new TerminalExpression("Linux");
        Expression osx = new TerminalExpression("OSX");
        Expression windows = new TerminalExpression("Windows");

        Expression unix = new AndExpression(linux, osx);
        Expression validOs = new OrExpression(windows, unix);

        // When
        String context = "Linux";
        boolean res = validOs.interpret(context);

        // Then
        assertFalse(res);

        // When
        context = "OSX";
        res = validOs.interpret(context);

        // Then
        assertFalse(res);

        // When
        context = "Linux OSX";
        res = validOs.interpret(context);

        // Then
        assertTrue(res);

        // When
        context = "Windows";
        res = validOs.interpret(context);

        // Then
        assertTrue(res);
    }
}
