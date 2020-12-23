package com.loja.controller;

import com.loja.controller.request.EstimateRequest;
import com.loja.entity.Estimate;
import com.loja.exception.EstimateNotFoundException;
import com.loja.controller.response.EstimateResponse;
import com.loja.service.EstimateService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estimate")
public class EstimateController {

    private EstimateService estimateService;

    public EstimateController(EstimateService estimateService) {
        this.estimateService = estimateService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EstimateResponse create(@RequestBody EstimateRequest estimateRequest) {
        Estimate estimateEntity = estimateService.create(estimateRequest);
        return EstimateResponse.builder()
                .estimateCode(estimateEntity.getId())
                .build();
    }

    @GetMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Estimate get(@PathVariable int id) {
        return estimateService
                .getEstimate(id)
                .orElseThrow(() -> new EstimateNotFoundException(id));
    }
}
