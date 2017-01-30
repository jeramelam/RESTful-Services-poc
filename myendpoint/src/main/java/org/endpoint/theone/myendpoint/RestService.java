package org.endpoint.theone.myendpoint;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.endpoint.theone.myendpoint.model.Response;
import org.endpoint.theone.myendpoint.module.ServiceModule;

@Path("requests")
public class RestService {
    ServiceModule servModule = new ServiceModule();
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postService(Response res) {
        return servModule.getProduct(res);
    }
}
