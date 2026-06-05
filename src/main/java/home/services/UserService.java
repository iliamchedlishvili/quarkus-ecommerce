package home.services;

import home.repositories.org.UserRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class UserService {

    @Inject
    private UserRepository userRepository;


}
