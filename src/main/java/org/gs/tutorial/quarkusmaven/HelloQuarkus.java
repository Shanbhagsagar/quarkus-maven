package org.gs.tutorial.quarkusmaven;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloQuarkus {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return Service.print();
    }
}
