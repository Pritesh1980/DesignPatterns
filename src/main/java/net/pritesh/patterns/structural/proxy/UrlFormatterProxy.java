package net.pritesh.patterns.structural.proxy;

import java.net.URL;

/**
 * Caches a {@link UriFormatterImpl}. Imagine it is expensive to create!
 */
public class UrlFormatterProxy implements UrlFormatter
{
    private String urlString;
    private UriFormatterImpl urlFormatterImpl;
    private int reuseCount = 0;

    public UrlFormatterProxy( String urlString )
    {
        this.urlString = urlString;
    }

    @Override
    public URL getUrl()
    {
        if(urlFormatterImpl == null)
        {
            urlFormatterImpl = new UriFormatterImpl(urlString);
        }
        else
        {
            reuseCount++;
        }
        return urlFormatterImpl.getUrl();
    }

    public int getReuseCount()
    {
        return reuseCount;
    }
}
