package Lab7;

import Lab7.Book;

public  class Main {
    public static void main(String[] args) {
        Book history = new Book();

        history.setName("Война и мир");
        history.setPages(1300);
        history.setChapters(374);


        history.displayInfo();
    }
}





