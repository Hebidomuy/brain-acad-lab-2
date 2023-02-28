package Lab4;

public class lab4_5 {
    public static void main(String[] args) {
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.println(n0 + " " + n1 + " ");
        for (int i = 3; i <= 30; i++) {
            n2 = n0 + n1;
            if (i % 3 == 0)
                System.out.println(n2 + "  ");
            n0 = n1;
            n1 = n2;
        }
    }
}
