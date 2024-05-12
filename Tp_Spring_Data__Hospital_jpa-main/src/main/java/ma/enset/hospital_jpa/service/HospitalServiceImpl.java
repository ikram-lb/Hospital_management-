package ma.enset.hospital_jpa.service;

import jakarta.transaction.Transactional;
import ma.enset.hospital_jpa.entities.Consultation;
import ma.enset.hospital_jpa.entities.Medecin;
import ma.enset.hospital_jpa.entities.Patient;
import ma.enset.hospital_jpa.entities.RendezVous;
import ma.enset.hospital_jpa.repositories.ConsultationRepository;
import ma.enset.hospital_jpa.repositories.MedecinRepository;
import ma.enset.hospital_jpa.repositories.PatientRepository;
import ma.enset.hospital_jpa.repositories.RendezVousRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {

    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;

    public HospitalServiceImpl(PatientRepository patientRepository, MedecinRepository medecinRepository, RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;
    }


    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
