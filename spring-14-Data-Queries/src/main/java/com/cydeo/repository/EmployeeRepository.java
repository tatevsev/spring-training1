package com.cydeo.repository;

import com.cydeo.entity.Employee;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

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


    @Query("SELECT employee FROM Employee employee WHERE employee.email='jgresly14@ted.com'")
    Employee retriveEmployeeDetail();



   @Query ("SELECT e.salary FROM Employee e WHERE e.email='jgresly14@ted.com'")
    Integer retriveEmployeeSalary();

   @Query("SELECT e FROM Employee e where e.salary<>?1")//in SQL != is <>
   //Not Equal
    List<Employee> retrieveEmployeeSalaryNotEqual(int salary);


    // Like/Contains/StartsWith/ EndsWith
    @Query("SELECT e FROM Employee e where e.firstName LIKE ?1")

    List<Employee> retrieveEmployeeFirstNameLike(String pattern);

    //Show Employee, with salary LESS THAN
    @Query("SELECT E FROM Employee  E WHERE e.salary < ?1")

    List <Employee> retrieveEmployeeSalaryLessThan(Integer salary);//LESS THAN



    //Show EMPLOYEEs NAMEs, Greater than
    @Query("SELECT E.firstName FROM Employee  E WHERE e.salary > ?1")
    List<String> retrieveEmployeeSalaryMoreThan(Integer salary);

    //Between 50000 and 60000
    @Query("SELECT e FROM Employee e where e.salary BETWEEN ?1 AND ?2")
    List<Employee> retrieveEmployeeSalaryBetween(Integer salary1, Integer salary2);

    //Before
    @Query("SELECT E FROM Employee E where E.hireDate > ?1 ")
    List<Employee> retrieveEmployeeHiredDateBefore(LocalDate date);





}
