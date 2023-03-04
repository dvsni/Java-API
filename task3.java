// В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
import java.util.Scanner;
import java.time.LocalTime;
public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "866");
        System.out.print("Введите Ваше имя: ");
        String Name = in.next();
        String s1;
        int Hour = LocalTime.now().getHour();
        if (Hour == 23 || Hour < 5)
            s1 = "Доброй ночи";
        else if (Hour < 12)
            s1 = "Доброе утро";
        else if (Hour < 18)
            s1 = "Добрый день";
        else
            s1 = "Добрый вечер";
        System.out.println(Name);
        System.out.println(s1 + ", " + Name + "!");
        in.close();
    }

}