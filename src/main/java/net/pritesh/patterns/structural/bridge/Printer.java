package net.pritesh.patterns.structural.bridge;

import java.util.List;

/**
 * Uses the passed in {@link Formatter} to determine how to format a {@link FantasyFootballPlayer}.
 * Implementing classes determine what fields are used via their implementation of
 * {@link #getHeader()} and {@link #getDetails()}
 */
public abstract class Printer
{
    public String print( Formatter formatter )
    {
        return formatter.format(getHeader(), getDetails());
    }

    protected abstract List<PlayerAttribute> getDetails();

    protected abstract String getHeader();
}
