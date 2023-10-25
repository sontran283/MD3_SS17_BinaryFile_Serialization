package Demo2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File dir = new File("src/Demo2/dir.txt");
        dir.mkdirs();

        File file = new File("src/Demo2/test2.txt");
        file.createNewFile();
        FileReader fileReader = new FileReader(file);

        int c = fileReader.read();
        while (c != -1) {
            System.out.println((char) c);
            c = fileReader.read();
        }
        fileReader.close();
    }
}
