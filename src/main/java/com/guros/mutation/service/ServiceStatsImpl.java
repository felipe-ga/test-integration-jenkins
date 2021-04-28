package com.guros.mutation.service;

import com.guros.mutation.persistence.dao.RequestStat;
import com.guros.mutation.persistence.entity.EntityDna;
import com.guros.mutation.persistence.interfacerepository.DnaRepository;
import org.apache.commons.logging.Log;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class ServiceStatsImpl implements ServiceStats{
    @Autowired
    private DnaRepository dnaRepository;

    @Override
    public RequestStat getStats() {
        long countHasMutation = dnaRepository.getDnaByHasMutation(true);
        long countHasNotMutation = dnaRepository.getDnaByHasMutation(false);
        float ratio = 0;
        try{
            if(countHasMutation >= countHasNotMutation){
                ratio = (float)countHasNotMutation / countHasMutation;
            }else{
                ratio = (float)countHasMutation / countHasNotMutation;
            }
        }catch (ArithmeticException e){
               e.printStackTrace();
        }
        return new RequestStat(countHasMutation,countHasNotMutation,String.format("%.1f",ratio));
    }

    @Override
    public EntityDna saveDna(EntityDna dna) {
        return dnaRepository.save(dna);
    }
}
