package za.ac.cput.factory;

import za.ac.cput.domain.Employee;
import za.ac.cput.util.Helper;

public class EmployeeFactory {
   /* public static Employee createEmployee(String firstName, String lastName){
        if(Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName)){
            return null;
        }

        String employeeId = Helper.generateId();

        return new Employee.Builder().setFirstName(firstName)
                .setLastName(lastName)
                .setEmployeeId(employeeId)
                .build();
    }*/
    public static Employee createEmployee(String firstName, String lastName, String email) {
        if (Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName) || Helper.isValidEmail(email)) {
            return null;
        }
        if (!Helper.isValidEmail(email)) {
            return null;
        }
        String employeeId = Helper.generateId();

        return new Employee.Builder().setFirstName(firstName)
                .setLastName(lastName)
                .setEmployeeId(employeeId)
                .build();
    }
}
