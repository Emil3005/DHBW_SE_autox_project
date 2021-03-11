package autox.Tasks;

import autox.elements.Radio;

public class RunRadio {
    public static void main(String... args) {
        start();
    }

    private static void start() {
        Radio radio = new Radio();
        radio.turnOn();
    }
}
