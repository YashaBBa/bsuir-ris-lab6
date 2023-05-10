package org.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.io.File;
import java.net.URL;

@Path("/phone")
public class PhoneService {
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Response getPhonesData(){
        ClassLoader classLoader = PhoneService.class.getClassLoader();
        URL resource = classLoader.getResource("PhoneNumbers.xml");
        File file = new File(resource.getFile());
        Response.ResponseBuilder response = Response.ok(file);
        return response.build();
    }
}
