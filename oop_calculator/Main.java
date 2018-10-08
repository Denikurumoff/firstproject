package oop_calculator;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws ArithmeticException {
        Peremennaya number_1 = new Peremennaya();
        Peremennaya_2 number_2 = new Peremennaya_2();
        Operator operator = new Operator();


        while (true) {
            try {
                number_1.vvedi();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не число! Попробуйте снова!");
                continue;
            }
        }


                operator.vvedi();











        while (true) {
            try {
                number_2.vvedi();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не число! Попробуйте снова!");
                continue;
            }
        }


        if (operator.getOperand_1().equals("+")) {
            System.out.printf("%.4f", number_1.getPeremennaya1() + number_2.getPeremennaya_2());

        } else if (operator.getOperand_1().equals("-")) {
            System.out.printf("%.4f", number_1.getPeremennaya1() - number_2.getPeremennaya_2());

        } else if (operator.getOperand_1().equals("*")) {
            System.out.printf("%.4f", number_1.getPeremennaya1() * number_2.getPeremennaya_2());

        } else if
        (operator.getOperand_1().equals("/")) {
            if (operator.getOperand_1().equals("/")) {
                System.out.print("делить на ноль нельзя");

            } else
                System.out.printf("%.4f", number_1.getPeremennaya1() / number_2.getPeremennaya_2());

        } else {

            System.out.print("введите другой оператор");
        }


    }
}


