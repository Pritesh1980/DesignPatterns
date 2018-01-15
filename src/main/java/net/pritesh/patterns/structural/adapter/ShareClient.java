package net.pritesh.patterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Shows the Adapter pattern.
 * Adapts a {@link ShareInternet} to a {@link Share} using a {@link ShareAdapterInternet}
 */
public class ShareClient
{
    public static List<Share> getSharesList()
    {
        List<Share> shares = new ArrayList<>();

        Share shareFromDb = new ShareDb("RR", "Rolls Royce", 605.50, 9.79);
        shares.add(shareFromDb);

        ShareInternet shareFromInternet = new ShareInternet("BET", "BetFair", 1000, 10);
        shares.add(new ShareAdapterInternet(shareFromInternet));

        return shares;
    }
}
