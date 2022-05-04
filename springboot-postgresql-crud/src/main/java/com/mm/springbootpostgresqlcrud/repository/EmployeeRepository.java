package com.mm.springbootpostgresqlcrud.repository;

import com.mm.springbootpostgresqlcrud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
