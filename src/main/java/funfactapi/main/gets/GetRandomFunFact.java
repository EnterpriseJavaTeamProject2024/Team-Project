package funfactapi.main.gets;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/randomFunFact")
public class GetRandomFunFact {
    @GET
    @Produces("text/json")
    public Response getRandomFunFact() {
        String output = "I am alive";
        return Response.status(200).entity(output).build();
    }
}

