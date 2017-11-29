package net.pritesh.patterns.behavioral.observer.better;

public class PhoneClient extends Observer
{
    public PhoneClient(Subject subject)
    {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String msg)
    {
        subject.setState(msg + " [phone]");
    }

    @Override
    void update()
    {
        System.out.println("Phone stream: " + subject.getState());
    }
}
