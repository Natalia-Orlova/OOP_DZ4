package lesson4;
/*
Создайте интерфейс IsGood<T>. Внутри него содержится единственная функция:
boolean isGood (T item);
Смысл этого интерфейса: ему дают элемент, он его одобряет или не одобряет.
Создайте следующие детские классы:
• IsEven — ему дают целое число, он одобряет его, если оно чётное
• IsPositive — ему дают целое число, он одобряет его, если оно положительное
• BeginsWithA — ему дают строку, он одобряет её, если она начинается с буквы A
• BeginsWith — в конструкторе запоминает строку. Ему дают строку, он проверяет,
что она начинается с того, что он запомнил.

Создайте обобщённую функцию filter. Ей дают любую коллекцию любого типа, и одобрятель IsGood.
Функция возвращает новую коллекцию, куда входят только одобренные элементы из коллекции.
Продемонстрируйте, что это работает.

<T> Iterable<T> filter (Iterable<T> array, IsGood<T> isGood) для задачи
 */


import lesson4.Interface.IsGood;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numArr = new ArrayList<>();
        numArr.add(-15);
        numArr.add(50);
        numArr.add(456);
        numArr.add(-36);

        System.out.println("Исходная коллекция: ".toUpperCase() + numArr);
        System.out.println("Четные элементы: " + filter(numArr, new IsEven()));
        System.out.println("Положительные элементы: " + filter(numArr, new IsPositive()) + "\n");


        List<String> stringList = new ArrayList<>();
        stringList.add("Ко мне приплывала зеленая рыба");
        stringList.add("Ко мне прилетела белая чайка");
        stringList.add("А я была дерзкой, злой и веселой");
        stringList.add("И вовсе не знала, что это - счастье.\n");


        System.out.println("Исходная коллекция: ".toUpperCase());
        for (String string : stringList) {
            System.out.println(string);
        }
        System.out.println("Строки, начинающиеся на \"А\": " + filter(stringList, new BeginWithA()));
        System.out.println("Строки, начинающиеся c \"Ко мне\": " +
                filter(stringList, new BeginWith("Ко мне")));
    }

    public static <T> Collection<T> filter (Iterable<T> array, IsGood<T> isGood) {
        Collection<T> res = new ArrayList<>();
        for (T elem : array) {
            if (isGood.isGood(elem)) {
                res.add(elem);
            }
        }
        return res ;
    }
}
