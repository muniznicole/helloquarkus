package br.unitins.hello.resource;

import java.util.List;

import br.unitins.hello.model.Caderno;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/cadernos")
public class CadernoResource {

    //Lista todos os cadernos
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Caderno> todosCadernos() {
        return Caderno.listAll();
    }
    
}