package DigitalInovationOne.GOF;

import DigitalInovationOne.GOF.Facade.Facade;
import DigitalInovationOne.GOF.Singleton.SingletonEager;
import DigitalInovationOne.GOF.Singleton.SingletonLazy;
import DigitalInovationOne.GOF.Singleton.SingletonLazyHolder;
import DigitalInovationOne.GOF.Strategy.*;

public class Test {
    public static void main(String[] args) {


        // Singleton;
        // Testes relacionados ao Desingn Pattern Singleton:

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstacia();
        System.out.println(eager);
        eager = SingletonEager.getInstacia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);


        // Strategy;
        // Testes relacionados ao Desingn Pattern Strategy:

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();

        robo.setStrategy(defensivo);
        robo.mover();
        robo.mover();

        robo.setStrategy(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facade;
        // Testes relacionados ao Desingn Pattern Facade:

        Facade facade = new Facade();
            facade.migrarCliente("Nicolas", "03472000");
        }


    }

