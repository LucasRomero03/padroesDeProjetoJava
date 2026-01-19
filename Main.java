import PadroesComportamentais.ComportamentoAgressivo;
import PadroesComportamentais.ComportamentoNormal;
import PadroesComportamentais.ComportamentoStrategy;
import PadroesComportamentais.Robot;
import PadroesCriacionais.SingletonEager;
import PadroesCriacionais.SingletonLazy;
import PadroesCriacionais.SingletonLazyHolder;
import PadroesEstruturais.Facade;

public class Main {
    public static void main(String[] args) {

    //Singleton
    System.out.println("--- SingletonLazy ---");
    SingletonLazy instance = SingletonLazy.getInstance();
    System.out.println(instance);
    SingletonLazy instance2 = SingletonLazy.getInstance();
    System.out.println(instance2);
    System.out.println("A instancia são iguais?"+instance.equals(instance2));
    System.out.println("--- SingletonLazy ---");
    //System.out.println(SingletonLazy.validateCpf("10381763447"));

    System.out.println("\n--- SingletonEager ---");
    SingletonEager eager = SingletonEager.getInstance();
    System.out.println(eager);
    SingletonEager eager2 = SingletonEager.getInstance();
    System.out.println(eager2);
    System.out.println("A instancia são iguais?"+eager.equals(eager2));
    System.out.println("--- SingletonEager ---");

    System.out.println("\n--- SingletonLazyHolder ---");
    SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
    System.out.println(lazyHolder);
    SingletonLazyHolder lazyHolder2 = SingletonLazyHolder.getInstance();
    System.out.println(lazyHolder2);
    System.out.println("A instancia são iguais?"+lazyHolder.equals(lazyHolder2));
    System.out.println("--- SingletonLazyHolder ---");

    //Strategy
    System.out.println("\n--- Strategy ---");
    ComportamentoStrategy normal = new ComportamentoNormal();
    ComportamentoStrategy agressivo = new ComportamentoAgressivo();
    Robot robo1 = new Robot("Robot 1");
    robo1.setComportamento(normal);
    robo1.mover();
    robo1.pular();
    robo1.setComportamento(agressivo);
    robo1.mover();
    robo1.pular();
    System.out.println("--- Strategy ---");

    //Facade
    System.out.println("\n--- Facade ---");
    Facade.salvarCLiente("lucas","52000000");
    System.out.println("--- Facade ---");


    }
}
