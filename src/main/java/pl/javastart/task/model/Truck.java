package pl.javastart.task.model;

public class Truck extends Car {
    private static final double TRUCK_AIR_CONDITIONING_FUEL_CONSUMPTION = 1.6;
    private static final double LOAD_FUEL_CONSUMPTION = 0.5;
    private double loadWeight;

    public Truck(String name, double tankCapacity, double avgFuelConsumptionPer100,
                 boolean airConditioningOn, double loadWeight) {
        super(name, tankCapacity, avgFuelConsumptionPer100, airConditioningOn);
        this.loadWeight = loadWeight;
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

    @Override
    public double countRange() {
        return super.countRange();
    }

    @Override
    public double getAdditionalFuelConsumption() {
        double additionalFuelConsumption = 0;
        if (isAirConditioningOn()) {
            additionalFuelConsumption += TRUCK_AIR_CONDITIONING_FUEL_CONSUMPTION;
        }
        additionalFuelConsumption += loadWeight * LOAD_FUEL_CONSUMPTION / 100;
        return additionalFuelConsumption;
    }

    @Override
    public void turnAirConditioningOn() {
        super.turnAirConditioningOn();
    }

    @Override
    public void turnAirConditioningOff() {
        super.turnAirConditioningOff();
    }

    @Override
    public String info() {
        return super.info() + "waga ładunku " + loadWeight + "kg ::: ";
    }
}
