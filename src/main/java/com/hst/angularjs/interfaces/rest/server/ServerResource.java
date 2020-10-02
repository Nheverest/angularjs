package com.hst.angularjs.interfaces.rest.server;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.seedstack.seed.Configuration;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("server")
public class ServerResource {

    @Configuration("server.ip")
    String ip;

    @GET
    @Produces("application/json")
    public String ip() throws JsonProcessingException {
        ServerRepresentation rep = new ServerRepresentation(ip);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(rep);
    }

}
