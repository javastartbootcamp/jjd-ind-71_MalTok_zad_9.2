package pl.javastart.task;

import pl.javastart.task.logic.CarRental;
import pl.javastart.task.model.Car;
import pl.javastart.task.model.Truck;
import pl.javastart.task.model.Vehicle;

public class Main {

    public static void main(String[] args) {
        CarRental carRental = new CarRental();
        Vehicle honda = new Vehicle("Honda CBR125", 10, 7.5);
        Car lanos = new Car("Daewoo Lanos", 45, 8.5, false);
        Car vwGolf = new Car("VW Golf", 55, 7.0, false);
        Truck man = new Truck("MAN", 1500, 35, false, 10_000);
        Truck zuk = new Truck("FSO Żuk", 55, 12, false, 750);

        carRental.addVehicle(honda);
        carRental.addVehicle(lanos);
        carRental.addVehicle(vwGolf);
        carRental.addVehicle(man);
        carRental.addVehicle(zuk);

        carRental.showInfo();

        lanos.turnAirConditioningOn();
        vwGolf.turnAirConditioningOn();
        man.turnAirConditioningOn();
        zuk.turnAirConditioningOn();

        carRental.showInfo();
    }
}
