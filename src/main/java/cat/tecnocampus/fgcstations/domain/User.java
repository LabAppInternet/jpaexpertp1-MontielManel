package cat.tecnocampus.fgcstations.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User implements Serializable {
    @Id
    private String username;

    private String name;
    private String secondName;

    private String email;

    public List<FavoriteJourney> favoriteJourneyList;


    /*
    // Replace UserDAO with UserRepository
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    */

    public User() {
       favoriteJourneyList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<FavoriteJourney> getFavoriteJourneyList() {
        return favoriteJourneyList;
    }

    public void setFavoriteJourneyList(List<FavoriteJourney> favoriteJourneyList) {
        this.favoriteJourneyList = favoriteJourneyList;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", email='" + email + '\'' +
                ", favoriteJourneyList=lazy" +
                '}';
    }
}
