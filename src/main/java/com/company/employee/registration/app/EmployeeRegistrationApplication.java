package com.company.employee.registration.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.company.employee.registration.app.entities.Employee;
import com.company.employee.registration.app.service.EmployeeRegistrationServiceImpl;

/**
 * The Spring-Boot application class.
 *
 * @author 310268352
 * @version
 * @since 
 *
 */
@SpringBootApplication
public class EmployeeRegistrationApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(EmployeeRegistrationApplication.class, args);

        EmployeeRegistrationServiceImpl employeeRegistrationService = applicationContext.getBean("employeeRegistrationService", EmployeeRegistrationServiceImpl.class);

        Employee employee = new Employee();
        employee.setFirstName("Aniket");
        employee.setLastName("Kumar");
        employee.setDepartment("Radiology Solutions");
        employee.setDateOfBirth("24/06/1988");
        employee.setGender("Male");
        employeeRegistrationService.createEmployeeRegistration(employee);

        //SpringApplication.run(EmployeeRegistrationApplication.class, args);

    }
}
