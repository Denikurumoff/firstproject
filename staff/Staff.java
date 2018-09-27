// Формируется новогодний подарок. Он может включать в себя
//разные сладости (Candy, Jellybean, etc.) У каждой сладости есть
//название, вес, цена и свой уникальный параметр. Необходимо
//собрать подарок из сладостей. Найти общий вес подарка, общую
//стоимость подарка и вывести на консоль информацию о всех
//сладостях в подарке.

package staff;

public abstract class Staff {
    private String delicatess;
    private int price;
    private int weight;


    //конструктор
    public Staff(String delicatess, int price, int weight) {
        this.delicatess = delicatess;
        this.price = price;
        this.weight = weight;
    }

    public String toString() {
        return "delicatess: " + delicatess + "\nценник: " + price + "\nвес: " + weight;
    }


// сеттеры и геттеры

    public String getDelicatess() {
        return delicatess;
    }

    public void setDelicatess(String delicatess) {
        this.delicatess = delicatess;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}





