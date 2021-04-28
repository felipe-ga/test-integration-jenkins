package com.guros.mutation.service;

import com.guros.mutation.persistence.dao.RequestStat;
import com.guros.mutation.persistence.entity.EntityDna;

public interface ServiceStats {
    public RequestStat getStats();
    public EntityDna saveDna(EntityDna dna);
}
