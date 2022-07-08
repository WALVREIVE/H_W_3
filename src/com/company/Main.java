package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        ОСНОВНОЕ ДЗ
        */
        System.out.println("У нас 15 массивов типа double. Введите отрицательные и положительные числа для массива: ");
        Scanner inMass = new Scanner(System.in);
        double[] arrayMassDouble = new double[15];
        for (double i = 0.0; i < 15.0; i++) { // шаг изменения
            System.out.println("Массив с индексом [" + i + "] = ваше число");
            arrayMassDouble[(int) i] = inMass.nextDouble();
        }
        double sumPositive = 0;
        double sumNegative = 0;
        double sum = 0;
        double averagePositive, average, averageNegative;
        int countPositive = 0;
        int countAll;
        int countNegative = 0;
        System.out.println(Arrays.toString(arrayMassDouble) + " - все значение внутри массива.");
        System.out.println("Массив = { ");
        boolean minus2 = false;
        for (double k : arrayMassDouble) { //foreach
            System.out.println(k + ", ");
            if (k < 0 && !minus2) {
                minus2 = true;
            } else if (minus2) {
                if (k > 0) {
                    countPositive++;
                    sumPositive = sumPositive + k;
                } else {
                    countNegative++;
                    if (countNegative == 15) countNegative--;
                    sumNegative = sumNegative + k;
                }
                sum = sumNegative + sumPositive;
            } else System.out.println("Ждем отрицательное число");

        }
        countAll = countNegative + countPositive;
        averagePositive = sumPositive / countPositive;
        averageNegative = sumNegative / countNegative;
        average = sum / countAll;
        System.out.println("}");
        System.out.println("Кол-во положительных чисел после первого отрицательного числа: " + countPositive);
        System.out.println("Кол-во отрицательных чисел после первого отрицательного числа: " + countNegative);
        System.out.println("Кол-во всех чисел после первого отрицательного числа: " + countAll);
        System.out.println("Общая сумма после первого отрицательного числа =  " + sum);
        System.out.println("Сложение всех ПОЛОЖИТЕЛЬНЫХ чисел после первого отрицательного числа равняется = " + sumPositive);
        System.out.println("Сложение всех отрицательных чисел после первого отрицательного числа равняется = " + sumNegative);
        System.out.println("Среднее ПОЛОЖИТЕЛЬНОЕ арифметическое значение ПОЛОЖИТЕЛЬНЫХ чисел после первого отрицательного числа равняется = " + averagePositive);
        System.out.println("Среднее ОТРИЦАТЕЛЬНОЕ арифметическое значение отрицательных чисел после первого отрицательного числа равняется = " + averageNegative);
        System.out.println("Среднее арифметическое значение всех чисел после первого отрицательного числа равняется = " + average);
        System.out.println("______________________________________");

        /*ДЗ на сообразительность*/
        System.out.println("Сортировка массива");
        int min;
        for (int i = 0; i < arrayMassDouble.length; i++) {
            min = i;
            for (int j = i + 1; j < arrayMassDouble.length; j++) {
                if (arrayMassDouble[j] < arrayMassDouble[min]) {
                    min = j;}
            }
        }
    }
}