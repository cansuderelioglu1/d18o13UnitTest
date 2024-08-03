package com.rd;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", 2000); // Günlük ücret 2000 TL
        int workedDays1 = 28; // Çalışılan gün sayısı
        double salary1 = employee1.calculateSalary(workedDays1);
        System.out.println("Çalışanın maaşı: " + salary1 + " TL");

        Employee employee2 = new Employee("Cansu Derelioğlu", 3000); // Günlük ücret 3000 TL
        int workedDays2 = 28; // Çalışılan gün sayısı
        double salary2 = employee2.calculateSalary(workedDays2);
        System.out.println("Çalışanın maaşı: " + salary2 + " TL");
    }
}
