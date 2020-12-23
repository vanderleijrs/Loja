package com.loja.service;

import com.loja.controller.request.EstimateRequest;
import com.loja.entity.Estimate;
import com.loja.entity.Requester;
import com.loja.entity.Residue;
import com.loja.entity.ResidueAddress;
import org.springframework.stereotype.Service;

@Service
public class EstimateConverterService {
    public Estimate converter(EstimateRequest request) {
        return Estimate
                .builder()
                .requester(Requester.builder()
                                .fullName(request.getRequester().getFullName())
                                .cellphone(request.getRequester().getCellphone())
                                .email(request.getRequester().getEmail())
                                .build()
                )
                .residueAddress(ResidueAddress.builder()
                        .cep(request.getResidueAddress().getCep())
                        .locationInfo(request.getResidueAddress().getLocationInfo())
                        .build()
                )
                .residue(Residue.builder()
                        .residueMeasure(request.getResidueRequest().getResidueMeasure())
                        .residueType(request.getResidueRequest().getResidueType())
                        .build()
                )
                .build();

    }
}
