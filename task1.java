// Задать одномерный массив и найти в нем минимальный и максимальный элементы.
import java.util.Arrays;
import java.lang.Math;
public class task1 {
    public static void main(String[] args) {
        int [] min_max_array= new int[5];
        for (int i=0;i<min_max_array.length;i++){
            min_max_array[i]=(int)(Math.pow(-2,i));
        }
        System.out.println(Arrays.toString(min_max_array));
        int min= Arrays.stream(min_max_array).min().getAsInt();
        int max = Arrays.stream(min_max_array).max().getAsInt();
        System.out.println(min);
        System.out.println(max);
    }
}