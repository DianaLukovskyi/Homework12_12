package homework2;

public class PassengerCar extends Vehicle {
    int numOfDoors;
    String bodyType;

    public PassengerCar(int numOfDoors, String bodyType) {

        super(manufacturer, model, year, color);
        this.numOfDoors = numOfDoors;
        this.bodyType = bodyType;


    }

    public void move() {

    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "numOfDoors=" + numOfDoors +
                ", bodyType='" + bodyType + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}







