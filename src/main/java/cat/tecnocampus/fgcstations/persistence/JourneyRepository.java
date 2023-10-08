package cat.tecnocampus.fgcstations.persistence;

import cat.tecnocampus.fgcstations.domain.Journey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JourneyRepository extends JpaRepository<Journey, String> {

}
