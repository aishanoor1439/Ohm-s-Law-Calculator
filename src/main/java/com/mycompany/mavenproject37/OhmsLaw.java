
package com.mycompany.mavenproject37;

public class OhmsLaw {
    private Double voltage;
    private Double current;
    private Double resistance;

    public OhmsLaw(Double voltage, Double current, Double resistance) {
        this.voltage = voltage;
        this.current = current;
        this.resistance = resistance;
    }

    public void calculate() {
        if (voltage == null && current != null && resistance != null) {
            voltage = current * resistance;
        } else if (current == null && voltage != null && resistance != null) {
            current = voltage / resistance;
        } else if (resistance == null && voltage != null && current != null) {
            resistance = voltage / current;
        }
    }

    public Double getVoltage() {
        return voltage;
    }

    public Double getCurrent() {
        return current;
    }

    public Double getResistance() {
        return resistance;
    }
}
