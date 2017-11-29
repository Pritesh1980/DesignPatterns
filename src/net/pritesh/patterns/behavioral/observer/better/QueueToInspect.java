package net.pritesh.patterns.behavioral.observer.better;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueToInspect extends Subject
{

    private Deque<String> queueHistory = new ArrayDeque<>();

    @Override
    void setState( String msg )
    {
        queueHistory.add(msg);
        this.notifyObservers();
    }

    @Override
    String getState()
    {
        return queueHistory.getLast();
    }
}
