class Lights {
    void turnLightOn() {
        System.out.println("Light on");
    }
    void turnLightOff() {
        System.out.println("Light off");
    }

}

class Thermostat{
    void setTemperature(int temp) {
        System.out.println("Thermostat set temperature: " + temp);

    }
}

class SecuritySystem{
    void arm(){
        System.out.println("Security System arm");
    }

    void disarm(){
        System.out.println("Security System disarm");
    }
}


class SmartHomeFacade {
    private Lights lights;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;

    public SmartHomeFacade() {
        this.lights = new Lights();
        this.thermostat = new Thermostat();
        this.securitySystem = new SecuritySystem();
    }


    void activateNightMode(){
        lights.turnLightOn();
        thermostat.setTemperature(18);
        securitySystem.arm();
    }



    void deactivateNightMode(){
        lights.turnLightOff();
        thermostat.setTemperature(22);
        securitySystem.disarm();
    }

}



public class SmartHomeSystem {
    public static void main(String[] args) {
        SmartHomeFacade facade = new SmartHomeFacade();

        facade.activateNightMode();
        facade.deactivateNightMode();

    }
}

