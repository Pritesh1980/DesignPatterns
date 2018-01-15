package net.pritesh.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Treat this class as a an {@link Employee}
 */
public class Manager implements Employee
{
    private String name;
    private double salary;
    List<Employee> employees = new ArrayList<Employee>();


    public Manager( String name, double salary )
    {
        this.name = name;
        this.salary = salary;
    }

    public void add( Employee employee )
    {
        employees.add(employee);
    }

    public Employee getChild( int i )
    {
        return employees.get(i);
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void remove( Employee employee )
    {
        employees.remove(employee);
    }

    public void print()
    {
        System.out.println("-------------");
        System.out.println("Name: " + getName());
        System.out.println("Salary (manager): £" + getSalary());
        System.out.println("-------------");

        // This is the bit that shows the power of a composite
        employees.stream().forEach(Employee::print);
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("-------------\n");
        sb.append("Name: " + getName() + "\n");
        sb.append("Salary (manager): £" + getSalary() + "\n");
        sb.append("-------------\n");

        // This is the bit that shows the power of a composite
//        employees.stream().forEach(sb.append(Employee::toString));
        employees.stream().forEach( s -> sb.append(s.toString()));

        return sb.toString();
    }
}
