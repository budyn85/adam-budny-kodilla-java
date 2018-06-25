package com.kodilla.hibernate3.manytomany.facade;

import com.kodilla.hibernate3.manytomany.Company;
import com.kodilla.hibernate3.manytomany.Employee;
import com.kodilla.hibernate3.manytomany.dao.CompanyDao;
import com.kodilla.hibernate3.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacadeCompanyAndEmployee {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> companyName(String fragmentOfTheName) {
        return companyDao.companyNameLike(fragmentOfTheName);
    }

    public List<Employee> employeeName(String fragmentOfTheName){
        return employeeDao.employeeName(fragmentOfTheName);
    }
}
