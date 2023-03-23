package HomeWork_3;

import java.util.*;

public class Main_3 {
    public static void main(String[] args) {
        deleteChetNum(createList(10));
        findMaxMinAverage(createList(10));
        deleteNumber();
    }

    private static List<Integer> createList(Integer amount) {
        List<Integer> numbers = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < amount; i++) {
            numbers.add(rd.nextInt(0, 10));
        }
        return numbers;
    }

    /*
     Пусть дан произвольный список целых чисел, удалить из
     него четные числа (в языке уже есть что-то готовое для этого)
     */
    private static void deleteChetNum(List<Integer> array) {
        System.out.println(array);
        array.removeIf(num -> num % 2 == 0);
        System.out.println(array);
    }

    /*
    Задан целочисленный список ArrayList. Найти минимальное, максимальное
    и среднее арифметическое из этого списка.
     */
    private static void findMaxMinAverage(List<Integer> array) {
        System.out.println(array);
        Comparator<? super Integer> c = null;
        array.sort(c);
        int temp = 0;
        for (Integer integer : array) {
            temp += integer;
        }
        System.out.println("max - " + array.get(array.size() - 1));
        System.out.println("min - " + array.get(1));
        System.out.println("Average - " + temp / 2);
    }

    /*
    Создать список типа ArrayList<String>. Поместить в него как
    строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
     */

    private static void deleteNumber() {
        List<String> array = new ArrayList<>();
        Collections.addAll(array, "ads", "123", "12", "1", "qwe", "gff", "124");
        array.removeIf(num -> Character.isDigit(num.charAt(0)));
        System.out.println(array);
    }
}
