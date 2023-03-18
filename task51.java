// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.Scanner;

public class task51 {
    public static void main(String[] args) {

        HashMap<Object, Object> phoneMap = new HashMap<>();
        phoneMap.put("+7(911)264-34-77;", "Egorov");
        phoneMap.put("+7(495)005-48-12;", "Vasilev");
        phoneMap.put("+7(812)384-10-05.", "Ivanov");
        phoneMap.put("+7(499)485-50-28;", "Kulakov");
        phoneMap.put("+7(921)512-07-54.", "Bistrov");
        phoneMap.put("+7(911)158-50-02;", "Kulakov");
        phoneMap.put("+7(921)478-52-08;", "Vasilev");
        phoneMap.put("+7(499)781-54-63;", "Egorov");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию для поиска в телефонной книге: ");
        Object name;
        name = scanner.next();

        for(HashMap.Entry<Object, Object> phoneMapEntry : phoneMap.entrySet()) {
            if (phoneMapEntry.getValue().equals(name)) {
                System.out.println(phoneMapEntry.getKey());
            }
        }
    }
}
