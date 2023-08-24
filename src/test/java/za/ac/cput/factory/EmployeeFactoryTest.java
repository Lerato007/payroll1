package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Employee;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {
    @Test
    public void test(){
        Employee employee = EmployeeFactory.createEmployee("Lerato", "Moshabi", "lm@gmail.com");
        System.out.println(employee.toString());
        assertNotNull(employee);
    }

    @Test
    public void test_fail(){
        Employee employee = EmployeeFactory.createEmployee("", "Moshabi","lm28@gmail.com");
        System.out.println(employee.toString());
        assertNotNull(employee);
    }
}

/**
 * AnimalFactoryTest.java
 * This is the AnimalFactoryTest
 * @author Lerato Moshabi - 220076073
 * 11 March 2023
 */

/*package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Animal;

import static org.junit.jupiter.api.Assertions.*;

class AnimalFactoryTest {
    @Test
    public void test(){
        Animal animal = AnimalFactory.createAnimal("Brown", "Dog", "Woof");
        System.out.println(animal.toString());
        assertNotNull(animal);
    }

    @Test
    public void test_fail(){
        Animal animal = AnimalFactory.createAnimal("", "Dog","Woof");
        System.out.println(animal.toString());
        assertNotNull(animal);
    }
}*/