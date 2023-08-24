package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Nationality;

import java.util.Set;

@Repository
public interface NationalityRepository extends JpaRepository<Nationality, String> {
}
