package net.pritesh.patterns.creational.abstractFactory;


public class LinuxComponentFactory extends GuiComponentFactory
{
    @Override
    public GuiComponent getGuiComponent(ComponentType componentType)
    {
        switch(componentType)
        {
            case BUTTON:
            {
                return new LinuxButton();
            }
            case WINDOW:
            {
                return new LinuxWindow();
            }
            default:
            {
                return null;
            }
        }
    }

}
