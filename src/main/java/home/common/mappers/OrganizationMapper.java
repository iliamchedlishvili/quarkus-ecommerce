package home.common.mappers;

import home.dtos.CreateOrganizationDto;
import home.entities.org.Organization;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "cdi")
public interface OrganizationMapper {

    CreateOrganizationDto toDto(Organization organization);

    Organization toEntity(CreateOrganizationDto createOrganizationDto);

    void updateEntityFromDto(CreateOrganizationDto dto,
                             @MappingTarget Organization entity);
}
