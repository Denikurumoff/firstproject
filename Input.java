/**
 * @author Deni Kurumov
 * @see main(String[] args)
 */

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите первое число");
        float value = scanner.nextFloat();

        System.out.println("введите второе число");
        float value_2 = scanner.nextFloat();

        System.out.printf("%.4f", value+value_2);
    }
}

