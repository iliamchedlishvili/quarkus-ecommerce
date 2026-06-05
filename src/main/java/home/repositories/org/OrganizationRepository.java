package home.repositories.org;

import home.entities.org.Organization;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class OrganizationRepository implements PanacheRepository<Organization> {
}
