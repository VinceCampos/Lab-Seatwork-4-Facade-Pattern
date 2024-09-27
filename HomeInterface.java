public class HomeInterface{ // facade interface
    private Light light;
    private TV tv;
    private Airconditioning ac;

    public HomeInterface(){
        this.light = new Light();
        this.tv = new TV();
        this.ac = new Airconditioning();
    }

    public void turnOnAll(){
        light.turnOn();
        tv.turnOn();
        ac.turnOn();
    }

    public void turnOffAll(){
        light.turnOff();
        tv.turnOff();
        ac.turnOff();
    }
}