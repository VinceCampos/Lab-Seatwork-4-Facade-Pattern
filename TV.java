public class TV implements HomeService{
    @Override
    public void turnOn(){
            //execute charging to laptop
        System.out.println("Television is turned on.");    
    }

    @Override
    public void turnOff(){
    System.out.println("Television is turned off. ");
    }

    
}