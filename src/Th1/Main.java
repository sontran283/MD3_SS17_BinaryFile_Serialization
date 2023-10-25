package Th1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Employee> employeefile = new ArrayList<>();
        List<Skill> skills = new ArrayList<>();

        FileOutputStream fileOutputStream = new FileOutputStream("employee.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        Employee employee = new Employee(1, "son", true, skills);
        Employee employee2 = new Employee(2, "tuan", true, skills);
        employeefile.add(employee);
        employeefile.add(employee2);

        objectOutputStream.writeObject(employeefile);
        objectOutputStream.close();
        System.out.println("ghi thanh cong");


        System.out.println("thuc hien doc file");
        FileInputStream fileInputStream = new FileInputStream("employee.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        System.out.println(objectInputStream.readObject());
        objectInputStream.close();
        System.out.println("ket thuc doc file");
    }
}
