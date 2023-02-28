package Lab9;

import Lab10.Film;
import Lab10.Library;

public class Main {

    public static void main(String[] args) {
        //String s1 = "1";
        //String s2 = "2";

        //if ("123123".equals("123123")){

        //}

        //if ("fdsfsdf".equals("sdfsdf")){

        //}

        //Circle circle = new Circle(20);
        //Circle circle1 = new Circle(30, "Green");
        //Circle circle2 = new Circle(5, 3.14);
        //circle2.SquareAndCircumference(10, 20, "Red");

        //Pizza pizza = new Pizza("\nCaesar ", "meat, cheese, tomato ", 100, 20);
        //System.out.println();
        //String[] Pizza = {"Name: Ceasar ", "Composition: meat, cheese, tomato ", "Cost: 100 гривень", "Diameter: 20\n", "Name: 4 cheese ", "Composition:  cheese, tomato ", "Cost: 120 гривень ", "Diameter: 25\n", "Name: 4 meat ", "Composition: meat, tomato ", "Cost: 150 гривень ", "Diameter: 30\n"};
        //int i;
        //for (i = 0; i < Pizza.length; i++) {
        //    System.out.println(Pizza[i]);

        //Film film = new Film("крип", "2 ЧАСА", "HORROR");


        Library library = new Library("Film");

        int i = checkList(library.getFilmList());
        while (i >= 0) {
            library.getFilmList()[i] = new Film("Avatar " + i, "61", Film.HORROR);
            i = checkList(library.getFilmList());
        }
        System.out.println("Вы достигли лимита");

//        for (int i = 0; i < checkList(library.getFilmList()); i++) {
//
//            if (library.getFilmList()[i] == null) {
//                library.getFilmList()[i] = new Film("Avatar " + i, "61");
//            }
//        }
//        if (checkList(library.getFilmList()) != 0) {
//            System.out.println("Вы достигли лимита");
//        }

    }

    public static int checkList(Film[] filmList) {
        int result = -1;

        for (int i = 0; i < filmList.length; i++) {
            if (filmList[i] == null) {
                result = i;
                break;
            }
        }
        return result;
    }
}
