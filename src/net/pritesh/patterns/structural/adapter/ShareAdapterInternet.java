package net.pritesh.patterns.structural.adapter;

/**
 * Adapts a {@link ShareInternet} to a {@link Share}
 */
public class ShareAdapterInternet implements Share
{
    private ShareInternet instance;

    public ShareAdapterInternet( ShareInternet shareFromInternet )
    {
        this.instance = shareFromInternet;
    }

    @Override
    public String getEpic()
    {
        return instance.getCode();
    }

    @Override
    public String getName()
    {
        return instance.getFullName();
    }

    @Override
    public double getValue()
    {
        return instance.getPrice();
    }

    @Override
    public double getPriceEarningsRatio()
    {
        double retVal = 0;

        try
        {
            retVal = instance.getPrice() / instance.getEarnings();
        }
        catch(ArithmeticException ae)
        {
            retVal = -1;
        }
        return retVal;
    }

    @Override
    public String toString()
    {
        return "ShareAdapterInternet{" +
                "instance=" + instance +
                '}';
    }
}
