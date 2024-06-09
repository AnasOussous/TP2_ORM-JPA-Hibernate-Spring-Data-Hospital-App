package ma.anas.tp_hospital.repositories;

import ma.anas.tp_hospital.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {
    List<Doctor> findByName(String name);
}
