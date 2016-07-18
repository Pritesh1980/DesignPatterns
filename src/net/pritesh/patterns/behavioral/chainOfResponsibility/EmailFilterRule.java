package net.pritesh.patterns.behavioral.chainOfResponsibility;

// All filters extend this. Keep a reference to a successor
public abstract class EmailFilterRule
{
    protected EmailFilterRule successor;

    public void setSuccessor(EmailFilterRule successor)
    {
        this.successor = successor;
    }

    public abstract String handleEmail( Email email);
}
