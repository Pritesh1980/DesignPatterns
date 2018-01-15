package net.pritesh.patterns.structural.bridge;

import java.util.List;

/**
 * Formats data as HTML
 */
public class HtmlFormatter implements Formatter
{
    @Override
    public String format( String header, List<PlayerAttribute> details )
    {
        StringBuilder sb = new StringBuilder();

        sb.append("<h1>");
        sb.append(header);
        sb.append("</h1>");

        sb.append("<table>");
        for( PlayerAttribute attribute : details)
        {
            sb.append("<tr><td>");
            sb.append(attribute.getName());
            sb.append("</td><td>");
            sb.append(attribute.getValue());
            sb.append("</td></tr>");
        }
        sb.append("</table>");

        return sb.toString();
    }
}
