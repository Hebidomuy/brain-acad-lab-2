package AdditionalTask;

public class MultiplicationTable {
//    private static String multiplication(int s) {
//        int a = 1;
//        String n = "";
//        while (a < 11) {
//            System.out.print(s * a + "\t");
//            a++;
//        }
//        return n;
//    }
//
//    public static void main(String[] args){
//        int a = 1;
//        while (a < 11) {
//            System.out.println(multiplication(a));
//            a++;
//        }
//    }


    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d\t", i * j);
            }
            System.out.println();
        }
    }
}
