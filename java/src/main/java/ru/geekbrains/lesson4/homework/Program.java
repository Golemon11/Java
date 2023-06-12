package ru.geekbrains.lesson4.homework;

public class Program {

    /**
     * Домашняя работа, задача:
     * ========================
     * <p>
     * a. Даны классы Fruit, Orange extends Fruit, Orange extends Fruit;
     * b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     * поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     * c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     * d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     * вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     * e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     * подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     * Можно сравнивать коробки с яблоками и апельсинами;
     * f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     * Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     * Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     * g. Не забываем про метод добавления фрукта в коробку.
     */
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Box<Fruit> boxOfApple = new Box<>();
        boxOfApple.addFruitToBox(apple1);
        boxOfApple.addFruitToBox(apple2);
        boxOfApple.addFruitToBox(apple3);
        boxOfApple.getWeihtOfBox();
        System.out.println(boxOfApple);

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box<Fruit> boxOfOrange = new Box<>();
        boxOfOrange.addFruitToBox(orange1);
        boxOfOrange.addFruitToBox(orange2);
        boxOfOrange.addFruitToBox(orange3);
        boxOfOrange.addFruitToBox(apple1);
        boxOfOrange.getWeihtOfBox();
        System.out.println(boxOfOrange);

        Box<Fruit> emptyBox = new Box<>();
        System.out.println("box1 == box2: " + boxOfApple.compare(boxOfOrange));
        System.out.println("box1 == box1: " + boxOfApple.compare(boxOfApple));
        System.out.println("box3 == box3: " + emptyBox.compare(emptyBox));
        System.out.println(emptyBox);
        boxOfApple.transferFruitThisBoxToBox(emptyBox, 3);
        boxOfApple.addFruitToBox(orange1);
        boxOfApple.addFruitToBox(apple1);

        System.out.println(boxOfApple + "\n" + emptyBox);
        emptyBox.transferFruitThisBoxToBox(boxOfOrange, 2);
        System.out.println(boxOfOrange + "\n" + emptyBox);
    }

}
