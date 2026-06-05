package home.rouserces;

import home.dtos.CreateOrganizationDto;
import home.services.OrganizationService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/org")
public class OrgResource {
    @Inject
    OrganizationService organizationService;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createOrganization(CreateOrganizationDto createOrganizationDto) {
        try {
            organizationService.createOrganization(createOrganizationDto);
            return Response.ok("Success").build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
        }
    }
}
