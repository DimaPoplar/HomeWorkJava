package HomeWork_6;

public class Laptop {
    String brand;  // марка ноутбука
    String model;  // модель ноутбука
    String color;  // цвет ноутбука
    double screenSize;  // размер экрана в дюймах
    String processor;  // тип процессора
    int RAM;  // объем оперативной памяти в Гб
    int storage;  // объем накопителя в Гб
    double price;  // цена ноутбука


    public Laptop( // конструктор класса
                   String brand, String model, String color,
                   double screenSize, String processor, int RAM,
                   int storage, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.screenSize = screenSize;
        this.processor = processor;
        this.RAM = RAM;
        this.storage = storage;
        this.price = price;
    }


    public void printInfo() { // полный вывод инф. о продукте
        System.out.printf("%s %s, %s, %.1f\" screen, %s, %d GB RAM, %d GB storage, %.2f",
                brand, model, color, screenSize, processor, RAM, storage, price);
    }
}