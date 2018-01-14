package net.pritesh.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingCart implements Consumable
{
    private List<Consumable> items = new ArrayList<>();

    public ShoppingCart() {}

    public void addItem( Consumable consumable)
    {
        items.add(consumable);
    }

    public List<Consumable> getItems()
    {
        return Collections.unmodifiableList(items);
    }


    @Override
    public String accept( ConsumableVisitor visitor )
    {
        for( Consumable item : items)
        {
            item.accept(visitor);
        }

        return visitor.visit(this);
    }
}
