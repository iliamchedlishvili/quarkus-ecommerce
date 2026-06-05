package home.common.mappers;

import home.dtos.CreateOrganizationDto;
import home.dtos.CreateUserDto;
import home.entities.org.Organization;
import home.entities.org.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;


@Mapper(componentModel = "cdi")
public interface UserMapper {

    CreateUserDto toDto(User user);

    User toEntity(CreateUserDto createUserDto);

    void updateEntityFromDto(CreateUserDto dto,
                             @MappingTarget User entity);
}
