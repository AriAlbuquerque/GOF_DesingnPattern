package DigitalInovationOne.GOF;

/**
 * Singleton Lazy Holder:
 */
public class SingletonLazyHolder {
    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();

    }
}
