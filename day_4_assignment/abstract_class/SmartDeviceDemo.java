package day_4_assignment.abstract_class;

abstract class SmartDevice {
    abstract void turnOn();
    abstract void turnOff();
    abstract void performFunction();
}

class SmartPhone extends SmartDevice {
    void turnOn() {
        System.out.println("SmartPhone is turning on...");
    }

    void turnOff() {
        System.out.println("SmartPhone is turning off...");
    }

    void performFunction() {
        System.out.println("SmartPhone is calling and browsing.");
    }
}

class SmartWatch extends SmartDevice {
    void turnOn() {
        System.out.println("SmartWatch is turning on...");
    }

    void turnOff() {
        System.out.println("SmartWatch is turning off...");
    }

    void performFunction() {
        System.out.println("SmartWatch is tracking fitness and showing time.");
    }
}

class SmartSpeaker extends SmartDevice {
    void turnOn() {
        System.out.println("SmartSpeaker is turning on...");
    }

    void turnOff() {
        System.out.println("SmartSpeaker is turning off...");
    }

    void performFunction() {
        System.out.println("SmartSpeaker is playing music and responding to voice commands.");
    }
}

public class SmartDeviceDemo {
    public static void main(String[] args) {
        
        SmartDevice[] devices = new SmartDevice[3];

        devices[0] = new SmartPhone();
        devices[1] = new SmartWatch();
        devices[2] = new SmartSpeaker();

        for (SmartDevice device : devices) {
            device.turnOn();
            device.performFunction();
            device.turnOff();
            System.out.println("--------------");
        }
    }
}