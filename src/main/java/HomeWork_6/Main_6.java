package HomeWork_6;

import java.util.ArrayList;

public class Main_6 {
    /*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков (ArrayList).
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
 Выводить только те ноутбуки, что соответствуют условию
     */
    public static void main(String[] args) {
        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Lenovo", "IdeaPad 3", "Silver", 15.6, "AMD Ryzen 5 3500U", 8, 256, 599.99));
        laptops.add(new Laptop("Dell", "Inspiron 15 3000", "Black", 15.6, "Intel Core i3-1115G4", 4, 128, 529.99));
        laptops.add(new Laptop("HP", "Pavilion 15", "Gold", 14.0, "AMD Ryzen 7 5700U", 16, 512, 1099.99));
        laptops.add(new Laptop("Apple", "MacBook Air", "Space Gray", 13.3, "Apple M1", 8, 256, 999.99));
        filterByColor(laptops, "Black");
        filterByMinRAM(laptops, 8);
    }

    public static void filterByColor(ArrayList<Laptop> laptops, String value) { // фильтр по цвету
        laptops.removeIf(laptop -> (!(laptop.color.equals(value))));
        laptops.forEach(Laptop::printInfo);
    }

    public static void filterByMinRAM(ArrayList<Laptop> laptops, int value) { // фильтр по мин значению RAM
        laptops.removeIf(laptop -> (laptop.RAM < value));
        laptops.forEach(Laptop::printInfo);
    }
}
