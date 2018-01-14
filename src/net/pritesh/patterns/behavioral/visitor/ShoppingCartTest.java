package net.pritesh.patterns.behavioral.visitor;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class ShoppingCartTest
{

    @Test
    public void getContents()
    {
        // Given
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Milk());
        cart.addItem(new Bread());

        // Then
        assertTrue( cart.accept(new ConsumableDisplayVisitor()).equals("SHOPPINGCART"));
    }
}
