package com.testlab.organizationservice.mapper;

import com.testlab.organizationservice.dto.OrganizationDto;
import com.testlab.organizationservice.entity.Organization;

public class OrganizationMapper {

    public static OrganizationDto mapToOrganizationDto(Organization organization){
        return new OrganizationDto(organization.getId(), organization.getOrganizationName(), organization.getOrganizationDesc(), organization.getOrganizationCode(), organization.getTimestamp());
    }

    public static Organization mapToOrganization(OrganizationDto organizationDto){
        return new Organization(organizationDto.getId(), organizationDto.getOrganizationName(), organizationDto.getOrganizationDesc(), organizationDto.getOrganizationCode(), organizationDto.getTimestamp());
    }
}
