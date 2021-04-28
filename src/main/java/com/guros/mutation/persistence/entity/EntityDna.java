package com.guros.mutation.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "dna")
public class EntityDna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dna")
    private Integer Id;
    private String sequence;
    @Column(name = "has_mutation")
    private Boolean hasMutation;

    public EntityDna() {

    }

    public EntityDna(String sequence, Boolean hasMutation) {
        this.sequence = sequence;
        this.hasMutation = hasMutation;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public Boolean getHasMutation() {
        return hasMutation;
    }

    public void setHasMutation(Boolean hasMutation) {
        this.hasMutation = hasMutation;
    }
}
