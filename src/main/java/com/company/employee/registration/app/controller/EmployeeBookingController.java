/**
 * 
 */
package com.company.employee.registration.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.employee.registration.app.entities.Employee;
import com.company.employee.registration.app.service.EmployeeRegistrationService;

/**
 * @author aniket.kumar
 * @version 1.0
 * @since 18/01/2019
 */
@RestController
@RequestMapping(value = "/api/employeeregistration")
public class EmployeeBookingController {

    @Autowired
    private EmployeeRegistrationService employeeRegistrationService;

    /**
     * The REST API with {@link HttpMethod} as POST having a {@link RequestBody}
     * as an {@link Employee} object to register a new employee in the system.
     * The {@link ResponseBody} is an registered {@link Employee} object.
     * 
     * @param employee
     *            the {@link RequestBody}
     * @return the registered employee object.
     */
    @PostMapping(value = "/create")
    public Employee createEmployeeRegistration(@RequestBody Employee employee) {
        return employeeRegistrationService.createEmployeeRegistration(employee);
    }

    /**
     * The REST API with {@link HttpMethod} as GET having a {@link PathVariable}
     * as an emplyeeId to return the associated {@link Employee} from the passed
     * emplyeeId. The {@link ResponseBody} is an registered {@link Employee}
     * object.
     * 
     * @param employeeId
     *            the Id of the employee for which employee is being searched.
     * @return the searched {@link Employee} object.
     */
    @GetMapping(value = "/employee/{employeeid}")
    public Employee getTicketById(@PathVariable("employeeid") Integer employeeId) {
        return employeeRegistrationService.getEmployeeById(employeeId);
    }

    /**
     * The REST API with {@link HttpMethod} as GET to return all the
     * {@link Employee}s registered in the system. The {@link ResponseBody} is a
     * list of all the employees. object.
     * 
     * @return
     */
    @GetMapping(value = "/employee/allemployees")
    public Iterable<Employee> getAllRegisteredEmployees() {
        return employeeRegistrationService.getAllRegisteredEmployees();
    }
}
