package oop_calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Peremennaya implements interface_vvoda {
    private float peremennaya1;
    //Scanner scanner = new Scanner(System.in);

    public Peremennaya(float peremennaya1) {
        this.peremennaya1 = peremennaya1;
    }

    public Peremennaya() {

    }

    public float getPeremennaya1() {
        return peremennaya1;
    }

    public void setPeremennaya1(int peremennaya1) {
        this.peremennaya1 = peremennaya1;
    }

    public void vvedi() {
        System.out.println("введи первое число");

        Scanner scanner = new Scanner(System.in);
        peremennaya1 = scanner.nextFloat();


    }
}

