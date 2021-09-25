package com.company;

public class Car implements CarbonFootprint{
    private Engine engine;
    private int kilometers;

    public Car() {
    }

    public Car(Engine engine, int kilometers) {
        this.engine = engine;
        this.kilometers = kilometers;
    }

    public Car(Car car) {
        this.engine = car.getEngine();
        this.kilometers = car.kilometers;
    }

    @Override
    public double getCarbonFootprint() {
        double ef = 0.0;
        switch (engine){
            case CNG -> ef = 0.05444;
            case LPG -> ef = 5.68;
            case Diesel -> ef = 10.21;
            case Motor_Gasoline -> ef = 8.78;
        }
        return ef * kilometers;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", kilometers=" + kilometers +
                '}';
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }
}
