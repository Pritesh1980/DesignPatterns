package net.pritesh.patterns.behavioral.template;

public class AzureCloudProvider extends CloudProviderTemplate
{
    private int numVms = 0;

    @Override
    public void createVm()
    {
        // Do real stuff here
        numVms++;
    }

    @Override
    public int getNumVms()
    {
        return numVms;
    }

    @Override
    public double getCostPerVm()
    {
        return 40.0;
    }
}
