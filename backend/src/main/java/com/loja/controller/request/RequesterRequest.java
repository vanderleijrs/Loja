package com.loja.controller.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequesterRequest {
    private String cellphone;
    private String email;
    private String fullName;
    
}
