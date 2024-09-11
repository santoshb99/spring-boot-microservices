package com.testlab.employeeservice.service;

import com.testlab.employeeservice.dto.APIResponseDto;
import com.testlab.employeeservice.dto.EmployeeDto;

public interface EmployeeService {

    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getByEmployeeid(Long id);
}
