package net.pritesh.patterns.behavioral.chainOfResponsibility;

/**
 * Handle a specific case. If it can't, pass it on the next {@link EmailFilterRule}
 */
public class UrgentRule extends EmailFilterRule
{
    @Override
    public String handleEmail( Email email )
    {
        if( email.getSubject().toUpperCase().contains("URGENT"))
        {
            return "URGENT";
        }
        else
        {
            return successor.handleEmail(email);
        }
    }
}
