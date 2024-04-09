package funfactapi.main.posts;

import funfactapi.entities.FunFacts;
import funfactapi.persistence.AdminDAO;
import funfactapi.persistence.FunFactDAO;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/createFunFact")
public class CreateFunFact {

    @POST
    @Produces("application/json")
    public Response createFunFact(@QueryParam("category") String category,
                                  @QueryParam("funFact") String funFact,
                                  @QueryParam("adminKey") String adminKey) {
        AdminDAO adminDao = new AdminDAO();
        if (adminDao.validAdminKey(adminKey)) {
            FunFactDAO dao = new FunFactDAO();
            FunFacts newFact = dao.createFunFact(funFact, category);
            if (newFact != null) {
                return Response.status(Response.Status.OK).entity(newFact.toString()).build();
            }
        }
        String errorMessage = "Failed to create fun fact.";
        return Response.status(Response.Status.BAD_REQUEST).entity(errorMessage).build();
    }
}

