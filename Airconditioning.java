public class Airconditioning implements HomeService{
    @Override
    public void turnOn(){
            //execute charging to laptop
        System.out.println("AC is turned on.");    
    }

    @Override
    public void turnOff(){
    System.out.println("AC is turned off. ");
    }
}