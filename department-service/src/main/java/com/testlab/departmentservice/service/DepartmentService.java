package com.testlab.departmentservice.service;

import com.testlab.departmentservice.dto.DepartmentDto;

public interface DepartmentService {

    DepartmentDto saveDepartment(DepartmentDto department);
    DepartmentDto getDepartmentByCode(String code);
}
