import java.util.Map;

public class Main {
    public static void main(String[] args) {
    SingletonLazy instance = SingletonLazy.getInstance();
    System.out.println(instance);
    SingletonLazy instance2 = SingletonLazy.getInstance();
    System.out.println(instance2);
    System.out.println(instance.equals(instance2));
    System.out.println(SingletonLazy.validateCpf("10381763447"));
    }
}
