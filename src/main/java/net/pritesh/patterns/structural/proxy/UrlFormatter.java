package net.pritesh.patterns.structural.proxy;

import java.net.URL;

/**
 * A dumb example. Implementations take in a string in constructor and make it into a {@link URL}. Amazing stuff.
 */
public interface UrlFormatter
{
    URL getUrl();
}
