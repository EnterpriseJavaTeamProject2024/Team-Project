package funfactapi.main.gets;

import funfactapi.entities.FunFacts;
import funfactapi.persistence.FunFactDAO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/randomFunFact")
public class GetRandomFunFact {
    @GET
    @Produces("text/json")
    public Response getRandomFunFact() {
        FunFactDAO dao = new FunFactDAO();
        FunFacts funFact = dao.getRandomFunFact();
        if (funFact != null) {
            return Response.status(Response.Status.OK).entity(funFact.toString()).build();
        }
        String errorMessage = "ERROR: No results found";
        return Response.status(Response.Status.NOT_FOUND).entity(errorMessage).build();
    }
}

