package lesson03.BraginaHW3;

public class Boat implements Seller {

    public void getManufacrurer() {

        System.out.println("Task 1 (created new interface): This is honda motors");
    }
    public void makeAbstractMethod(){
        System.out.println("Task 1.2 (abstract method in interface");
        System.out.println("Ha ha ha, no need to make abstract class in interface, its abstract already");
    }
}
