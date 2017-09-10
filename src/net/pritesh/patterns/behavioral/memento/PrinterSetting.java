package net.pritesh.patterns.behavioral.memento;

public class PrinterSetting
{
    private String material;
    private Integer temperature;
    private Double speed;

    public PrinterSetting( String material, Integer temperature, Double speed )
    {
        this.material = material;
        this.temperature = temperature;
        this.speed = speed;
    }

    public String getMaterial()
    {
        return material;
    }

    public Integer getTemperature()
    {
        return temperature;
    }

    public Double getSpeed()
    {
        return speed;
    }

    public void setMaterial( String material )
    {
        this.material = material;
    }

    public void setTemperature( Integer temperature )
    {
        this.temperature = temperature;
    }

    public void setSpeed( Double speed )
    {
        this.speed = speed;
    }

    @Override
    public String toString()
    {
        return "PrinterSetting{" +
                "material='" + material + '\'' +
                ", temperature=" + temperature +
                ", speed=" + speed +
                '}';
    }


    public PrinterSettingMemento save()
    {
        return new PrinterSettingMemento(temperature, speed);
    }

    public void revert(PrinterSettingMemento setting)
    {
        this.speed = setting.getSpeed();
        this.temperature = setting.getTemperature();
    }
}
