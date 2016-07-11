package net.pritesh.patterns.structural.adapter;

/**
 * Represents basic info for a stockmarket share as pulled from an online API.
 */
public class ShareInternet
{
    private String code;
    private String fullName;
    private double price;
    private double earnings;

    public ShareInternet( String code, String fullName, double price, double earnings )
    {
        this.code = code;
        this.fullName = fullName;
        this.price = price;
        this.earnings = earnings;
    }

    public String getCode()
    {
        return code;
    }

    public String getFullName()
    {
        return fullName;
    }

    public double getPrice()
    {
        return price;
    }

    public double getEarnings()
    {
        return earnings;
    }

    @Override
    public String toString()
    {
        return "ShareInternet{" +
                "code='" + code + '\'' +
                ", fullName='" + fullName + '\'' +
                ", price=" + price +
                ", earnings=" + earnings +
                '}';
    }
}
