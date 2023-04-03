package Lab25;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        File source = new File("C:\\Users\\user\\IdeaProjects\\brain-acad-lab-2\\src\\Lab25\\DirectoryFilesPrinter.java");
        File target = new File("C:\\Users\\user\\IdeaProjects\\brain-acad-lab-2\\src\\Lab25\\FilePrinter.java");
        try (InputStream in = new FileInputStream(source);
             OutputStream out = new FileOutputStream(target)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
            System.out.println("Файл скопирован успешно!");
        } catch (IOException e) {
            System.out.println("Ошибка при копировании файла: " + e.getMessage());
        }
    }
}