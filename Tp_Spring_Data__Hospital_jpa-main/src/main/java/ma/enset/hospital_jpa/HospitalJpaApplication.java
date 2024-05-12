package ma.enset.hospital_jpa;

import ma.enset.hospital_jpa.entities.*;
import ma.enset.hospital_jpa.repositories.ConsultationRepository;
import ma.enset.hospital_jpa.repositories.MedecinRepository;
import ma.enset.hospital_jpa.repositories.PatientRepository;
import ma.enset.hospital_jpa.repositories.RendezVousRepository;
import ma.enset.hospital_jpa.service.HospitalServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class HospitalJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalJpaApplication.class, args);
	}
	@Bean
	CommandLineRunner start(HospitalServiceImpl hospitalService,PatientRepository patientRepository,MedecinRepository medecinRepository,RendezVousRepository rendezVousRepository){
		return args -> {
			Stream.of("Mohammed","Maryam","Basma")
					.forEach(name->{
						Patient patient = new Patient();
						patient.setNom(name);
						patient.setMalade(false);
						patient.setDateNaissance(new Date());
			//			patient.setRendezVous(null);
						Patient savedPatient = hospitalService.savePatient(patient);
					});
			Stream.of("aymen","omar","hiba")
					.forEach(name->{
						Medecin medecin = new Medecin();
						medecin.setNom(name);
						medecin.setEmail(name+"@gmail.com");
						medecin.setSpecialite(Math.random()>20?"Cardio":"Dentiste");
						Medecin savedMedecin = hospitalService.saveMedecin(medecin);
					});
			Patient patient = patientRepository.findById(1L).orElse(null);
			Patient patient1= patientRepository.findByNom("Maryam");
			Medecin medecin = medecinRepository.findByNom("hiba");
			RendezVous rendezVous = new RendezVous();
			rendezVous.setDate(new Date());
			rendezVous.setStatus(StatusRDV.PENDING);
			rendezVous.setMedecin(medecin);
			rendezVous.setPatient(patient);
			RendezVous savedRDV = hospitalService.saveRDV(rendezVous);
			System.out.println(savedRDV.getId());
			RendezVous rendezVous1 = rendezVousRepository.findById(1L).orElse(null);
			Consultation consultation = new Consultation();
			consultation.setDateConsultation(new Date());
			consultation.setRendezVous(rendezVous1);
			consultation.setRapport("Rapport de la consultation...........");

			Consultation savedConsultation= hospitalService.saveConsultation(consultation);



		};
	}
}
