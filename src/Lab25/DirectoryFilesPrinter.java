package Lab25;

import java.io.File;

public class DirectoryFilesPrinter {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\user\\IdeaProjects\\brain-acad-lab-2\\src\\Lab25");
        if (file.exists() && file.isDirectory()) {
            printNames(file);
        } else {
            System.out.println("Каталог не существует или пуст");
        }
    }
    public static void printNames(File directory) {
        File[] files = directory.listFiles();
        if (files != null && files.length > 0) {
            for (File file : files) {
                if (file.isDirectory()) {
                    printNames(file);
                } else {
                    System.out.println(file.getName());
                }
            }
        }
    }
}