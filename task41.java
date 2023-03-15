// Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.
import java.util.LinkedList;
import java.util.Scanner;

public class task41 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Введите строку(string) или print или revert или exit: ");
            String input = sc.next();

            if (input.equals("exit")) {
                System.out.println(linkedList);
            } else if (input.equals("revert")) {
                if (linkedList.size() > 0) {
                    linkedList.removeFirst();
                    System.out.println(linkedList);
                } else {
                    System.out.println("Список пуст");
                }
            } else if (input.equals("print")) {
                System.out.println(linkedList);
                break;
            }
            linkedList.addFirst(input);

        }
        sc.close();
    }
}