package pl.javastart.task.model;

public class Car extends Vehicle {
    private static final double CAR_AIR_CONDITIONING_FUEL_CONSUMPTION = 0.8;
    private boolean airConditioningOn;

    public Car(String name, double tankCapacity, double avgFuelConsumptionPer100, boolean airConditioningOn) {
        super(name, tankCapacity, avgFuelConsumptionPer100);
        this.airConditioningOn = airConditioningOn;
    }

    public boolean isAirConditioningOn() {
        return airConditioningOn;
    }

    public void turnAirConditioningOn() {
        airConditioningOn = true;
    }

    public void turnAirConditioningOff() {
        airConditioningOn = false;
    }

    @Override
    public double countRange() {
        double additionalFuelConsumption = getAdditionalFuelConsumption();
        return getTankCapacity() / (getAvgFuelConsumptionPer100() + additionalFuelConsumption) * 100;
    }

    public double getAdditionalFuelConsumption() {
        double additionalFuelConsumption = 0;
        if (airConditioningOn) {
            additionalFuelConsumption += CAR_AIR_CONDITIONING_FUEL_CONSUMPTION;
        }
        return additionalFuelConsumption;
    }

    @Override
    public String info() {
        String text;
        if (airConditioningOn) {
            text = "tak";
        } else {
            text = "nie";
        }
        return super.info() + "klimatyzacja włączona? " + text + " ::: ";
    }
}
