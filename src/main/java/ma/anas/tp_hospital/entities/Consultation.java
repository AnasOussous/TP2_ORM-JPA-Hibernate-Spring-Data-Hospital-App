package ma.anas.tp_hospital.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString
public class Consultation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date consultationDate;
    private String report;
    @OneToOne
    private Appointment appointment;
    @ManyToOne
    private Doctor doctor;
    @ManyToOne
    private Patient patient;
}
