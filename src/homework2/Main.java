package homework2;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("America", "Man", 2018, "Black") {
            Truck truck = new Truck("Maks", 10000, 3500, 500, 600);
            PassengerCar passengerCar = new PassengerCar(4, "Crossover");


        }

        Truck[] trucks = {vehicle,truck,pasengerCar};
        for (Vehicle truck : trucks){
            System.out.println(truck);
        }
        for (Vehicle truck : trucks){
            System.out.println("Please load the truck before driving");
        }

        }







    }




