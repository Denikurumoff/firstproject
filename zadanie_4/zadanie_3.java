package zadanie_4;
/** @author Deni Kurumov
 * @see main(String[] args)
*/

import java.util.Scanner;

/**class zadanie_3 {
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

            System.out.println("введите количество слов в массиве");
            int b = scanner.nextInt();

            System.out.println("введите слова");
            String[] slova1 = new String[b];

            for (int c = 0; c < slova1.length; c++) {
                slova1[c] = scanner.next();
            }
            String max = slova1[0];
            for (int c = 0; c < slova1.length; c++) {
                if (slova1[c].length() > max.length()) {
                    max = slova1[c];
                }

            }
            System.out.println("самым длинным словом в массиве является: " + max);


        } else {
            System.out.println("вы выбрали невыполнимое действие");
        }

    }
}

*/



