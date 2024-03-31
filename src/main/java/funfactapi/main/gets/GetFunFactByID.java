package funfactapi.main.gets;

import funfactapi.entities.FunFacts;
import funfactapi.persistence.FunFactDAO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/funFactByID")
public class GetFunFactByID {
    @GET
    @Produces("text/json")
    public Response getFunFactByID(@QueryParam("ID") int ID) {
        FunFactDAO dao = new FunFactDAO();
        FunFacts funFact = dao.getRandomFunFactByID(ID);
        if (funFact != null) {
            return Response.status(Response.Status.OK).entity(funFact.toString()).build();
        }
        String errorMessage = "No results found for ID: " + ID;
        return Response.status(Response.Status.NOT_FOUND).entity(errorMessage).build();
    }
}
