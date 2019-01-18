/**
 * 
 */
package com.company.employee.registration.app.service;

import com.company.employee.registration.app.entities.Employee;

/**
 * The {@link EmployeeRegistrationService} interface which contains methods
 * related to employee registration service.
 * 
 * @author aniket.kumar
 * @version 1.0
 * @since 18/01/2019
 */
public interface EmployeeRegistrationService {

    /**
     * Service method that creates a new employee registration by inserting a
     * new Employee record in the database.
     * 
     * @param employee
     * @return
     */
    public Employee createEmployeeRegistration(Employee employee);

    /**
     * Service method that retrieves a single employee associated with the
     * passed employeeId into the database.
     * 
     * @param employeeId
     * @return
     */
    public Employee getEmployeeById(Integer employeeId);

    /**
     * Service method that retrieves all employee records from the database.
     * 
     * @return
     */
    public Iterable<Employee> getAllRegisteredEmployees();
}
