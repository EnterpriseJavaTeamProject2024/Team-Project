package funfactapi.main.puts;

import funfactapi.entities.FunFacts;
import funfactapi.persistence.AdminDAO;
import funfactapi.persistence.FunFactDAO;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/updateFunFact")
public class UpdateFunFact {
        @PUT
        @Produces("application/json")
        public Response updateFunFact(@QueryParam("category") String category,
                                             @QueryParam("ID") int ID,
                                             @QueryParam("funFact") String funFact,
                                             @QueryParam("adminKey") String adminKey) {
            AdminDAO adminDao = new AdminDAO();
            if (adminDao.validAdminKey(adminKey)) {
                FunFactDAO dao = new FunFactDAO();
                FunFacts updatedFact = dao.updateFunFact(ID, funFact, category);
                if (updatedFact != null) {
                    return Response.status(Response.Status.OK).entity(updatedFact.toString()).build();
                }
            }
            String errorMessage = "Failed to update ID: " + ID;
            return Response.status(Response.Status.BAD_REQUEST).entity(errorMessage).build();
    }

}
