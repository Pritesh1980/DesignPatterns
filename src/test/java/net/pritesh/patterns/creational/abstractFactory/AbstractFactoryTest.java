package net.pritesh.patterns.creational.abstractFactory;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Pritesh on 10/07/2016.
 */
public class AbstractFactoryTest
{
    @Test
    public void getGuiComponentFactoryOsxButton() throws Exception
    {
        // Given
        GuiComponentFactory factory = GuiComponentFactory.getGuiComponentFactory(OsType.OSX);

        // When
        GuiComponent component = factory.getGuiComponent(ComponentType.BUTTON);

        // Then
        assertThat(component, instanceOf(OsxButton.class));
    }

    @Test
    public void getGuiComponentFactoryLinuxWindow() throws Exception
    {
        // Given
        GuiComponentFactory factory = GuiComponentFactory.getGuiComponentFactory(OsType.LINUX);

        // When
        GuiComponent component = factory.getGuiComponent(ComponentType.WINDOW);

        // Then
        assertThat(component, instanceOf(LinuxWindow.class));
    }

}
