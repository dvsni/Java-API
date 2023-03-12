// Создать список типа ArrayList<String>. 
// Поместить в него как строки, так и целые числа. 
// Пройти по списку, найти и удалить целые числа.

import java.util.ArrayList;
import java.util.Arrays;

public class task33 {

    public static void main(String[] args) {
    ArrayList arrLst = new ArrayList<>(Arrays.asList("hello", 52, "hello", 3.88, "hello", "hello2", 10, "hello5"));
        System.out.println(arrLst);
        int i = 0;
        while (i < arrLst.size())
        {
            if (arrLst.get(i) instanceof Integer == true)
            {
                arrLst.remove(i);
            }
            i++;
        }
        System.out.println(arrLst);
    }
}