package com.testlab.employeeservice.mapper;

import com.testlab.employeeservice.dto.EmployeeDto;
import com.testlab.employeeservice.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        return new EmployeeDto(employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getEmail(), employee.getDepartmentCode(), employee.getOrganizationCode());
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto) {
        return new Employee(employeeDto.getId(), employeeDto.getFirstName(), employeeDto.getLastName(), employeeDto.getEmail(), employeeDto.getDepartmentCode(), employeeDto.getOrganizationCode());
    }
}
