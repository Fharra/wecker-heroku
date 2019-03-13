package com.example.wecker.heroku.DEMO.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.wecker.heroku.DEMO.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
