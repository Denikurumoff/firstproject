/*

Есть входной файл с набором слов, написанных через пробел

Необходимо:
Прочитать слова из файла.
Отсортировать в алфавитном порядке.
Посчитать сколько раз каждое слово встречается в файле.       Вывести статистику на консоль
Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле
*/


package Collections;


import java.io.*;
import java.sql.SQLOutput;
import java.util.*;


public class Collections {
    public static void main(String[] args) throws IOException {

        File file = new File("src\\main\\java\\Collections\\Collections.txt");
        int max;
        int min;


        System.out.println("\n_______________________CПИСОК СЛОВ, ИМЕЮЩИХСЯ В ФАЙЛЕ________________________\n");
        Scanner scanner = new Scanner(file);

        List<String> array = new ArrayList<String>();


        while (scanner.hasNext()) {
            array.add(scanner.next());

        }
        System.out.print(array);
        System.out.println("\n\n______________________СОРТИРОВКА В АЛФАВИТНОМ ПОРЯДКЕ________________________\n");

        java.util.Collections.sort(array);
        System.out.println(array);




        /*вывод списка в алфавитном порядке*/
        System.out.println("\n\n______________________ЧАСТОТА ПОВТОРЕНИЯ СЛОВ В МАССИВЕ________________________\n");
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i) + " Количество повторений: " + java.util.Collections.frequency(array, array.get(i)));

        }


        System.out.println("\n______________СЛОВА С НАИБОЛЬШИМ И НАИМЕНЬШИМ КОЛ-ВОМ ПОВТОРЕНИЙ_______________\n");
        for (int e = 0; e < (array.size() - 1); e++) {
            if (java.util.Collections.frequency(array, array.get(e + 1)) > java.util.Collections.frequency(array, array.get(e))) {
                max = java.util.Collections.frequency(array, array.get(e + 1));
                System.out.println("элемент с максимальным числом повторений = " + array.get(e + 1) + " число повторений: " + max);
                break;
            }
            for (int t = 0; t < (array.size() - 1); t++) {
                if (java.util.Collections.frequency(array, array.get(t + 1)) < java.util.Collections.frequency(array, array.get(t))) {
                    min = java.util.Collections.frequency(array, array.get(t + 1));
                    System.out.println("элемент с минимальным числом повторений = " + array.get(t + 1) + " число повторений: " + min);
                    break;
                }
            }

        }

        System.out.println("\n\n_______________________________________________________________________________\n");

    }
}




