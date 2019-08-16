package lesson03.BraginaHW3;



public class RoadBicycle extends Bicycle {
    private int rudderDepth;
    @Override
    public void lightsOn() {
        System.out.println("Task 1_use abstract class: Lights are turned On");
    }


    public void setRudderDepth(int value){
        rudderDepth=value;
        System.out.println("Set rudder depth is "+ rudderDepth);
    }
    int getRudderDepth(){
        System.out.println("Current redder depth is "+ rudderDepth);
        return rudderDepth;

    }

    public static void main(String[] args) {


    }

    @Override
    public void move(){
        System.out.println("Distance moved to 100 m. ");
    }
}
