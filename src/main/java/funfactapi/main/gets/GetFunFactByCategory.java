package funfactapi.main.gets;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("funFactByCategory")
public class GetFunFactByCategory {
    @GET
    @Produces("text/json")
    public Response getFunFactByCategory(@QueryParam("category") String category) {
        String output = "I am Alive ";
        return Response.status(200).entity(output).build();
    }
}
