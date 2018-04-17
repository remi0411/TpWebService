package WebServices.Controllers;

import com.google.gson.Gson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("ws")
public class HelloWorldController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("hw")
    public String getHelloWorld(){
        Gson gson = new Gson();
        return gson.toJson("Hello world");
    }
}
