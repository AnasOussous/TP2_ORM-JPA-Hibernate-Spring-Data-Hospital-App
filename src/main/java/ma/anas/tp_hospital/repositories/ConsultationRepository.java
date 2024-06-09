package ma.anas.tp_hospital.repositories;

import ma.anas.tp_hospital.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
