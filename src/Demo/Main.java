package Demo;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p1 = new Person(1, "nguyen van a");
        File file = new File("src/Demo/test.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(p1);
        objectOutputStream.close();
        System.out.println("luu thanh cong");

        // để ghi dữ liệu vào file
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person p = (Person) objectInputStream.readObject();
        System.out.println(p.getName() + p.getId());
    }
}
