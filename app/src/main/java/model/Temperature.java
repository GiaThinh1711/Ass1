package model;

public class Temperature {
    public double value;
    public String unit;
    public int unitType;

    public Temperature(double value, String unit, int unitType) {
        this.value = value;
        this.unit = unit;
        this.unitType = unitType;
    }

    public Temperature() {
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getUnitType() {
        return unitType;
    }

    public void setUnitType(int unitType) {
        this.unitType = unitType;
    }
}