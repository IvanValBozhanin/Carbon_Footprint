package com.company;

public class Building implements CarbonFootprint{
    private int electricity, lpg, waste, water;

    public Building() {
    }

    public Building(int electricity, int lpg, int waste, int water) {
        this.electricity = electricity;
        this.lpg = lpg;
        this.waste = waste;
        this.water = water;
    }

    public Building(Building building){
        this.electricity = building.electricity;
        this.lpg = building.lpg;
        this.waste = building.waste;
        this.water = building.water;
    }

    @Override
    public double getCarbonFootprint() {
        return 0.4374*(electricity + lpg + waste * 365 + water * 52);
    }

    @Override
    public String toString() {
        return "Building{" +
                "electricity=" + electricity +
                ", lpg=" + lpg +
                ", waste=" + waste +
                ", water=" + water +
                '}';
    }

    public int getElectricity() {
        return electricity;
    }

    public void setElectricity(int electricity) {
        this.electricity = electricity;
    }

    public int getLpg() {
        return lpg;
    }

    public void setLpg(int lpg) {
        this.lpg = lpg;
    }

    public int getWaste() {
        return waste;
    }

    public void setWaste(int waste) {
        this.waste = waste;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }
}
