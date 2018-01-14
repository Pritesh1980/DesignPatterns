package net.pritesh.patterns.behavioral.template;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CloudProviderTemplateTest
{

    @Test
    public void testAwsTemplate()
    {
        // Given
        CloudProviderTemplate aws = new AwsCloudProvider();

        // When
        aws.createVm();
        aws.createVm();

        // Then
        assertEquals("Incorrect toal cost", 100.0, aws.getTotaMonthlyCost());
    }

    @Test
    public void testAzureTemplate()
    {
        // Given
        CloudProviderTemplate azure = new AzureCloudProvider();

        // When
        azure.createVm();
        azure.createVm();

        // Then
        assertEquals("Incorrect toal cost", 80.0, azure.getTotaMonthlyCost());
    }
}
