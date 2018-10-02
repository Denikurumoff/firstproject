package oop_calculator;

import java.util.Scanner;

public class Peremennaya_2 implements interface_vvoda {
    private float peremennaya_2;
    Scanner scanner = new Scanner(System.in);

    public float getPeremennaya_2() {
        return peremennaya_2;
    }

    public void setPeremennaya_2(float peremennaya_2) {
        this.peremennaya_2 = peremennaya_2;
    }

    public void vvedi() {
        System.out.println("введи второе число");
        peremennaya_2 = scanner.nextFloat();
    }
}
