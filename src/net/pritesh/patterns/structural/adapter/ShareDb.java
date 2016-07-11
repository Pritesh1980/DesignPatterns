package net.pritesh.patterns.structural.adapter;


/**
 * Represents basic info for a stockmarket share as pulled from a hypothetical database.
 */
public class ShareDb implements Share
{
    private String epic;
    private String name;
    private double value;
    private double priceEarningsRatio;


    public ShareDb( String epic, String name, double value, double priceEarningsRatio )
    {
        this.epic = epic;
        this.name = name;
        this.value = value;
        this.priceEarningsRatio = priceEarningsRatio;
    }

    @Override
    public String getEpic()
    {
        return epic;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public double getValue()
    {
        return value;
    }

    @Override
    public double getPriceEarningsRatio()
    {
        return priceEarningsRatio;
    }

    @Override
    public String toString()
    {
        return "ShareDb{" +
                "epic='" + epic + '\'' +
                ", name='" + name + '\'' +
                ", value=" + value +
                ", priceEarningsRatio=" + priceEarningsRatio +
                '}';
    }
}
