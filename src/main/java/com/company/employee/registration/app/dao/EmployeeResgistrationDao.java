/**
 * 
 */
package com.company.employee.registration.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.company.employee.registration.app.entities.Employee;

/**
 * @author aniket.kumar
 * @version 1.0
 * @since 18/01/2019
 */
public interface EmployeeResgistrationDao extends CrudRepository<Employee, Integer> {

}
