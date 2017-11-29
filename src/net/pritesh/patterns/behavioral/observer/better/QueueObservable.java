package net.pritesh.patterns.behavioral.observer.better;



public class QueueObservable
{
    public static void main( String... args )
    {
        Subject msgQueue = new QueueToInspect();

        PhoneClient phoneClient = new PhoneClient(msgQueue);
        phoneClient.addMessage("*");
    }
}
