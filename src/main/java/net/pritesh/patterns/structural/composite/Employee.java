package net.pritesh.patterns.structural.composite;

/**
 * Generalise other classes to conform to this interface.
 */
public interface Employee
{
    public void add( Employee employee );
    public void remove( Employee employee );
    public Employee getChild( int i );
    public String getName();
    public double getSalary();
    public void print();
}
