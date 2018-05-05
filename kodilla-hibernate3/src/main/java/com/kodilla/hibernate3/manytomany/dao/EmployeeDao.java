package com.kodilla.hibernate3.manytomany.dao;

import com.kodilla.hibernate3.manytomany.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
}
