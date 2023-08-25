package br.unitins.hello.repository;

import java.util.List;

import br.unitins.hello.model.Caderno;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CadernoRepository implements PanacheRepository<Caderno>{
    public List<Caderno> findByTitulo(String titulo) {
        return find("UPPER(titulo) LIKE UPPER(?1) ", "%"+titulo+"%").list();
    }
}
