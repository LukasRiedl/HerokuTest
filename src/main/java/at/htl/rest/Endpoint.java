package at.htl.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.*;

@Path("herokutest")
public class Endpoint {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRequest()
    {
        return Response.status(200).entity("test").build();
    }

}
