package net.pritesh.patterns.structural.bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * Uses the passed in {@link FantasyFootballPlayer} and builds header and details from it.
 */
public class DetailedPrinter extends Printer
{
    FantasyFootballPlayer player;

    public DetailedPrinter( FantasyFootballPlayer player)
    {
        this.player = player;
    }

    @Override
    protected List<PlayerAttribute> getDetails()
    {
        List<PlayerAttribute> attributes = new ArrayList<>(2);
        attributes.add(new PlayerAttribute("Position", player.getPosition()));
        attributes.add(new PlayerAttribute("Team", player.getClub()));
        attributes.add(new PlayerAttribute("Value", String.valueOf(player.getValue())));
        attributes.add(new PlayerAttribute("Age", String.valueOf(player.getAge())));
        return attributes;
    }

    @Override
    protected String getHeader()
    {
        return player.getName();
    }
}
