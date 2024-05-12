package ma.enset.hospital_jpa.service;

import ma.enset.hospital_jpa.entities.Consultation;
import ma.enset.hospital_jpa.entities.Medecin;
import ma.enset.hospital_jpa.entities.Patient;
import ma.enset.hospital_jpa.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin) ;
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}
