package net.pritesh.patterns.structural.decorator;


import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class DecoratorTest
{
    @Test
    public void testSingleDecorator()
    {
        // Given
        Pizza pizza = new PepperoniDecorator(new BasicPizza());
        final String expected = "Cheese & Tomato Pizza + pepperoni";

        // When
        String out = pizza.make();

        // Then
        assertTrue(String.format("%s does not match %s", out, expected),out.equals(expected));
    }

    @Test
    public void testTwoDecorators()
    {
        // Given
        Pizza pizza = new OreganoDecorator(new PepperoniDecorator(new BasicPizza()));
        final String expected = "Cheese & Tomato Pizza + pepperoni + oregano";

        // When
        String out = pizza.make();

        // Then
        assertTrue(String.format("%s does not match %s", out, expected),out.equals(expected));
    }

}
