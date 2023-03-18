// Пусть дан список сотрудников:
// Иван Иванов; Светлана Петрова; Кристина Белова; Анна Мусина; Анна Крутова; Иван Юрин; Петр Лыков
// Павел Чернов; Петр Чернышов; Мария Федорова; Марина Светлова; Мария Савина; Мария Рыкова; Марина Лугова
// Анна Владимирова; Иван Мечников; Петр Петин; Иван Ежов
// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности.

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class task52 {
    public static <Treemap> void main(String[] args) {
        String s = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, " +
                "Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, " +
                "Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        s = s.replace(",", "");
        String[] arr = s.split(" ");
        ArrayList names = new ArrayList();

        for (int i = 0; i < arr.length; i+=2) {
            names.add(arr[i]);
        }
        TreeMap<Object, Integer> map = new TreeMap<>();
        for (int i = 0; i < names.size(); i++) {
            if (map.containsKey(names.get(i))) {
                int count = map.get(names.get(i)) + 1;
                map.put(names.get(i), count);
            } else {
                map.put(names.get(i), 1);
            }
        }
        System.out.println(names);
        map.entrySet().stream().sorted(Map.Entry.<Object, Integer>comparingByValue().reversed()).forEach(System.out::println);
    }
}