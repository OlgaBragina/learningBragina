package lesson03.BraginaHW3;



public class MountainBicycle extends Bicycle{
    public int speed;
    private int seatHeight;
    void setSeatHeight(int value){
        seatHeight=value;
        System.out.println("Height is set in system "+seatHeight);


    }

    int getSeatHeight(){
        System.out.println("Current height is "+ seatHeight);
        return seatHeight;

    }
    @Override
    public void lightsOn(){
        System.out.println("Task 1.3 (overriding example) + Lights are turned On");

    }


}
