package HomeWork_2;

import java.io.FileWriter;
import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        System.out.println(isPoly(scannerText()));
        writeTest();
    }
    private static String scannerText(){
        Scanner sk = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word = sk.nextLine();
        sk.close();
        return word;
    }

    /*
    Напишите метод, который принимает на вход строку (String) и определяет является ли строка
    полиндромом (возвращает boolean значение)
     */
    private static boolean isPoly(String text) {
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    /*
    Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет
    эту строку в простой текстовый фаил, обработайте исключения.
     */
    public static void writeTest(){
        StringBuilder sb = new StringBuilder();
        sb.append("TEST".repeat(100));
        try {
            FileWriter f1 = new FileWriter("C:\\Users\\ПК\\Desktop\\HomeWorkJava\\HomeWorkJava\\src\\main\\resources\\test.txt");
            f1.write(String.valueOf(sb));
            f1.flush();
        }catch (Exception e){
            System.out.println("FAIL");
        }
    }
}
