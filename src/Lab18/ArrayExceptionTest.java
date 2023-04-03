package Lab18;

public class ArrayExceptionTest {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        System.out.println("Правильный вывод");
        printArray(array,0,5);
        System.out.println("Неправльный вывод");
        printArray(array,9,12);
    }

    public static void printArray(int[] array, int start, int end) {
        for (int i = start; i < end; i++) {
            try {
                System.out.println(array[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Ошибка. Попытка обращения к несуществующему индексу: текущий индекс = " + i + "; размер массива = " + array.length + ";");
                break;
            }
        }
    }
}