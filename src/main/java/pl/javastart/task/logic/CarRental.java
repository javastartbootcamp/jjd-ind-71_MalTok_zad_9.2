package pl.javastart.task.logic;

import pl.javastart.task.model.Vehicle;

public class CarRental {
    private Vehicle[] vehicles = new Vehicle[5];
    private int counter = 0;

    public void addVehicle(Vehicle vehicle) {
        if (counter <= vehicles.length) {
            vehicles[counter] = vehicle;
            counter++;
        } else {
            System.out.println("Brak miejsca na kolejne samochody");
        }
    }

    public void showInfo() {
        for (int i = 0; i < counter; i++) {
            System.out.printf("%s ::: zasięg wynosi %.1f km\n", vehicles[i].info(), vehicles[i].countRange());
        }
        System.out.println();
    }
}
