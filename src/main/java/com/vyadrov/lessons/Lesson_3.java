package vyadrov.lessons;
public class Lesson_3 {
    public static void main( String[] args ) {
        int sensor = 120;
        byte oldThermometer;
        int newThermometer;
        oldThermometer = (byte)sensor;
        newThermometer = (short)sensor;

        System.out.println("Old Thermometer: " + oldThermometer);
        System.out.println("New Thermometer: " + newThermometer);

    }
}
