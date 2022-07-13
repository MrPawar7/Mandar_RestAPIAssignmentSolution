package com.greatlearning.employeeManager.EmployeeManager.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.employeeManager.EmployeeManager.entity.Role;



public interface RoleRepository extends JpaRepository<Role, Integer> {

}
