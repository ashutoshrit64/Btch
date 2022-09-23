package com.bridgelabz.springbatchexample.config;

import com.bridgelabz.springbatchexample.entity.Candidates;
import org.springframework.batch.item.ItemProcessor;

public class CandidateProcessor implements ItemProcessor<Candidates, Candidates> {

    @Override
    public Candidates process(Candidates candidates) throws Exception {
            return candidates;
    }
    
}