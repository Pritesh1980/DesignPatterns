package net.pritesh.patterns.behavioral.chainOfResponsibility;

/**
 * The end of the chain of {@link EmailFilterRule EmailFilterRules}
 */
public class DefaultRule extends EmailFilterRule
{

    @Override
    public String handleEmail( Email email )
    {
        return "DEFAULT";
    }
}
