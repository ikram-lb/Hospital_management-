package ma.enset.hospital_jpa.repositories;

import ma.enset.hospital_jpa.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
    Medecin findByNom(String name);
}
