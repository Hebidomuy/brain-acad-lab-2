package Lab8;

public class Book {
    private int pageCount;
    private int chapterCount;

    public Book(int pageCount, int chapterCount) {
        this.pageCount = pageCount;
        this.chapterCount = chapterCount;
    }

    public void goToPage(int page) {
        System.out.println("Вы перелистнули на страницу #" + page);
        System.out.println();
    }

    public void goToPage(double page) {
        System.out.println("Перегруженный метод");
        System.out.println("Вы перелистнули на страницу #" + page);
        System.out.println();
    }

    public void getChapters() {
        for (int i = 1; i <= chapterCount; i++) {
            System.out.println("Глава #" + i);
        }
        System.out.println();
    }

    public void getChapterByPage(int page) {
        double temp = Book.pagesByChapter(pageCount, chapterCount);
        for (int i = 1; i <= temp; i++) {
            if (page < (temp * i)) {
                System.out.println("Глава #" + i);
                break;
            }
        }
        System.out.println();
    }

    public static double  pagesByChapter(int pageCount, int chapterCount) {
        return (double) pageCount / chapterCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "pageCount=" + pageCount +
                ", chapterCount=" + chapterCount +
                '}';
    }
}