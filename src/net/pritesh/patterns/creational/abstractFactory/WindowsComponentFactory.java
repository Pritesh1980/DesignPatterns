package net.pritesh.patterns.creational.abstractFactory;


public class WindowsComponentFactory extends GuiComponentFactory
{
    @Override
    public GuiComponent getGuiComponent(ComponentType componentType)
    {
        switch(componentType)
        {
            case BUTTON:
            {
                return new WindowsButton();
            }
            case WINDOW:
            {
                return new WindowsWindow();
            }
            default:
            {
                return null;
            }
        }
    }
}
