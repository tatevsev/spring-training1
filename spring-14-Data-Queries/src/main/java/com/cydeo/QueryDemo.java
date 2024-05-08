package com.cydeo;

import com.cydeo.repository.CourseRepository;
import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QueryDemo implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;
    private final CourseRepository courseRepository;

    public QueryDemo(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository, CourseRepository courseRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("-----------------------REGIONS--------------------------------");

        System.out.println("findByCounty:" + regionRepository.findByCountry("Canada"));
        System.out.println("findByCountyContaining:" + regionRepository.findByCountryContaining("United"));
        System.out.println("findByCountyContainingInOrder:" + regionRepository.findByCountryContainsOrderByRegionDesc("United"));
        System.out.println("findTop2ByCountry:" + regionRepository.findTop2ByCountry("United States"));
        System.out.println("findTopByCountryContainsOrderByRegion:" + regionRepository.findTopByCountryContainsOrderByRegion("United States"));

        System.out.println("--------------------------DEPARTMENTS--------------------------------");
        System.out.println("findByDepartments" + departmentRepository.findByDepartment("Furniture"));
        System.out.println("findDepartmentsBy" + departmentRepository.findDepartmentByDivision("Health"));
        System.out.println("findDepartmentsEndsWith" + departmentRepository.findByDivisionEndingWith("ics"));
        System.out.println("findDistinctTop3ByDivisionContains" + departmentRepository.findDistinctTop3ByDivisionContains("Hea"));

    System.out.println("--------------------------EMPLOYEES------------------------------");
        System.out.println("findByemail" + employeeRepository.findByEmail("acurwood6@1und1.de"));
        System.out.println(employeeRepository.findByFirstNameAndLastNameOrEmail("Berrie", "Manueau", "zbreemo@abc.net.au"));
        System.out.println(employeeRepository.findByFirstNameIsNot("Berrie"));
        System.out.println(employeeRepository.findBySalaryIsGreaterThanEqualOrderBySalary(100000));
        System.out.println(employeeRepository.findDistinctTop3BySalaryIsLessThan(70000));


        System.out.println(employeeRepository.retriveEmployeeDetail());
        System.out.println(employeeRepository.retriveEmployeeSalary());
    }
}
