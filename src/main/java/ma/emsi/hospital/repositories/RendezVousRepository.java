package ma.emsi.hospital.repositories;

import ma.emsi.hospital.entities.Rendez_Vous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<Rendez_Vous,String> {
}
