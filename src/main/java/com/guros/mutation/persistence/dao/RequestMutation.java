package com.guros.mutation.persistence.dao;

import java.util.Arrays;

public class RequestMutation {
    private String[] dna;

    public String[] getDna() {
        return dna;
    }

    public void setDna(String[] dna) {
        this.dna = dna;
    }

    @Override
    public String toString() {
        return Arrays.toString(dna);
    }
}
