package com.testlab.departmentservice.service.impl;

import com.testlab.departmentservice.dto.DepartmentDto;
import com.testlab.departmentservice.entity.Department;
import com.testlab.departmentservice.exception.ResourceNotFoundException;
import com.testlab.departmentservice.mapper.DepartmentMapper;
import com.testlab.departmentservice.repository.DepartmentRepository;
import com.testlab.departmentservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

        //convert department dto to department JPA entity
        Department department = DepartmentMapper.mapToDepartment(departmentDto);

        // Save Department entity
        Department savedDepartment = departmentRepository.save(department);

        //convert department JPA entity to department dto
        return DepartmentMapper.mapToDepartmentDto(department);
    }

    @Override
    public DepartmentDto getDepartmentByCode(String code) {
        Department departmentCode = departmentRepository.findByDepartmentCode(code).orElseThrow(() -> new ResourceNotFoundException("Department not available with this code: "+ code));
        return DepartmentMapper.mapToDepartmentDto(departmentCode);
    }
}
