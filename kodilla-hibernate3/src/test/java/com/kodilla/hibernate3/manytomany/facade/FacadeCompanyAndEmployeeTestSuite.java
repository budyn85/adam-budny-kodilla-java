package com.kodilla.hibernate3.manytomany.facade;

import com.kodilla.hibernate3.manytomany.Company;
import com.kodilla.hibernate3.manytomany.Employee;
import com.kodilla.hibernate3.manytomany.dao.CompanyDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeCompanyAndEmployeeTestSuite {
    @Autowired
    private FacadeCompanyAndEmployee facadeCompanyAndEmployee;
    @Autowired
    private CompanyDao companyDao;

    private ArrayList<Company> resultCompanyList = new ArrayList<>();
    private ArrayList<Employee> resultEmployeeList = new ArrayList<>();


    @Test
    public void companyNameTest() {

        //Given
        Employee billGate = new Employee("Bill", "Gate");
        Employee antonioBolt = new Employee("Antonio", "Bolt");
        Employee amyWhite = new Employee("Amy", "White");

        Company robotic = new Company("Robotic");
        Company newTechnology = new Company("New Technology");
        Company shapes = new Company("Shapes");

        robotic.getEmployees().add(billGate);
        newTechnology.getEmployees().add(antonioBolt);
        newTechnology.getEmployees().add(amyWhite);
        shapes.getEmployees().add(billGate);
        shapes.getEmployees().add(amyWhite);

        billGate.getCompanies().add(robotic);
        billGate.getCompanies().add(shapes);
        antonioBolt.getCompanies().add(newTechnology);
        amyWhite.getCompanies().add(newTechnology);
        amyWhite.getCompanies().add(shapes);

        companyDao.save(robotic);
        companyDao.save(newTechnology);
        companyDao.save(shapes);

        resultCompanyList.add(robotic);
        resultCompanyList.add(newTechnology);

        resultEmployeeList.add(billGate);
        resultEmployeeList.add(amyWhite);
        //When
        List<Company> queryResult = facadeCompanyAndEmployee.companyName("nol");
        //Then
        Assert.assertEquals(resultCompanyList.size(), queryResult.size());
        //CleanUp
        try {
            companyDao.delete(robotic);
            companyDao.delete(newTechnology);
            companyDao.delete(shapes);
        } catch (Exception e) {
            //do nothing
        }

    }

    @Test
    public void employeeNameTest() {

        //Given

        Employee billGate = new Employee("Bill", "Gate");
        Employee antonioBolt = new Employee("Antonio", "Bolt");
        Employee amyWhite = new Employee("Amy", "White");

        Company robotic = new Company("Robotic");
        Company newTechnology = new Company("New Technology");
        Company shapes = new Company("Shapes");

        robotic.getEmployees().add(billGate);
        newTechnology.getEmployees().add(antonioBolt);
        newTechnology.getEmployees().add(amyWhite);
        shapes.getEmployees().add(billGate);
        shapes.getEmployees().add(amyWhite);

        billGate.getCompanies().add(robotic);
        billGate.getCompanies().add(shapes);
        antonioBolt.getCompanies().add(newTechnology);
        amyWhite.getCompanies().add(newTechnology);
        amyWhite.getCompanies().add(shapes);

        companyDao.save(robotic);
        companyDao.save(newTechnology);
        companyDao.save(shapes);

        resultCompanyList.add(robotic);
        resultCompanyList.add(newTechnology);

        resultEmployeeList.add(billGate);
        resultEmployeeList.add(amyWhite);


        //When
        List<Employee> queryResult = facadeCompanyAndEmployee.employeeName("nio");
        //Then
        Assert.assertEquals(resultEmployeeList.size(), queryResult.size());

        try {
            companyDao.delete(robotic);
            companyDao.delete(newTechnology);
            companyDao.delete(shapes);
        } catch (Exception e) {
            //do nothing
        }
    }
}
