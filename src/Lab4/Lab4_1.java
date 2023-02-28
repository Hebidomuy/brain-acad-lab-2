package Lab4;

public class Lab4_1 {
    public static void main(String[] args) {
        if(true && false || true && !false) System.out.println("true");
        else System.out.println("false");
        if(false || false || !true && false) System.out.println("true");
        else System.out.println("false");
        if(!false && (false || true && true)) System.out.println("true");
        else System.out.println("false");
        if(4 > 8 && !(7 == 0)) System.out.println("true");
        else System.out.println("false");
        if(!(true && false || false && true) && !(true && 4 <= 5)
        ) System.out.println("true");
        else System.out.println("false");
    }
}
