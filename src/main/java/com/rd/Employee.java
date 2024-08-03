package com.rd;

public class Employee {
    String name;
    double dailySalary;

    public Employee(String name, double dailySalary) {
        this.name = name;
        this.dailySalary = dailySalary;
    }

    public double calculateSalary(int workedDays) {
        double baseSalary = workedDays * dailySalary;
        double bonus = (workedDays > 25) ? (workedDays - 25) * 1000 : 0;
        return baseSalary + bonus;
    }
}
