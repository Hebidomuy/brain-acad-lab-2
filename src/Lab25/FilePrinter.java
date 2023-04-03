package Lab25;

import java.io.*;

public class FilePrinter {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\user\\IdeaProjects\\brain-acad-lab-2\\src\\Lab25\\DirectoryFilesPrinter.java");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}