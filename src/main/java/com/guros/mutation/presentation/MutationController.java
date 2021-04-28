package com.guros.mutation.presentation;

import com.guros.mutation.persistence.dao.RequestMutation;
import com.guros.mutation.persistence.dao.RequestStat;
import com.guros.mutation.persistence.entity.EntityDna;
import com.guros.mutation.service.ServiceMutation;
import com.guros.mutation.service.ServiceStats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class MutationController {

    @Autowired
    private ServiceMutation serviceMutation;


    @Autowired
    private ServiceStats serviceStats;

    @PostMapping("mutation")
    public ResponseEntity hasMutable(@RequestBody RequestMutation dna){
        HttpStatus status = HttpStatus.OK;
        boolean hasMutation = true;
        if(!serviceMutation.hasMutation(dna.getDna())){
            hasMutation = false;
            status = HttpStatus.FORBIDDEN;
        }
        serviceStats.saveDna(new EntityDna(dna.getDna().toString(),hasMutation));
        return new ResponseEntity(status);
    }

    @GetMapping("stats")
    public ResponseEntity<RequestStat> stats(){
        return new ResponseEntity(serviceStats.getStats(), HttpStatus.OK);
    }
}
