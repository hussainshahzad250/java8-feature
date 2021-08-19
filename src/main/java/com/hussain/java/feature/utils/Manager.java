package com.hussain.java.feature.utils;

import com.hussain.java.feature.dto.Employee;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class Manager {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee(1, "A", 90000), new Employee(1, "B", 100000),
                new Employee(1, "C", 60000), new Employee(1, "D", 40000));

        double sum = employees.stream().filter(o -> o.getSalary() > 50000).mapToDouble(Employee::getSalary).sum();
        log.info("SUM = " + sum);
        double reduce = employees.stream().filter(o -> o.getSalary() > 50000).mapToDouble(Employee::getSalary).reduce(0,
                Double::sum);
        log.info("SUM =" + reduce);
    }
}
