package com.testlab.departmentservice.mapper;

import com.testlab.departmentservice.dto.DepartmentDto;
import com.testlab.departmentservice.entity.Department;

public class DepartmentMapper {
    public static DepartmentDto mapToDepartmentDto(Department department){
        return new DepartmentDto(department.getId(), department.getDepartmentName(), department.getDepartmentDesc(), department.getDepartmentCode());
    }

    public static Department mapToDepartment(DepartmentDto departmentDto){
        return new Department(departmentDto.getId(), departmentDto.getDepartmentName(), departmentDto.getDepartmentDesc(), departmentDto.getDepartmentCode());
    }
}
