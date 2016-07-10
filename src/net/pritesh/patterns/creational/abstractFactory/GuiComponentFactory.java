package net.pritesh.patterns.creational.abstractFactory;


/**
 * The main entry for this Abstract Factory.
 * This is essentially a factory-factory: the right factory is returned depending on a parameter.
 * Each factory implements the abstract method below {@link #getGuiComponent(ComponentType)},
 * therefore a client can call each one in the same manner.
 */
public abstract class GuiComponentFactory
{
    public static GuiComponentFactory getGuiComponentFactory(OsType Os)
    {
        switch(Os)
        {
            case LINUX:
            {
                return new LinuxComponentFactory();
            }
            case OSX:
            {
                return new OsxComponentFactory();
            }
            case WINDOWS:
            {
                return new WindowsComponentFactory();
            }
            default:
            {
                return null;
            }
        }
    }

    public abstract GuiComponent getGuiComponent(ComponentType componentType);
}
