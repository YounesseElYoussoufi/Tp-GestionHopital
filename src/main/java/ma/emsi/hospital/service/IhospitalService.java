package ma.emsi.hospital.service;

import ma.emsi.hospital.entities.Consultation;
import ma.emsi.hospital.entities.Medecin;
import ma.emsi.hospital.entities.Patient;
import ma.emsi.hospital.entities.Rendez_Vous;

public interface IhospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    Rendez_Vous saveRDV(Rendez_Vous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}
