package oop_calculator;

import java.util.Scanner;


public class Operator implements interface_vvoda {
    private String operand_1;
    Scanner scanner = new Scanner(System.in);

    public String getOperand_1() {
        return operand_1;
    }

    public void setOperand_1(String operand_1) {
        this.operand_1 = operand_1;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void vvedi() {
        System.out.println("Какую операцию вы хотите совершить? ");

        while (true) {
            operand_1 = scanner.next();
            if (!(operand_1.equals("+")) && !(operand_1.equals("-")) && !(operand_1.equals("*")) && !(operand_1.equals("/"))) {
                System.out.println("Выбранная вами функция не реализована в рамках данного калькулятора! Введите что-то еще");
                scanner = new Scanner(System.in);

            }
            else break;

        }


    }
}


