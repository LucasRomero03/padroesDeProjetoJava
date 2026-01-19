package PadroesCriacionais;

public class SingletonLazy {

    private  static SingletonLazy instance;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if(instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
    public static boolean validateCpf(String str){
        if(str.length() != 11) return false;
        return true;
    }
}
