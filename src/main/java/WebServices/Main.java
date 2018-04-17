package WebServices;

import WebServices.Controllers.HelloWorldController;
import com.sun.net.httpserver.HttpServer;
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import sun.net.httpserver.HttpServerImpl;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        URI baseUri = UriBuilder.fromUri("http://localhost/").port(9999).build();
        Set classes = new HashSet();
        classes.add(HelloWorldController.class);
        ResourceConfig config = new ResourceConfig(classes);
        HttpServer server = JdkHttpServerFactory.createHttpServer(baseUri, config);
    }
}
