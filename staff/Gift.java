package staff;

import staff.Chocolate;
import staff.Cake;
import staff.iceCream;


import java.util.Arrays;

public class Gift extends Staff {


    public Gift(String delicatess, int price, int weight) {
        super(delicatess, price, weight);
    }


    public static void main(String[] args) {
        Chocolate wispa = new Chocolate("шоколадка", 123, 122, "молочный шоколад");
        Cake charodeika = new Cake("тортик", 250, 1000, "большой");
        iceCream maxibon = new iceCream("мороженка", 120, 100, "холодное");
        Staff[] box = {wispa, charodeika, maxibon};
        System.out.println(Arrays.toString(box));
        System.out.println("общий вес подарка " + (+wispa.getWeight() + charodeika.getWeight() + maxibon.getWeight()) + "\nОбщая стоимость подарка " + (wispa.getPrice() + charodeika.getPrice() + maxibon.getPrice()));

    }
}



