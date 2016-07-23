package net.pritesh.patterns.behavioral.iterator;


import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Simple example of iterator.
 * Replace String with proper objects to make it more realistic.
 */
public class WebpageRepository implements Iterable<String>
{
    private String[] webpages;
    private int index;

    public WebpageRepository()
    {
        webpages = new String[5];
        index = 0;
    }

    public void addWebpage(String webpage)
    {
        // Increase size of webpages if we're at the end already
        if( index==webpage.length() )
        {
            String[] largerArray = new String[webpages.length + 5];
            System.arraycopy(webpages, 0, largerArray, 0, webpages.length);

            webpages = largerArray;
            largerArray = null;
        }

        webpages[index] = webpage;
        index++;
    }

    @Override
    public Iterator<String> iterator()
    {

        return new Iterator<String>()
        {
            private int currentIndex = 0;

            @Override
            public boolean hasNext()
            {
                return currentIndex<webpages.length && webpages[currentIndex]!=null;
            }

            @Override
            public String next()
            {
                return webpages[currentIndex++];
            }
        };
    }

    @Override
    public void forEach( Consumer<? super String> action )
    {
        for (String s : this)
        {
            action.accept(s);
        }
    }

    @Override
    public Spliterator<String> spliterator()
    {
        return null;
    }
}
