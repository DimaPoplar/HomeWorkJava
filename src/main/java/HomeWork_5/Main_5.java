package HomeWork_5;

import java.util.*;

public class Main_5 {
    public static void main(String[] args) {
        printTBook(telephoneBook());
    }

    /*
    1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
     */
    public static String scanner() {
        Scanner in = new Scanner(System.in);
        return in.next();
    }

    public static String addUser() {
        System.out.println("Введите имя");
        return scanner();
    }

    public static List<String> addNumbers() {
        List<String> numberList = new ArrayList<>();
        boolean flag = true;
        while (flag) {
            System.out.println("Введите номер телефона");
            String telephone = scanner();
            numberList.add(telephone);
            System.out.println("Добавить ещё 1 номер? y/n");
            flag = scanner().equalsIgnoreCase("y");
        }
        return numberList;
    }

    public static HashMap<String, List<String>> telephoneBook() {
        HashMap<String, List<String>> tBook = new HashMap<>();
        do {
            tBook.put(addUser(), addNumbers());
            System.out.println("Добавить ещё один контакт? y/n");
        } while (!scanner().equalsIgnoreCase("n"));
        return tBook;
    }

    public static void printTBook(HashMap<String, List<String>> telbook) {
        for (var item : telbook.entrySet()) {
            System.out.printf("%s: %s\n", item.getKey(), item.getValue());
        }
    }
}