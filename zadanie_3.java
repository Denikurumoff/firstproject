/**
 * @author Deni Kurumov
 * @see main(String[] args)
 */

import java.util.Scanner;

class zadanie_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your destiny: enter 1 for calculator, enter 2 for max_legth_detector");

        int destiny = scanner.nextInt();

        if (destiny == 1) {
            System.out.println("введите первое число");
            float value = scanner.nextFloat();

            System.out.println("введите оператор");
            String operator = scanner.next();


            System.out.println("введите второе число");
            float value_2 = scanner.nextFloat();

            System.out.println("результат");
            if (operator.equals("+")) {
                System.out.printf("%.4f", value + value_2);
            } else if (operator.equals("-")) {
                System.out.printf("%.4f", value - value_2);
            } else if (operator.equals("*")) {
                System.out.printf("%.4f", value * value_2);
            } else if (operator.equals("/")) {
                System.out.printf("%.4f", value / value_2);
            } else {
                System.out.print("введите другой оператор");
            }


        } else if (destiny == 2) {
            System.out.println("введите необходимое количество слов в массиве для поиска самого длинного слова");
            String[] slova = new String[scanner.nextInt()];
            System.out.println("введите слова");
            slova[0] = scanner.next();
            slova[1] = scanner.next();
            slova[2] = scanner.next();
            slova[3] = scanner.next();
            slova[4] = scanner.next();


            if ((slova[0].length() > slova[1].length()) && (slova[0].length() > slova[2].length()) && (slova[0].length() > slova[3].length()) && (slova[0].length() > slova[4].length())) {
                System.out.print("самое длинное слово =" + slova[0]);
            } else if ((slova[1].length() > slova[0].length()) && (slova[1].length() > slova[2].length()) && (slova[1].length() > slova[3].length()) && (slova[1].length() > slova[4].length())) {
                System.out.print("самое длинное слово =" + slova[1]);
            } else if ((slova[2].length() > slova[0].length()) && (slova[2].length() > slova[1].length()) && (slova[2].length() > slova[3].length()) && (slova[2].length() > slova[4].length())) {
                System.out.print("самое длинное слово =" + slova[2]);
            } else if ((slova[3].length() > slova[0].length()) && (slova[3].length() > slova[1].length()) && (slova[3].length() > slova[2].length()) && (slova[3].length() > slova[4].length())) {
                System.out.print("самое длинное слово =" + slova[3]);
            } else if ((slova[4].length() > slova[0].length()) && (slova[4].length() > slova[1].length()) && (slova[4].length() > slova[2].length()) && (slova[4].length() > slova[3].length())) {
                System.out.print("самое длинное слово =" + slova[4]);
            } else {
                System.out.println("самых длинных слов несколько");
            }

        } else {
            System.out.println("вы выбрали невыполнимое действие");
        }

    }
}







