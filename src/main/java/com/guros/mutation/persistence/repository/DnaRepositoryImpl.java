package com.guros.mutation.persistence.repository;

import com.guros.mutation.persistence.crud.DnaCrudRepository;
import com.guros.mutation.persistence.entity.EntityDna;
import com.guros.mutation.persistence.interfacerepository.DnaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DnaRepositoryImpl implements DnaRepository {
    @Autowired
    private DnaCrudRepository dnaCrudRepository;

    @Override
    public long getDnaByHasMutation(boolean hasMutation) {
        return dnaCrudRepository.countByHasMutation(hasMutation);
    }

    @Override
    public EntityDna save(EntityDna dna) {
        return dnaCrudRepository.save(dna);
    }
}
