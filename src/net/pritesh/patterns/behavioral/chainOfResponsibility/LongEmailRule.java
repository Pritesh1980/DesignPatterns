package net.pritesh.patterns.behavioral.chainOfResponsibility;

/**
 * Handle a specific case. If it can't, pass it on the next {@link EmailFilterRule}
 */
public class LongEmailRule extends EmailFilterRule
{
    @Override
    public String handleEmail( Email email )
    {
        if( email.getBody().length()>250)
        {
            return "LONG";
        }
        else
        {
            return successor.handleEmail(email);
        }
    }
}
