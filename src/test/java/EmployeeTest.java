package com.rd;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeTest {

    @Test
    public void testCalculateSalary() {
        // Test senaryosu: 28 gün çalışmış bir çalışanın maaşını hesapla
        Employee employee = new Employee("John Doe", 2000); // Günlük ücret 2000 TL
        int workedDays = 28; // Çalışılan gün sayısı

        double salary = employee.calculateSalary(workedDays);

        // Beklenen maaş: 28 gün * 2000 TL/gün + (28 - 25) gün * 1000 TL/bonus
        double expectedSalary = (28 * 2000) + (3 * 1000);

        Assert.assertEquals(salary, expectedSalary, "Maaş hesaplaması hatalı!");
    }
}
