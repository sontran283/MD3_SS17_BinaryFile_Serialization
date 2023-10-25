package Th3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String sourceFile = "src/Th3/file.txt";
        String targetFile = "src/Th3/copyFile.txt";

        try {
            File file = new File(sourceFile);
            if (!file.exists()) {
                file.createNewFile();
                return;
            }

            File target = new File(targetFile);
            if (!target.exists()) {
                target.createNewFile();
                return;
            }

            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(target);

            byte[] buffer = new byte[1328];
            int bytesRead;
            int totalBytes = 0;

            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
                totalBytes += bytesRead;
            }

            fileInputStream.close();
            fileOutputStream.close();

            System.out.println("Sao chép thành công. Số byte đã sao chép: " + totalBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
