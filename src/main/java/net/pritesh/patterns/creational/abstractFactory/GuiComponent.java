package net.pritesh.patterns.creational.abstractFactory;


public abstract class GuiComponent
{
    protected int maxSize;
    protected int minSize;

    public int getMaxSize()
    {
        return maxSize;
    }

    public void setMaxSize( int maxSize )
    {
        this.maxSize = maxSize;
    }

    public int getMinSize()
    {
        return minSize;
    }

    public void setMinSize( int minSize )
    {
        this.minSize = minSize;
    }
}
