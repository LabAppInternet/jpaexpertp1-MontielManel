package cat.tecnocampus.fgcstations.persistence;

import cat.tecnocampus.fgcstations.domain.Friends;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendRepository extends JpaRepository<Friends, String> {
}
