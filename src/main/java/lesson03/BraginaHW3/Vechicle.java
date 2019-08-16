package lesson03.BraginaHW3;

public abstract class Vechicle {
    private String model;
    int speed;

    public void speedUp(int value){

        if(value<=0)
            System.out.println("Incorrect value");
        else
            System.out.println("Speed increased to "+ value);
    }
    public void applyBrake(int value){
        if(value>=0)
            System.out.println("Incorrect value");
        else
            System.out.println("Speed decreased to "+ value);
    }
    public void setModel(String model){}

    public String getModel(){
        return null;
    };
    public void move(){}
    final void stop(){}


    public abstract String equals();

    public static void statMethod(){
        System.out.println("Task 1.2 (create static method) Yes, this method doesn't require an object");
    }


}
