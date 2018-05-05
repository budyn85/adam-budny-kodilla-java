package com.kodilla.hibernate3.manytomany.dao;

import com.kodilla.hibernate3.manytomany.Company;
import com.kodilla.hibernate3.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    private Company softwareMachine;
    private Company dataMaesters;
    private Company greyMatter;
    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
        } catch (Exception e) {
            //    //do nothing
            //}
        }
    }
    @Test
    public void testWithFirstOfThreeCharacters() {
        //Given
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);
        //When
        final List<Company> searchedCompanies = companyDao.withFirstOfThreeCharacters("sof");
        //Then
        assertThat(searchedCompanies).hasSize(1);
        //Clean up
        try {
            companyDao.delete(softwareMachine.getId());
            companyDao.delete(dataMaesters.getId());
            companyDao.delete(greyMatter.getId());
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    @Test
    public void findEmployeesWithGivenLastname() {
        //Given
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);
        //When
        final List<Employee> searchedEmployees = employeeDao.findEmployeesWithGivenLastname("Kovalsky");
        //Then
        assertThat(searchedEmployees).hasSize(1);
        //Clean Up
        try {
            companyDao.delete(softwareMachine.getId());
            companyDao.delete(dataMaesters.getId());
            companyDao.delete(greyMatter.getId());
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

}