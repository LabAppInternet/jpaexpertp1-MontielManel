package cat.tecnocampus.fgcstations.persistence;

import cat.tecnocampus.fgcstations.domain.FavoriteJourney;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavouriteJourney extends JpaRepository<FavoriteJourney, String> {
}
