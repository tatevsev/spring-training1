package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //Display all employees with email address""
    List<Employee> findByEmail(String email);


    //Display all employees with firstName "" and lastName"", also show all employees with an email address""
    //basically it will show one person with matching firstName, lastName and also if email is different will show second person
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstName, String lastName, String email);

    //Display all employees that firstname is not ""
    List<Employee> findByFirstNameIsNot(String firstName);

    //Display all the employees where last name starts ith""
    List<Employee> findByLastNameStartingWith(String pattern);

        //Display all employees with salaries less than""
    List<Employee> findBySalaryIsLessThan(Integer salary);

    //Display all emplployees with salaries more than
    List<Employee> findBySalaryIsGreaterThan(Integer salary);

    //display all employees that has been hired between "" and ""
    List<Employee> findByHireDateBetween(LocalDate start, LocalDate end);

    //Display all employees where salaries greater and equal to "" in order
    List<Employee> findBySalaryIsGreaterThanEqualOrderBySalary(Integer salary);

    //Display top unique 3 employees who are making less than ""
    List<Employee> findDistinctTop3BySalaryIsLessThan(Integer salary);

    //Display all employees that dont have email address
    List<Employee> findByEmailIsNull();


}
