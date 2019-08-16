package lesson03.BraginaHW3;

public class Runner {

    class InnerRunner{
        public void helloInner(){
            System.out.println("Task 1.5(inner class)");
        }
    }
    static class StaticRunner{
        public void helloStatic(){
            System.out.println("Task 1.5(static class)");
        }
    }

    public static void lightsOn(int lights){
        System.out.println("Task 1.3(oveloading method) Number of lights " + lights);
    }

    public static void main(String[] args) {
        MountainBicycle mountainBicycle = new MountainBicycle();
        RoadBicycle roadBicycle = new RoadBicycle();
        Runner.InnerRunner inner = new Runner().new InnerRunner();
        Runner.StaticRunner stat = new Runner.StaticRunner();
        roadBicycle.lightsOn();

        Boat boat = new Boat();

        boat.getManufacrurer();
        System.out.println("Is it new? " + boat.isNew());

        Vechicle.statMethod();

        boat.makeAbstractMethod();
        //lightsOn have no int to work with
        mountainBicycle.lightsOn();
        //Overloaded lightsOn that has int to be filled
        Runner.lightsOn(4);

        inner.helloInner();
        stat.helloStatic();

        Runnable anonymRunner = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task 1.5(anonymous class)");
            }
        };
        anonymRunner.run();

//        MountainBicycle bmx = new MountainBicycle();
//        bmx.gear = 5;
//        bmx.speed = 65;
////      using variable and methods
//
//        bmx.setSeatHeight(15);
//        bmx.getSeatHeight();
//
//        RoadBicycle orlenok = new RoadBicycle();
//        orlenok.setRudderDepth(12);
//        orlenok.getRudderDepth();
//
////        Override
//        orlenok.move();
//        //overload
////       Bicycle threeWheel = new Bicycle(4, 0);
////        Bicycle ukraine = new Bicycle();
//
//        // helicopter
//
//        Helicopter zdx567 = new Helicopter();
//        zdx567.hashCode();
//
//
//        Helicopter fx35 = new Helicopter();
//        fx35.hashCode();
//
//
//// Set same values to variables of Car. Print Them in console
//        Car hundai = new Car();
//        Car.carType = "sportcar";
//        Car.transmissin="8AT";
//        System.out.print( Car.carType + Car.transmissin);

        // Override hashCode() and equals() in Helicopter. Create few objects of Helicopter and compare them using ‘==’ and equals().
        //Create few objects of RoadBicycle and compare them using ‘==’ and equals(). Find the difference

    }
}
