/**
 * 
 */
package com.company.employee.registration.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.employee.registration.app.dao.EmployeeResgistrationDao;
import com.company.employee.registration.app.entities.Employee;

/**
 * The {@link EmployeeRegistrationServiceImpl} class that implements
 * {@link EmployeeRegistrationService} interface to provide the definition of
 * all the abstract methods in the interface class.
 * 
 * @author aniket.kumar
 * @version 1.0
 * @since 18/01/2019
 */
@Service
public class EmployeeRegistrationServiceImpl implements EmployeeRegistrationService {

    @Autowired
    private EmployeeResgistrationDao employeeResgistrationDao;

    /**
     * 
     * @param employee
     * @return
     */
    @Override
    public Employee createEmployeeRegistration(Employee employee) {
        return employeeResgistrationDao.save(employee);
    }

    /**
     * 
     * @param employeeId
     * @return
     */
    @Override
    public Employee getEmployeeById(Integer employeeId) {
        return employeeResgistrationDao.findOne(employeeId);
    }

    /**
     * 
     * @return
     */
    @Override
    public Iterable<Employee> getAllRegisteredEmployees() {
        return employeeResgistrationDao.findAll();
    }

    /**
     * @return the employeeResgistrationDao
     */
    public EmployeeResgistrationDao getEmployeeResgistrationDao() {
        return employeeResgistrationDao;
    }

    /**
     * @param employeeResgistrationDao
     *            the employeeResgistrationDao to set
     */
    public void setEmployeeResgistrationDao(EmployeeResgistrationDao employeeResgistrationDao) {
        this.employeeResgistrationDao = employeeResgistrationDao;
    }
}
