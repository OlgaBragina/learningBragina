package lesson03.BraginaHW3;


public final class Engine {
    private static Engine _instance = null;

    private Engine() {}

    public static synchronized Engine getInstance() {
        if(_instance == null)
            _instance = new Engine();
        return _instance;
    }
}
