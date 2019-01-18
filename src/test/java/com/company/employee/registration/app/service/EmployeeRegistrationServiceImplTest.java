/**
 * Copyright (c) Koninklijke Philips Electronics N.V. 2016 All rights are
 * reserved. Reproduction or transmission in whole or in part, in any form or by
 * any means, electronic, mechanical or otherwise, is prohibited without the
 * prior written consent of the copyright owner.
 * ============================================================ FILENAME:
 */
package com.company.employee.registration.app.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.company.employee.registration.app.dao.EmployeeResgistrationDao;
import com.company.employee.registration.app.entities.Employee;

/**
 *
 * @author aniket.kumar
 * @version
 * @since
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({EmployeeRegistrationServiceImplTest.class})
@PowerMockIgnore("javax.management.*")
public class EmployeeRegistrationServiceImplTest {

    @InjectMocks
    private EmployeeRegistrationServiceImpl employeeRegistrationServiceImpl;

    @Mock
    private EmployeeResgistrationDao employeeResgistrationDaoMock;

    /**
     * Sets the up.
     * 
     * @throws Exception
     *             the exception
     */
    @Before
    public void setUp() throws Exception {
        employeeRegistrationServiceImpl = new EmployeeRegistrationServiceImpl();
        employeeRegistrationServiceImpl.setEmployeeResgistrationDao(employeeResgistrationDaoMock);
    }

    /**
     * Tear down.
     * 
     * @throws Exception
     *             the exception
     */
    @After
    public void tearDown() throws Exception {
        employeeResgistrationDaoMock = null;
        employeeRegistrationServiceImpl = null;
    }

    /**
     * Test case
     * 
     * @throws Exception
     */
    @Test
    public void testCreateEmployeeRegistration() throws Exception {
        PowerMockito.when(employeeResgistrationDaoMock.save(Mockito.any(Employee.class))).thenReturn(new Employee());

        Employee employeeReturned = employeeRegistrationServiceImpl.createEmployeeRegistration(new Employee());

        Mockito.verify(employeeResgistrationDaoMock, Mockito.times(1)).save(Mockito.any(Employee.class));
        Mockito.verifyNoMoreInteractions(employeeResgistrationDaoMock);

        assertThat(employeeReturned).isNotNull();
    }
}
