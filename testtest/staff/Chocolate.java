package testtest.staff;

public class Chocolate extends Staff {
    String flavour;

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public Chocolate(String delicatess, int price, int weight, String flavour) {
        super(delicatess, price, weight);
        this.flavour = flavour;

    }
        @Override
        public String toString() {
            return super.toString() + "\nвкус: "+flavour;
        }


    }
