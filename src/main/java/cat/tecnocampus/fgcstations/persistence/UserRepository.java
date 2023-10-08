package cat.tecnocampus.fgcstations.persistence;

import cat.tecnocampus.fgcstations.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
// Other imports...

public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String username);

}
