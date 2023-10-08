package cat.tecnocampus.fgcstations.persistence;

import cat.tecnocampus.fgcstations.domain.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, String>{

}

