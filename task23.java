// Напишите метод, который определит тип (расширение) файлов из 
// текущей папки и выведет в консоль результат вида:
// 1 Расширение файла: txt
// 2 Расширение файла: pdf
// 3 Расширение файла: 
// 4 Расширение файла: jpg

import java.io.File;

public class task23 {

    private static void getAllFiles(String path) {
        File[] allFiles = new File(path).listFiles();
        if (allFiles != null) {
            for (File file : allFiles) {
                String fileName = file.toString();
                int index = fileName.lastIndexOf('.');
                if(index > 0) {
                    String extension = fileName.substring(index + 1);
                    System.out.println("Расширение файла:" + extension);
                }
            }
        }
    }

    public static void main(String[] args) {
        String path = "E:\\Разработчик\\Java знакомство и как пользоваться базовым API\\Семинары\\Seminar";
        getAllFiles(path);


    }
}