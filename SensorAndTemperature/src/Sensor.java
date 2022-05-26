public interface Sensor {
    boolean isOn(); // returns true if the sensor is on

    void setOn(); // sets sensor on

    void setOff(); // sets sensor off

    int read(); // if on, returns the value of the sensor; if sensor is not on, throws an
                // IllegalStateException
}
