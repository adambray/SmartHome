
package HeatRegulator;

public class App {
    public static void main(String args[]) {
        new App().regulateTemp(new OvenAdapter(new Oven()));
    }

    private void regulateTemp(HeatRegulator regulator) {
        int goalTemp, currentTemp;

        while (true) {
            goalTemp = regulator.getGoalTemperature();
            currentTemp = regulator.getCurrentTemperature();

            if (regulator.isOn()) {
                if (currentTemp < goalTemp) {
                    regulator.turnOnBurner();
                } else {
                    regulator.turnOffBurner();
                }
            }
        }
    }
}
