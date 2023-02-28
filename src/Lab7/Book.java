package Lab7;


import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

public class Book {

    static final int VOLUMES = 4;

    private String name;
    private int pages;
    private int chapters;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    public void displayInfo() {
        System.out.println("Мы создали книгу под названием " + name + ", страниц в книге - " + pages + " и еще " + chapters + " глав, томов - " + VOLUMES);
    }
}
