package org.acme.getting.started;

import java.util.ArrayList;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/animals")
public class AnimalsResource {

    @Inject
    AnimalsService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{name}")
    public Animal animalByName(@PathParam String name) {
        return service.byName(name);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Animal> animals() {
        return service.all();
    }
}