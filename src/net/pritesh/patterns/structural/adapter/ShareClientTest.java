package net.pritesh.patterns.structural.adapter;

import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class ShareClientTest
{
    @Test
    public void getSharesList() throws Exception
    {
        // Given
        List<Share> shares = null;

        // When
        shares = ShareClient.getSharesList();

        // Then
        assertNotNull(shares);
        assertTrue(shares.size() == 2);

        assertEquals("RR", shares.get(0).getEpic() );
        assertTrue(shares.get(0).getPriceEarningsRatio() == 9.79);

        assertEquals("BET", shares.get(1).getEpic());
        assertEquals(100, shares.get(1).getPriceEarningsRatio(), 0);
    }

}
