// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
import java.util.Arrays;
public class task2 {
    public static void main(String[] args) {
        int val = 3;
        int[] nums = new int[]{3, 2, 2, 3};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - 1] = val;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}