package com.guros.mutation.persistence.crud;

import com.guros.mutation.persistence.entity.EntityDna;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DnaCrudRepository extends CrudRepository<EntityDna,Integer> {
    long countByHasMutation(boolean hasMutation);
}
