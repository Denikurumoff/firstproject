package testtest.staff;

public class Cake extends Staff {
    String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Cake(String delicatess, int price, int weight, String size) {
        super(delicatess, price, weight);
        this.size = size;


    }
    @Override
    public String toString() {
        return super.toString() + "\nвкус: "+size;
    }


}