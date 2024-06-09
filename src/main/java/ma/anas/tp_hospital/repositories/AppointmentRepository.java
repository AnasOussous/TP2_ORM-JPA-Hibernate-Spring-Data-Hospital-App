package ma.anas.tp_hospital.repositories;

import ma.anas.tp_hospital.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment,String> {
}
