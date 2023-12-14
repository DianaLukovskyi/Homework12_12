package homework2;

public class Truck extends Vehicle {


    String owner;
    int maxWeight;
    int currentWeight = 0;
    int maxFuel;
    int currentFuel = 0;


    public Truck(String owner, int maxWeight, int currentWeight, int maxFuel, int currentFuel) {
        super(manufacturer, model, year, color);


        this.owner = owner;
        this.maxWeight = maxWeight;
        this.currentFuel = currentWeight;
        this.maxFuel = maxFuel;
        this.currentFuel = currentFuel;


    }











    @Override
    public String toString() {
        return "Truck{" +
                "owner='" + owner + '\'' +
                ", maxWeight=" + maxWeight +
                ", currentWeight=" + currentWeight +
                ", maxFuel=" + maxFuel +
                ", currentFuel=" + currentFuel +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}








