package net.pritesh.patterns.structural.flyweight;


import java.util.HashMap;
import java.util.Map;

/**
 * This is effectively a factory used to create/re-use objects that does the important bit for the flyweight pattern.
 */
public class ExpensiveObjectCatalogue
{
   private Map<String, ExpensiveObject> allExpensiveObjects = new HashMap<>();

    public ExpensiveObject lookup(String name)
    {
        if( !allExpensiveObjects.containsKey(name))
        {
            // Add new item to my map
            allExpensiveObjects.put(name, new ExpensiveObject(name));
        }

        return allExpensiveObjects.get(name);
    }

    public int itemCount()
    {
        return allExpensiveObjects.size();
    }
}
