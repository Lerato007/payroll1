package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.Nationality;

import static org.junit.jupiter.api.Assertions.*;

class NationalityFactoryTest {

    @Test
    public void test() {
        Nationality nationality = NationalityFactory.createNationality("Spain", "Muchas Gracias");
        System.out.println(nationality.toString());
        assertNotNull(nationality);
    }

    @Test
    public void test_fail() {
        Nationality nationality = NationalityFactory.createNationality("", "Moshabi");
        System.out.println(nationality.toString());
        assertNotNull(nationality);
    }
}