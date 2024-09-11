package com.testlab.organizationservice.service.impl;

import com.testlab.organizationservice.dto.OrganizationDto;
import com.testlab.organizationservice.entity.Organization;
import com.testlab.organizationservice.exception.ResourceNotFoundException;
import com.testlab.organizationservice.mapper.OrganizationMapper;
import com.testlab.organizationservice.repository.OrganizationRepository;
import com.testlab.organizationservice.service.OrganizationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {

    private OrganizationRepository organizationRepository;

    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {

        Organization organization = OrganizationMapper.mapToOrganization(organizationDto);
        Organization savedOrganization = organizationRepository.save(organization);
        return OrganizationMapper.mapToOrganizationDto(savedOrganization);
    }

    @Override
    public OrganizationDto getOrganizationByCode(String organizationCode) {
        Organization getOrganization = organizationRepository.findByOrganizationCode(organizationCode).orElseThrow(() -> new ResourceNotFoundException("Organization doesn't exist with the code: "+ organizationCode));

        return OrganizationMapper.mapToOrganizationDto(getOrganization);
    }
}
