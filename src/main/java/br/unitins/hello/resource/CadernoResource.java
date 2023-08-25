package br.unitins.hello.resource;

import java.util.List;

import br.unitins.hello.model.Caderno;
import br.unitins.hello.repository.CadernoRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/cadernos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CadernoResource {

    @Inject
    CadernoRepository repository;

    // Insere um novo caderno
    @POST
    @Transactional
    public Caderno insert(Caderno caderno){
        Caderno novoCaderno = new Caderno();
        novoCaderno.setTitulo(caderno.getTitulo());
        novoCaderno.setColecao(caderno.getColecao());
        novoCaderno.setTamanho(caderno.getTamanho());

        repository.persist(novoCaderno);

        return novoCaderno;
    }

    // Lista todos os cadernos
    @GET
    public List<Caderno> findAll(){
        return repository.listAll();
    }

    // Consulta por id
    @GET
    @Path("/{id}")
    public Caderno findById(@PathParam("id") Long id){
        return repository.findById(id);
    }

    // Consulta por titulo
    @GET
    @Path("/search/titulo/{titulo}")
    public List<Caderno> findByTitulo(@PathParam("titulo") String titulo){
        return repository.findByTitulo(titulo);
    }

    // Procura o caderno pelo id e atualiza as informações
    @PUT
    @Path("/{id}")
    @Transactional
    public Caderno update(@PathParam("id") Long id, Caderno cadernoAtualizado) {
        Caderno cadernoExistente = repository.findById(id);
        cadernoExistente.setTitulo(cadernoAtualizado.getTitulo());
        cadernoExistente.setColecao(cadernoAtualizado.getColecao());
        cadernoExistente.setTamanho(cadernoAtualizado.getTamanho());

        repository.persist(cadernoExistente);

        return cadernoExistente;
    }

    // Procura um caderno pelo id e deleta
    @DELETE
    @Path("/{id}")
    @Transactional
    public void delete(@PathParam("id") Long id) {
        Caderno cadernoParaExcluir = repository.findById(id);
        
        repository.delete(cadernoParaExcluir);
                
    }
    
}