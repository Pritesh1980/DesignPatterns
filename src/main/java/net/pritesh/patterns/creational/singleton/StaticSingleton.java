package net.pritesh.patterns.creational.singleton;

/**
 * Simple example of creating a Singleton.
 * A static instance is returned, ensuring the constructor is private.
 * instance is lazily loaded, and thread-safety has been added.
 */
public class StaticSingleton
{
    private static StaticSingleton instance = null;

    private StaticSingleton()
    {
    }

    public static StaticSingleton getInstance()
    {
        if( instance==null )
        {
            synchronized( StaticSingleton.class )       // Add some thread-safety
            {
                if( instance==null )                    // Repeat check within synchronized block
                {
                    instance = new StaticSingleton();   // Lazy loading of instance
                }
            }
        }
        return instance;
    }
}
