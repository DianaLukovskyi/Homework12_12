package homework2;

public class Vehicle {

    String manufacturer;
    String model;
    int year;
    String color;


    public Vehicle(String manufacturer,String model, int year,String color) {


        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.color = color;


    }

    public Vehicle(String american, String man, int year, String black, int i, int i1, int i2, int i3) {
    }

    public void move() {

            System.out.println(" Not fuel, can't drive");

        System.out.println("Please load the truck before driving");

        }


    public void stop() {
        System.out.println("The Truck is stop");


    }

    }











