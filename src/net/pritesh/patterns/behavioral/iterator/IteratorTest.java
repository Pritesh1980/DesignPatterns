package net.pritesh.patterns.behavioral.iterator;

import org.junit.Test;

import java.util.StringJoiner;

import static org.junit.Assert.assertEquals;


public class IteratorTest
{
    @Test
    public void iterator() throws Exception
    {
        // Given
        WebpageRepository repo = new WebpageRepository();
        repo.addWebpage("www.ft.com");
        repo.addWebpage("www.reuters.com");
        repo.addWebpage("www.yahoo.com");

        // When
        StringJoiner sj = new StringJoiner(",");
        for( String s : repo )
        {
            sj.add(s);
        }

        // Then
        assertEquals("www.ft.com,www.reuters.com,www.yahoo.com",sj.toString());

    }

}
