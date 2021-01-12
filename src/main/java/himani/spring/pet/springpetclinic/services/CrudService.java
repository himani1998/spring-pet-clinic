package himani.spring.pet.springpetclinic.services;

import java.util.Set;

public interface CrudService<T,ID> {

    Set<T> findAll();

    T findById(ID id);


    T save(T object);


    void Delete(T object);

    void DeleteById(ID id);


}
