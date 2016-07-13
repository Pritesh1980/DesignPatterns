package net.pritesh.patterns.structural.composite;

/**
 * Treat this class as a an {@link Employee}
 */
public class Developer implements Employee
{
    private String name;
    private double salary;

    public Developer( String name, double salary )
    {
        this.name = name;
        this.salary = salary;
    }

    public void add( Employee employee )
    {
        throw new UnsupportedOperationException("Developer can't add an employee");
    }

    public Employee getChild( int i )
    {
        throw new UnsupportedOperationException("Developer has no employees");
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void print()
    {
        System.out.println("-------------");
        System.out.println("Name: " + getName());
        System.out.println("Salary (dev): £" + getSalary());
        System.out.println("-------------");
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("-------------\n");
        sb.append("Name: " + getName() + "\n");
        sb.append("Salary (dev): £" + getSalary() + "\n");
        sb.append("-------------\n");

        return sb.toString();
    }

    public void remove( Employee employee )
    {
        throw new UnsupportedOperationException("Developer don't have employees to remove");
    }

}
