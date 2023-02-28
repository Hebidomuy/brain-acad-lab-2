package Lab5;

public class Lab5_3 {
    public static void main(String[] args) {
        int [] [] array = {{9,3,7,9,9,9,2}, {1,0,11,5,10,7}};
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.println(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
