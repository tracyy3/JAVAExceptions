import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean state;

    @Override
    public boolean isOn() {
        return state;
    }

    @Override
    public void setOn() {
        this.state = true;
    }

    @Override
    public void setOff() {
        this.state = false;
    }

    @Override
    public int read() {
        if (this.isOn()) {
            return new Random().nextInt(61) - 30;
        }

        throw new IllegalStateException("Temp Sensor is off!");
    }
}