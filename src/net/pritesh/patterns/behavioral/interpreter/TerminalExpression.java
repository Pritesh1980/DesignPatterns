package net.pritesh.patterns.behavioral.interpreter;


import java.util.StringTokenizer;

public class TerminalExpression implements Expression
{
    private final String data;

    public TerminalExpression(final String data)
    {
        this.data = data;
    }

    @Override
    public boolean interpret(final String str)
    {
        StringTokenizer st = new StringTokenizer(str);

        while( st.hasMoreTokens() )
        {
            if( st.nextToken().equals(data) )
            {
                return true;
            }
        }

        return false;
    }
}
