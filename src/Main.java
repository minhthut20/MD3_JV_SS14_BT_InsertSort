import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
        System.out.println("Array Before : " + Arrays.toString(array));
        insertSort(array);
        System.out.println("Array After : " + Arrays.toString(array));
    }

    public static void  insertSort (int [] array) {
        for (int  i =  1 ; i < array.length; i++) {
            int  temp = array[i];
            int  j = i - 1 ;
            for  (;j >= 0 && array[j] > temp; j--) {
                // Moves the value greater than temp back by one unit
                array [j + 1] = array [j];
            }
            array [j + 1] = temp;
        }
    }
}
