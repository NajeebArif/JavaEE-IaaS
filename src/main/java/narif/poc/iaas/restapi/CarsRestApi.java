package narif.poc.iaas.restapi;

import narif.poc.iaas.service.CarFactoryService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.Objects;

@Path("cars")
public class CarsRestApi {

    @Inject
    private CarFactoryService carFactoryService;

    @Context
    private UriInfo uriInfo;

    @POST
    public Response createCar(@QueryParam("modelNumber") String modelNumber,
                              @QueryParam("name") String name){
        Objects.requireNonNull(modelNumber,"Please provide a model number to create a car.");
        Objects.requireNonNull(name,"Please provide a name to create a car.");
        carFactoryService.createCar(modelNumber, name);
        return Response.status(Response.Status.CREATED).build();
    }

    @GET
    @Path("{modelNumber}")
    public Response fetchCarForModel(@PathParam("modelNumber") String modelNumber){
        return Response.ok(carFactoryService.getCarForModelNumber(modelNumber),"application/json").build();
    }

    @GET
    @Path("greet")
    public Response greetTheWorld(){
        return Response.ok("Welcome to the worlds best Car Company!").build();
    }
}
