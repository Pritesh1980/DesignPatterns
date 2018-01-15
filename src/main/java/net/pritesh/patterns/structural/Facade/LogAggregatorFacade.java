package net.pritesh.patterns.structural.Facade;


public class LogAggregatorFacade
{
    private LocalLogAggregator localLogAggregator;
    private AwsLogAggregator awsLogAggregator;
    private AzureLogAggregator azureLogAggregator;

    public LogAggregatorFacade( LocalLogAggregator localLogAggregator, AwsLogAggregator awsLogAggregator, AzureLogAggregator azureLogAggregator )
    {
        this.localLogAggregator = localLogAggregator;
        this.awsLogAggregator = awsLogAggregator;
        this.azureLogAggregator = azureLogAggregator;
    }

    public String getAllLogs()
    {
        StringBuffer sb = new StringBuffer();

        if( localLogAggregator!=null )
        {
            sb.append(localLogAggregator.getLogs());
            sb.append("\n");
        }

        if( awsLogAggregator!=null )
        {
            sb.append(awsLogAggregator.getLogs());
            sb.append("\n");
        }

        if( azureLogAggregator!=null )
        {
            sb.append(azureLogAggregator.getLogs());
            sb.append("\n");
        }

        return sb.toString();
    }
}
