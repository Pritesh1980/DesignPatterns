package net.pritesh.patterns.structural.proxy;


import java.net.MalformedURLException;
import java.net.URL;

public class UriFormatterImpl implements UrlFormatter
{
    private String urlString;

    public UriFormatterImpl( String url )
    {
        System.out.println("Constructor called");
        this.urlString = url;
    }

    @Override
    public URL getUrl()
    {
        URL url = null;

        try
        {
            System.out.println("Generating URL");
            url = new URL(urlString);
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }

        return url;
    }
}
