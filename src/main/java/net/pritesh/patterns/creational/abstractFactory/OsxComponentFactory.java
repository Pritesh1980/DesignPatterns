package net.pritesh.patterns.creational.abstractFactory;


public class OsxComponentFactory extends GuiComponentFactory
{
    @Override
    public GuiComponent getGuiComponent(ComponentType componentType)
    {
        switch(componentType)
        {
            case BUTTON:
            {
                return new OsxButton();
            }
            case WINDOW:
            {
                return new OsxWindow();
            }
            default:
            {
                return null;
            }
        }
    }
}
