package DigitalInovationOne.GOF.Singleton;

/**
 * Singleton Eager(apressado):
 */
public class SingletonEager {
    private static final SingletonEager instacia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstacia() {
        return instacia;
    }


}
