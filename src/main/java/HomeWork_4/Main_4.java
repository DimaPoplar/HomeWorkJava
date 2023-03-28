package HomeWork_4;

import java.util.*;

public class Main_4 {
    public static void main(String[] args) {
//        workString();
        reverseList();
    }


    /*
    1. Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
Если введено revert, удаляет предыдущую введенную строку из памяти.
     */
    private static void workString() {
        boolean flag = true;
        LinkedList<String> text = new LinkedList<>();
        while (flag) {
            Scanner sk = new Scanner(System.in);
            System.out.print("Введите текст: ");
            String newtext = sk.nextLine();
            switch (newtext) {
                case "exit" -> flag = false;
                case "print" -> {
                    for (int i = 0; i <= text.size() - 1; i++) {
                        System.out.print(text.get(text.size() - 1 - i) + " ");
                    }
                    System.out.println(" ");
                }
                case "revert" -> text.remove(text.get(text.size() - 2));
                default -> {
                    int i = 0;
                    text.addLast(newtext);
                    System.out.println(text);
                }
            }
        }
    }
    /*
    2. Пусть дан LinkedList с несколькими элементами.
    Реализуйте метод, который вернет “перевернутый” список.
     */

    public static void reverseList() {
        String[] sad = new String[]{"a", "b", "c", "1", "12", "2", "de"};
        List<String> list = new LinkedList<>(List.of(sad));
        List<String> newlist = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            newlist.add(list.get(i));
        }
        System.out.println(newlist);
    }
}
