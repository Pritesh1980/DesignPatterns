package net.pritesh.patterns.behavioral.memento;

public class PrinterSettingMemento
{
    private Integer temperature;
    private Double speed;

    public PrinterSettingMemento( Integer temperature, Double speed )
    {
        this.temperature = temperature;
        this.speed = speed;
    }

    public Integer getTemperature()
    {
        return temperature;
    }

    public Double getSpeed()
    {
        return speed;
    }
}
