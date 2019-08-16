package lesson03.BraginaHW3;

public abstract class  Bicycle  {
    public final int ID = 1;
   protected int gear;

    public Bicycle(){}
    public Bicycle(int id, int gear){}
    public void changeGear(int value){
        if(value<=0)
            System.out.println("Incorrect value");
        else
            System.out.println("Gear increased to "+ value);
    }
    public void move(){
        System.out.println("Some bicycle moved");
    }

    public abstract void lightsOn();


}
