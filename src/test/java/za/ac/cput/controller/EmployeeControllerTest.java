package za.ac.cput.controller;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import za.ac.cput.domain.Employee;
import za.ac.cput.factory.EmployeeFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class EmployeeControllerTest {

    private static Employee employee = EmployeeFactory.createEmployee("Lerato", "Moshabi", "lm500@gmail.com");

    @Autowired
    private TestRestTemplate restTemplate;

    private final String baseURL = "http://localhost:8090/employee";

    @Test
    void a_create() {
        String url = baseURL + "/create";
        ResponseEntity<Employee> postResponse = restTemplate.postForEntity(url, employee, Employee.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        Employee savedEmployee = postResponse.getBody();
        System.out.println("Saved data: " + savedEmployee);
        assertEquals(employee.getEmployeeId(), savedEmployee.getEmployeeId());
    }

    @Test
    void b_read() {
        String url = baseURL + "/read/" + employee.getEmployeeId();
        System.out.println("URL: " + url);
        ResponseEntity<Employee> response = restTemplate.getForEntity(url, Employee.class);
        assertEquals(employee.getEmployeeId(), response.getBody().getEmployeeId());
        System.out.println(response.getBody());
    }

    @Test
    void c_update() {
        Employee updated = new Employee.Builder().copy(employee).setFirstName("Lerato Moshabi").build();
        String url = baseURL + "/update";
        System.out.println("URL: " + url);
        ResponseEntity<Employee> response = restTemplate.postForEntity(url, updated, Employee.class);
        assertNotNull(response.getBody());
    }

    @Test
    @Disabled
    void e_delete() {
        String url = baseURL + "/delete/" + employee.getEmployeeId();
        System.out.println("URL: " + url);
        restTemplate.delete(url);

    }

    @Test
    void d_getall() {
        String url = baseURL + "/getall";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println("Show All:");
        System.out.println(response);
        System.out.println(response.getBody());
    }
}