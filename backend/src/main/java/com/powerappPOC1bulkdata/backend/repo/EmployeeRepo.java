package com.powerappPOC1bulkdata.backend.repo;

import com.powerappPOC1bulkdata.backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
