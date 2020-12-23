package com.loja.controller.response;

import com.loja.entity.Estimate;
import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class EstimateResponse {
    private int estimateCode;

    public static EstimateResponse from(Estimate estimate) {
        return EstimateResponse
                .builder()
                    .estimateCode(estimate.getId())
                .build();
    }
}
