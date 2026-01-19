import PadroesCriacionais.SingletonEager;
import PadroesCriacionais.SingletonLazy;
import PadroesCriacionais.SingletonLazyHolder;

public class Main {
    public static void main(String[] args) {

    //Singleton
    System.out.println("--- SingletonLazy ---");
    SingletonLazy instance = SingletonLazy.getInstance();
    System.out.println(instance);
    SingletonLazy instance2 = SingletonLazy.getInstance();
    System.out.println(instance2);
    System.out.println("A instancia são iguais?"+instance.equals(instance2));
    //System.out.println(SingletonLazy.validateCpf("10381763447"));

    System.out.println("--- SingletonEager ---");
    SingletonEager eager = SingletonEager.getInstance();
    System.out.println(eager);
    SingletonEager eager2 = SingletonEager.getInstance();
    System.out.println(eager2);
    System.out.println("A instancia são iguais?"+eager.equals(eager2));

    System.out.println("--- SingletonLazyHolder ---");
    SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
    System.out.println(lazyHolder);
    SingletonLazyHolder lazyHolder2 = SingletonLazyHolder.getInstance();
    System.out.println(lazyHolder2);
    System.out.println("A instancia são iguais?"+lazyHolder.equals(lazyHolder2));
    }
}
