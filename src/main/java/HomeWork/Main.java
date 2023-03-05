package HomeWork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        shiftMass();
        findMiAndMaxInMass();
        defineYear();
    }

    // -------------------HomeWork 1----------------------------
    /* Task 1
    Задать одномерный массив и найти в нем минимальный и максимальный элементы
     */
    private static void findMiAndMaxInMass() {
        int max = 0;
        int min = 100;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            Random nums = new Random();
            array[i] = nums.nextInt(100);
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.printf("Max = %d, Min = %d,\n", max, min);
    }

    /* Task 2
    Написать метод, который определяет, является ли год високосным, и
    возвращает boolean (високосный - true, не високосный - false). Каждый
    4-й год является високосным, кроме каждого 100-го,
    при этом каждый 400-й – високосный.
     */
    private static void defineYear(){
        Scanner year = new Scanner(System.in);
        System.out.print("Введите год: ");
        int yearNew = year.nextInt();
        boolean result;
        if (yearNew % 400 == 0){
            result = true;
        } else {
            result = yearNew % 100 != 0 && yearNew % 4 == 0;
        }
        year.close();
        System.out.println(result);
    }



    /* Task 3
    Дан массив nums = [3,2,2,3] и число val = 3.
    Если в массиве есть числа, равные заданному,
    нужно перенести эти элементы в конец массива.
     */
    private static void shiftMass() {
        int[] nums = {3, 2, 1, 2, 3, 6, 4, 3, 2, 3};
        int val = 3;
        for (int i = 0; i < nums.length / 2; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == val && (nums[nums.length - 1 - j]) != val) {
                    int temp = nums[nums.length - 1 - j];
                    nums[nums.length - 1 - j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}


