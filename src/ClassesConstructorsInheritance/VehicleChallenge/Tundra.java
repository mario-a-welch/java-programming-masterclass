package ClassesConstructorsInheritance.VehicleChallenge;

public class Tundra extends Car{

    private int roadServiceMonths;

    public Tundra(int roadServiceMonths) {
        super("Tundra", "4WD", 5, 4, 8, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){

        int newSpeed = getCurrentSpeed() + rate;
        if(newSpeed == 0){
            stop();
            setCurrentGear(1);
        }else if(newSpeed > 0 && newSpeed <= 10){
            setCurrentGear(1);
        } else if(newSpeed > 10 && newSpeed <= 20){
            setCurrentGear(2);
        } else if(newSpeed > 20 && newSpeed <= 30){
            setCurrentGear(3);
        } else{
            setCurrentGear(4);
        }

        if(newSpeed > 0){
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
