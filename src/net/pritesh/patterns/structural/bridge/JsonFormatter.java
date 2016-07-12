package net.pritesh.patterns.structural.bridge;

import java.util.List;

/**
 * Formats data as JSON
 */
public class JsonFormatter implements Formatter
{
    @Override
    public String format( String header, List<PlayerAttribute> details )
    {
        StringBuilder sb = new StringBuilder();

        sb.append("\"");
        sb.append(header);
        sb.append("\":{");

        //sb.append("\n");
        for( PlayerAttribute attribute : details)
        {
            sb.append("\n\t\"");
            sb.append(attribute.getName());
            sb.append("\" : ");
            sb.append(attribute.getValue());
            sb.append("\",");
        }
        sb.append("\n}");

        return sb.toString();
    }
}
