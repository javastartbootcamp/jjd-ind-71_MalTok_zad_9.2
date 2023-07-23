package pl.javastart.task.model;

public class Vehicle {
    private String name;
    private double tankCapacity;
    private double avgFuelConsumptionPer100;

    public Vehicle(String name, double tankCapacity, double avgFuelConsumptionPer100) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.avgFuelConsumptionPer100 = avgFuelConsumptionPer100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getAvgFuelConsumptionPer100() {
        return avgFuelConsumptionPer100;
    }

    public void setAvgFuelConsumptionPer100(double avgFuelConsumptionPer100) {
        this.avgFuelConsumptionPer100 = avgFuelConsumptionPer100;
    }

    public double countRange() {
        return tankCapacity / avgFuelConsumptionPer100 * 100;
    }

    public String info() {
        return name + " ::: zbiornik paliwa " + tankCapacity
                + " litrów ::: średnie spalanie " + avgFuelConsumptionPer100 + "l/100 km ::: ";
    }
}
