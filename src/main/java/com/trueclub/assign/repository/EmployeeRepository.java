package com.trueclub.assign.repository;

import com.trueclub.assign.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author mehul jain
 */

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
