package com.guros.mutation.persistence.interfacerepository;

import com.guros.mutation.persistence.entity.EntityDna;

import java.util.List;

public interface DnaRepository {
    public long getDnaByHasMutation(boolean hasMutation);
    public EntityDna save(EntityDna dna);
}
