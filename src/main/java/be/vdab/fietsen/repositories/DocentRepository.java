package be.vdab.fietsen.repositories;

import be.vdab.fietsen.domain.Docent;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.Optional;

@Repository
public class DocentRepository {
    private final EntityManager manager;

    public DocentRepository(EntityManager manager) {
        this.manager = manager;
    }
    public Optional<Docent> findById(long id){
        return Optional.ofNullable(manager.find(Docent.class, id));
    }
    public void create(Docent docent){
        manager.persist(docent);
    }

    public void delete(long id){
        findById(id).ifPresent(manager::remove);
    }
}
