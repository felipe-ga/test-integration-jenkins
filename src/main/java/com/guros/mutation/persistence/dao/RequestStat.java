package com.guros.mutation.persistence.dao;

public class RequestStat {
    private long count_mutations;
    private long count_no_mutations;
    private String ratio;

    public RequestStat() {
        this.count_mutations = 0;
        this.count_no_mutations = 0;
        this.ratio = "0";
    }

    public RequestStat(long count_mutations, long count_no_mutations, String ratio) {
        this.count_mutations = count_mutations;
        this.count_no_mutations = count_no_mutations;
        this.ratio = ratio;
    }

    public long getCount_mutations() {
        return count_mutations;
    }

    public void setCount_mutations(long count_mutations) {
        this.count_mutations = count_mutations;
    }

    public long getCount_no_mutations() {
        return count_no_mutations;
    }

    public void setCount_no_mutations(long count_no_mutations) {
        this.count_no_mutations = count_no_mutations;
    }

    public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio;
    }
}
