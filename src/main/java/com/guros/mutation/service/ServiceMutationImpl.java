package com.guros.mutation.service;

import com.guros.mutation.persistence.interfacerepository.Mutable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceMutationImpl implements ServiceMutation{
    @Autowired
    private Mutable mutable;

    @Override
    public boolean hasMutation(String[] dna) {
        return mutable.hasMutable(dna);
    }
}
