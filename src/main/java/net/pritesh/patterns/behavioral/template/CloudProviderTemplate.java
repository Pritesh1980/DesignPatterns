package net.pritesh.patterns.behavioral.template;

public abstract class CloudProviderTemplate
{
    public abstract void createVm();
    public abstract int getNumVms();
    public abstract double getCostPerVm();

    public final double getTotaMonthlyCost()
    {
        return getNumVms() * getCostPerVm();
    }
}
