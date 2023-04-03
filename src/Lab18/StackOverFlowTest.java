package Lab18;

public class StackOverFlowTest {
    static int count;

    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void test() {
        count++;
        System.out.println(count);
        test();
    }
}