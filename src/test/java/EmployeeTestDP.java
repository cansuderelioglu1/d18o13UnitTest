package com.rd;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmployeeTestDP {

    @DataProvider(name = "salaryData")
    public Object[][] salaryData() {
        return new Object[][] {
                {"John Doe", 2000, 28, 59000.0}, // Günlük maaş 2000 TL ve 28 gün çalışılmış
                {"Jane Doe", 3000, 30, 95000.0}, // Günlük maaş 3000 TL ve 30 gün çalışılmış
                {"Alice", 2500, 26, 66000.0},     // Günlük maaş 2500 TL ve 26 gün çalışılmış
                {"Bob", 1500, 20, 30000.0}        // Günlük maaş 1500 TL ve 20 gün çalışılmış
        };
    }

    @Test(dataProvider = "salaryData")
    public void testCalculateSalaryWithDataProvider(String name, double dailySalary, int workedDays, double expectedSalary) {
        Employee employee = new Employee(name, dailySalary);
        double salary = employee.calculateSalary(workedDays);
        Assert.assertEquals(salary, expectedSalary, "Maaş hesaplaması hatalı!"); // Doğru maaş hesaplanmalı
    }
}
