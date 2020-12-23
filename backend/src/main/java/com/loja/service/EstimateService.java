package com.loja.service;

import com.loja.controller.request.EstimateRequest;
import com.loja.entity.Estimate;
import com.loja.repository.EstimateRepository;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EstimateService {

    private EstimateRepository estimateRepository;
    private EstimateConverterService estimateConverterService;


    EstimateService(EstimateRepository repository, EstimateConverterService estimateConverter) {
        this.estimateRepository = repository;
        this.estimateConverterService = estimateConverter;
    }



    public Estimate create(EstimateRequest estimateRequest) {
        Estimate estimateEntity = estimateConverterService.converter(estimateRequest);
        return estimateRepository.save(estimateEntity);
    }

    public Optional<Estimate> getEstimate(int codigo) {
        return estimateRepository.findById(codigo);
    }

    }


