package lesson03.BraginaHW3;

public interface Seller {
    public void getManufacrurer();
    public default boolean isNew (){
        System.out.println("Task 1.2 (default method usage)");
        return true;
    }
    public void makeAbstractMethod();

}
