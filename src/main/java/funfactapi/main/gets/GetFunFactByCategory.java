package funfactapi.main.gets;

import funfactapi.entities.FunFacts;
import funfactapi.persistence.FunFactDAO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/funFactByCategory")
public class GetFunFactByCategory {
    @GET
    @Produces("application/json")
    public Response getFunFactByCategory(@QueryParam("category") String category) {
        FunFactDAO dao = new FunFactDAO();
        FunFacts funFact = dao.getRandomFunFactByCategory(category);
        if (funFact != null) {
            return Response.status(Response.Status.OK).entity(funFact.toString()).build();
        }
        String errorMessage = "No results found for category: " + category;
        return Response.status(Response.Status.NOT_FOUND).entity(errorMessage).build();
    }
}
