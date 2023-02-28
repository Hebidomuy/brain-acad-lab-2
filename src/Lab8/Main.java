package Lab8;

import Lab8.Book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book (400, 4);

        book.goToPage(45);
        book.goToPage(45d);

        book.getChapters();
        book.getChapterByPage(399);

        System.out.println(Book.pagesByChapter(400, 4));

        Book book2 = new Book (700, 7);

        book2.goToPage(75);
        book2.goToPage(47d);

        book2.getChapters();
        book2.getChapterByPage(379);

        System.out.println(book2);
    }
}
