package ra.data;

import ra.data.models.Student;

import java.io.*;

public class DemoObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("student.dat");
        FileOutputStream fileOutputStream = new FileOutputStream("student.dat");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        Student student = new Student(1, "son", 26, true);
        outputStream.writeObject(student);
        outputStream.close();
        System.out.println("ghi thanh cong");


        System.out.println("thuc hien doc file");
        FileInputStream fileInputStream = new FileInputStream("student.dat");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        Student student1 = (Student) inputStream.readObject();
        System.out.println(student1);
        inputStream.close();
        System.out.println("ket thuc doc file");
    }
}
