package net.pritesh.patterns.creational.builder;

/**
 * An example of the Builder pattern.
 * This builds a {@link Pc} by using a static inner {@link Builder} class to do the dirty work.
 * Any compulsory fields could be added to the {@link Builder} constructor.
 */
public class Pc
{
    public static class Builder
    {
        private String cpu;
        private String memory;
        private String graphics;
        private String psu;

        public Builder()
        {
        }

        public Pc build()
        {
            return new Pc(this);
        }

        public Builder cpu( String cpu )
        {
            this.cpu = cpu;
            return this;
        }

        public Builder memory( String memory )
        {
            this.memory = memory;
            return this;
        }

        public Builder graphics(String graphics)
        {
            this.graphics = graphics;
            return this;
        }

        public Builder psu(String psu)
        {
            this.psu = psu;

            return this;
        }

    }

    private final String cpu;
    private final String memory;
    private final String graphics;
    private final String psu;

    private Pc( Builder builder )
    {
        this.cpu = builder.cpu;
        this.memory = builder.memory;
        this.graphics = builder.graphics;
        this.psu = builder.psu;
    }

    public String getCpu()
    {
        return cpu;
    }

    public String getMemory()
    {
        return memory;
    }

    public String getGraphics()
    {
        return graphics;
    }

    public String getPsu()
    {
        return psu;
    }
}
