package home.services;

import home.common.mappers.OrganizationMapper;
import home.common.mappers.UserMapper;
import home.dtos.CreateOrganizationDto;
import home.dtos.CreateUserDto;
import home.entities.org.Organization;
import home.entities.org.User;
import home.entities.org.UserType;
import home.repositories.org.OrganizationRepository;
import home.repositories.org.UserRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@RequestScoped
public class OrganizationService {
    @Inject
    OrganizationMapper organizationMapper;

    @Inject
    UserMapper userMapper;

    @Inject
    OrganizationRepository organizationRepository;

    @Inject
    UserRepository userRepository;

    @Transactional
    public void createOrganization(CreateOrganizationDto createOrganizationDto) {
        Organization organization = organizationMapper.toEntity(createOrganizationDto);
        CreateUserDto createUserDto =  createOrganizationDto.getUsers().getFirst();
        User user = userMapper.toEntity(createUserDto);
        UserType userType = new UserType();
        userType.setId(1L);
        user.setUserType(userType);
        user.setFirstname(createUserDto.getFirstname());
        user.setLastname(createUserDto.getLastname());
        organization.addUser(user);
        organizationRepository.persist(organization);
    }
}
