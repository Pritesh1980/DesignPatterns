package net.pritesh.patterns.structural.composite;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;


public class CompositeTest
{
    @Test
    public void testThreeEmployeesTwoManagers() throws Exception
    {
        Employee emp1 = new Developer("John", 30_000);
        Employee emp2 = new Developer("Mark", 32_000);

        Employee manager1 = new Manager("Andy", 45_000);
        manager1.add(emp1);
        manager1.add(emp2);

        Employee bigBoss = new Manager("Rob", 60_000);
        Employee emp3 = new Developer("Alex", 40_000);

        bigBoss.add(emp3);
        bigBoss.add(manager1);

        String expected = "-------------\n" +
                "Name: Rob\n" +
                "Salary (manager): £60000.0\n" +
                "-------------\n" +
                "-------------\n" +
                "Name: Alex\n" +
                "Salary (dev): £40000.0\n" +
                "-------------\n" +
                "-------------\n" +
                "Name: Andy\n" +
                "Salary (manager): £45000.0\n" +
                "-------------\n" +
                "-------------\n" +
                "Name: John\n" +
                "Salary (dev): £30000.0\n" +
                "-------------\n" +
                "-------------\n" +
                "Name: Mark\n" +
                "Salary (dev): £32000.0\n" +
                "-------------\n";

        assertTrue(bigBoss.toString().equals(expected));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDeveloperAddException()
    {
        Employee bob = new Developer("Bob", 12_000);
        bob.add(new Developer("Robert", 11_000));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDeveloperRemoveException()
    {
        Employee bob = new Developer("Bob", 12_000);
        bob.remove(bob);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDeveloperGetChildException()
    {
        Employee bob = new Developer("Bob", 12_000);
        bob.getChild(10);
    }
}
