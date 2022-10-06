package com.company.java_core.homework19.task1;

import java.io.*;

public class Main extends Methods{
    public static void main(String[] args) throws Exception {
        File file = new File("text.txt");

        Employee employee1 = new Employee("Paul", 56, 1234.87);

        serialize(file, (Serializable) employee1);

        Employee employee2 = (Employee) deserialize(file);
        System.out.println(employee2);
    }
}

