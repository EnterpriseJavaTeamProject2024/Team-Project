package funfactapi.main.deletes;

import funfactapi.persistence.AdminDAO;
import funfactapi.persistence.FunFactDAO;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/deleteFunFact")
public class DeleteFunFact {

    @DELETE
    @Produces("application/json")
    public Response deleteFunFact(@QueryParam("ID") int ID,
                                  @QueryParam("adminKey") String adminKey)
    {
        AdminDAO adminDao = new AdminDAO();
         if (adminDao.validAdminKey(adminKey)) {
        FunFactDAO dao = new FunFactDAO();
        boolean deleted = dao.deleteFunFact(ID);
        if (deleted) {
            return Response.status(Response.Status.OK).entity("Fun fact with ID " + ID + " deleted successfully").build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).entity("Fun fact with ID " + ID + " not found").build();
        }

        } else {

             return Response.status(Response.Status.UNAUTHORIZED).entity("Invalid admin key").build();
         }
    }
}
