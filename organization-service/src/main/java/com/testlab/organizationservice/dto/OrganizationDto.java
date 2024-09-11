package com.testlab.organizationservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationDto {
    private Long id;
    private String organizationName;
    private String organizationDesc;
    private String organizationCode;
    private LocalDateTime timestamp;
}
