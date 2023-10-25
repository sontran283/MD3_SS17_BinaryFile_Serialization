package ra.data;

import ra.data.models.Student;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoDataOutStream {
    public static void main(String[] args) throws IOException {
        File fileStudent = new File("dataOut.dat");
        fileStudent.createNewFile();

        Student student = new Student(1, "son", 26, true);
        boolean status = true;
        double PI = 3.14;
        String language = "java";

        FileOutputStream fos = new FileOutputStream(fileStudent);

        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF(language);
        dos.writeDouble(PI);
        dos.writeBoolean(status);
        dos.close();
    }
}
