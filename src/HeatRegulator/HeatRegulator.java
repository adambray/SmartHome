package HeatRegulator;

public interface HeatRegulator {
    int getGoalTemperature();
    int getCurrentTemperature();
    boolean isOn();
    void turnOnBurner();
    void turnOffBurner();
}
