package staff;

public class iceCream extends Staff {
    String temperature;

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public iceCream(String delicatess, int price, int weight, String temperature) {
        super(delicatess, price, weight);
        this.temperature = temperature;



    }
    @Override
    public String toString() {
        return super.toString() + "\nвкус: "+temperature;
    }


}