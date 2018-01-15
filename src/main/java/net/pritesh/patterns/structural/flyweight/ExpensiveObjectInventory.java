package net.pritesh.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the class that makes use of the objects created in the catalogue.
 */
public class ExpensiveObjectInventory
{
    private final ExpensiveObjectCatalogue catalogue = new ExpensiveObjectCatalogue();
    private final List<ExpensiveObjectShortcut> allShortcuts = new ArrayList<>();


    void addShortcut(String objectName, int shortcutId)
    {
        ExpensiveObject expensiveObject = catalogue.lookup(objectName);
        allShortcuts.add(new ExpensiveObjectShortcut(shortcutId, expensiveObject));
    }


    public String process()
    {
        StringBuffer sb = new StringBuffer();

        for( ExpensiveObjectShortcut shortcut : allShortcuts)
        {
            sb.append(shortcut.process());
        }

        return sb.toString();
    }

    public int countShortcuts()
    {
        return allShortcuts.size();
    }

    public int countExpensiveObjects()
    {
        return catalogue.itemCount();
    }

}
