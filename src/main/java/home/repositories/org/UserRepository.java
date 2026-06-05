package home.repositories.org;

import home.entities.org.User;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class UserRepository implements PanacheRepository<User> {

}
