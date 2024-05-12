package ma.enset.hospital_jpa.repositories;

import ma.enset.hospital_jpa.entities.Consultation;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
