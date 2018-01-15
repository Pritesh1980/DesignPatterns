package net.pritesh.patterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class QueueObservervable
{
    public static void main( String... args )
    {
        QueueToInspect msgQueue = new QueueToInspect();

        Client client1 = new Client("Listener1");
        Client client2 = new Client("Listener2");

        msgQueue.addObserver(client1);
        msgQueue.addObserver(client2);

        msgQueue.msgAdded();
    }
}

// Concrete Subject
class QueueToInspect extends Observable
{
    public void msgAdded()
    {
        setChanged();
        notifyObservers();
    }
}

// Concrete Observer
class Client implements Observer
{
    private String name;

    public  Client(String name)
    {
        this.name = name;
    }

    @Override
    public void update( Observable o, Object arg )
    {
        System.out.println(String.format("%s[*]",name));
    }
}
