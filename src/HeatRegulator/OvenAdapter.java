package HeatRegulator;

public class OvenAdapter implements HeatRegulator {
    private final Oven oven;

    OvenAdapter(Oven oven) {
        this.oven = oven;
    }

    @Override
    public int getGoalTemperature() {
        return oven.in(0x02);
    }

    @Override
    public int getCurrentTemperature() {
        return oven.in(0x01);
    }

    @Override
    public boolean isOn() {
        return oven.in(0x03) == 1;
    }

    @Override
    public void turnOnBurner() {
        oven.out(0x04, true);
    }

    @Override
    public void turnOffBurner() {
        oven.out(0x04, false);
    }
}
