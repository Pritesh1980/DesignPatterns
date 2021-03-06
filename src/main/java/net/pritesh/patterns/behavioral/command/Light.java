package net.pritesh.patterns.behavioral.command;

// Receiver
public class Light
{
    private boolean isOn = false;

    public String toggle()
    {
        if(isOn)
        {
            return off();
        }
        else
        {
            return on();
        }
    }


    public String on()
    {
        isOn = true;
        return "ON";
    }

    public String off()
    {
        isOn = false;
        return "OFF";
    }
}
