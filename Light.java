public class Light implements HomeService{
    @Override
    public void turnOn(){
            //execute charging to laptop
        System.out.println("Light turned on.");    
    }

    @Override
    public void turnOff(){
    System.out.println("Light turned off. ");
    }
}