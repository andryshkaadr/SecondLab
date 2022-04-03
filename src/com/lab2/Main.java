package com.lab2;

import java.util.Scanner;
import java.util.Random;

public class Main {
    /*
    Задана последовательность из N вещественных чисел.
    Определить, сколько среди них чисел, меньших К, равных К и больших К.
     */
    static void task45() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        int less = 0, equal = 0, more;
        byte number = scan.nextByte();
        int[] arr = new int[number];
        for (byte a = 0; a < number; a++) {
            Random rand = new Random();
            arr[a] = Math.round(rand.nextInt(100));
            System.out.print(arr[a] + " ");
        }
        System.out.print("\nВведите число K: ");
        byte k = scan.nextByte();
        for (byte a = 0; a < number; a++) {
            if (arr[a] < k) {
                less++;
            }
            if (arr[a] == k) {
                equal++;
            }
        }
        more = number - less - equal;
        System.out.println("Элементов массива которые меньше " + k + " - " + less);
        System.out.println("Элементов массива которые равны " + k + " - " + equal);
        System.out.println("Элементов массива которые больше " + k + " - " + more);
    }

    static void task70() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        byte number = scan.nextByte();
        int[] arr = new int[number];
        int amount1 = 1, amount2 = 1;
        for (byte a = 0; a < number; a++) {
            Random rand = new Random();
            arr[a] = Math.round(rand.nextInt(100));
            System.out.print(arr[a] + " ");
            if (arr[a] == 0) {
                continue;
            }
            if (arr[a] % 3 == 0) {
                amount1 *= arr[a];
            }
            if (arr[a] % 9 == 0) {
                amount2 *= arr[a];
            }
        }
        if (amount1 == 1)
            System.out.println("\nЭлементов кратных трем не найдено.");
        else if (amount1 != 1)
            System.out.println("\nПроизведение элементов кратным трем - " + amount1);
        if (amount2 == 1)
            System.out.print("Элементов кратных девяти не найдено.");
        else if (amount2 != 1)
            System.out.print("Произведение элементов кратным девяти - " + amount1);
    }

    /*
    Удалить элемент массива целых чисел, удовлетворяющий условию: остаток от деления на 3 равен 2.
    Если таких элементов нет, выдать сообщение: «Элементы для удаления не найдены».
    */
    static void task95() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        byte number = scan.nextByte();
        int[] arr = new int[number];
        for (byte a = 0; a < number; a++) {
            Random rand = new Random();
            arr[a] = Math.round(rand.nextInt(6));
            System.out.print(arr[a] + " ");
        }
        for (byte a = 0; a < number; a++) {
            if (arr[a] % 3 == 2) {
                for (byte x = a; x < number; x++) {
                    arr[x] = arr[x + 1];
                    arr[number - 1] = 0;
                }
                break;
            }
        }
        System.out.println("\nУдаление элементов");
        for (byte a = 0; a < number; a++) {
            System.out.print(arr[a] + " ");
        }
    }

    /*
    Заданы два массива.
    Создать один массив, в котором все элементы расположены в порядке возрастания.
     */
    static void task120() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество элементов в массивах: ");
        byte number1 = scan.nextByte();
        byte number2 = number1;
        byte x = 0;
        int[] arr1 = new int[number1];
        int[] arr2 = new int[number2];
        int[] arr3 = new int[number1 + number2];
        for (byte a = 0; a < number1; a++) {
            Random rand = new Random();
            arr1[a] = Math.round(rand.nextInt(100));
            System.out.print(arr1[a] + " ");
        }
        System.out.println("\n");
        for (byte a = 0; a < number2; a++) {
            Random rand = new Random();
            arr2[a] = Math.round(rand.nextInt(100));
            System.out.print(arr2[a] + " ");
        }
        System.out.println("\n");
        for (byte a = 0; a < number1 + number2; a++) {
            arr3[a] = arr1[x];
            arr3[a + 1] = arr2[x];
            a++;
            x++;
        }
        boolean IsSorted = false;
        while (!IsSorted) {
            IsSorted = true;
            for (byte a = 1; a < number1 + number2; a++) {
                if (arr3[a] < arr3[a - 1]) {
                    int temp = arr3[a];
                    arr3[a] = arr3[a - 1];
                    arr3[a - 1] = temp;
                    IsSorted = false;
                }
            }
        }
        for (int a = 0; a < number1 + number2; a++) {
            System.out.print(arr3[a] + " ");
        }
    }

    /*
    Японская радиокомпания провела опрос N радиослушателей по вопросу: «Какое животное вы связываете с Японией и японцами?».
    Составить программу получения k наиболее часто встречающихся ответов и их долей (в процентах).
     */
    static void task145() {
        System.out.println("Какое животное вы связываете с Японией?\n1) Панды\n2) Енотовидная собака\n3) Карпы");
        int count = 65;
        float count1 = count;
        int[] arr = new int[count];
        float answer1 = 0, answer2 = 0, answer3 = 0;
        for (byte a = 0; a < count; a++) {
            Random rand = new Random();
            arr[a] = 1 + Math.round(rand.nextInt(3));
            switch (arr[a]) {
                case 1:
                    answer1++;
                    break;
                case 2:
                    answer2++;
                    break;
                case 3:
                    answer3++;
                    break;
            }
        }
        float percent1, percent2, percent3;
        percent1 = answer1 * 100 / count1;
        percent2 = answer2 * 100 / count1;
        percent3 = answer3 * 100 / count1;
        System.out.println("Людей у которых Япония асоциируется с пандами - " + answer1 + "; \nC енотовидными собаками - " + answer2 + ";\nC карпами - " + answer3 + ";");

        System.out.println("Панды - " + percent1 + "%\nЕнотовидные собаки-" + percent2 + "%\nКарпы-" + percent3 + "%");
    }

    public static void main(String[] args) {
        //task45();
        //task70();
        //task95();
        //task120();
        task145();
    }
}
