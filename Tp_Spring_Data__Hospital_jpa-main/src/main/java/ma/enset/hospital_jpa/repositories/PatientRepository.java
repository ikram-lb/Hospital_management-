package ma.enset.hospital_jpa.repositories;

import ma.enset.hospital_jpa.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    Patient findByNom(String name);
}
