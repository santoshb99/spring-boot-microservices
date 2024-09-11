package com.testlab.employeeservice.service;

import com.testlab.employeeservice.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url = "http://localhost:8081", value = "DEPARTMENT-SERVICE")
@FeignClient(name = "DEPARTMENT-SERVICE")  //removed url to manage auto load balancing on multiple instances
public interface APIClient {

    @GetMapping("/api/departments/{id}")
    DepartmentDto getDepartmentByCode(@PathVariable("id") String departmentCode);
}
