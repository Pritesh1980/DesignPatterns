package net.pritesh.patterns.structural.flyweight;

/**
 * Just a class that makes use of an {@link ExpensiveObject}.
 * The shortcut is something related to the specific object.
 */
public class ExpensiveObjectShortcut
{
    private final int shortcutId;
    private final ExpensiveObject expensiveObject;

    public ExpensiveObjectShortcut( int shortcutId, ExpensiveObject expensiveObject )
    {
        this.shortcutId = shortcutId;
        this.expensiveObject = expensiveObject;
    }

    public String process()
    {
        return String.format("Shortcut ID %d for ExpensiveObject %s%n", shortcutId, expensiveObject.getName());
    }
}
