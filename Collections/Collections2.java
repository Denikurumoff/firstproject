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
import java.util.*;
import java.util.Collections;


public class Collections2 {
    public static void main(String[] args) throws IOException {

        File file = new File("src\\main\\java\\Collections\\Collections.txt");
        int max;
        int min;
        String emax ="";
        String tmin = "";


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
            System.out.println(array.get(i) + " Количество повторений: " + Collections.frequency(array, array.get(i)));

        }


        System.out.println("\n______________СЛОВА С НАИБОЛЬШИМ И НАИМЕНЬШИМ КОЛ-ВОМ ПОВТОРЕНИЙ_______________\n");
        max = 0;
        for (int e = 0; e < array.size(); e++) {
            if (Collections.frequency(array, array.get(e)) > max) {
                max = Collections.frequency(array, array.get(e));
                emax = array.get(e);



            }


        }
        System.out.println("элемент с максимальным числом повторений = " + emax + " число повторений: " + max);

        min = 1;
        for (int t = 0; t < array.size(); t++) {
            if (Collections.frequency(array, array.get(t)) <= min) {
                min = Collections.frequency(array, array.get(t));
                tmin = array.get(t);


            }


        }

        System.out.println("элемент с минимальным числом повторений = " + tmin + " число повторений: " + min);
        System.out.println("\n\n_______________________________________________________________________________\n");
    }


}





