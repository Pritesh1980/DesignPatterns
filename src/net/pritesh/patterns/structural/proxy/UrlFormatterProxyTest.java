package net.pritesh.patterns.structural.proxy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class UrlFormatterProxyTest
{
    @Test
    public void testProxy()
    {
        // Given
        String address = "http://ft.com";
        UrlFormatter formatter = new UrlFormatterProxy(address);

        // When
        formatter.getUrl();

        // Then
        assertEquals(0, ((UrlFormatterProxy)(formatter)).getReuseCount());

        // When
        formatter.getUrl();

        // Then
        assertEquals(1, ((UrlFormatterProxy)(formatter)).getReuseCount());
    }
}
