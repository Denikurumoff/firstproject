package zadanie_4;/*
Массив размерностью 20, заполняется случайными целыми
числами от -10 до 10. Найти максимальный отрицательный и
минимальный положительный элементы массива. Поменять их
местами.
 */

import java.util.Random;
import java.util.Arrays;

public class zadanie_4 {
    public static void main(String[] args) {

        Random rand = new Random();
// ввели массив с генерацией случайных чисел
        int massiv[] = new int[20];
        for (int i = 0; i < 20; i++) {
            massiv[i] = rand.nextInt(21) - 10;
        }
        System.out.println(Arrays.toString(massiv));


        // Вычисление максимального и минимального значения, а также индексов для последующей замены по индексам.
        int maximum = massiv[0];
        int indexMax = 0;
        int minimum = massiv[0];
        int indexMin = 0;
        for (int i = 1; i < massiv.length; i++) {
            if (massiv[i] > maximum) {
                maximum = massiv[i];
                indexMax = i;
            } else if (massiv[i] < minimum) {
                minimum = massiv[i];
                indexMin = i;
            }
        }
        System.out.println("Максимальный элемент: " + maximum);
        System.out.println("индекс максимального элемента: " + indexMax);
        System.out.println("Минимальный элемент: " + minimum);
        System.out.println("индекс минимального элемента: " + indexMin);

        massiv[indexMin] = maximum;
        massiv[indexMax] = minimum;

        System.out.println("Второй массив с перестановкой: ");
        System.out.println((Arrays.toString(massiv)));


    }
}
