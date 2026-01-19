package PadroesCriacionais;

// Bom ainda tenho que dar uma olhada a fundo sobre esse assunto, mas a utilidade dela é a questão do thread safe
//e o lazy initialization por temos uma classe que encapsula essa instancia e ela só é criada de fato quand oé chamada
public class SingletonLazyHolder {

    private SingletonLazyHolder(){}

    private static class singletonHolder{
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    public static SingletonLazyHolder getInstance(){
        return singletonHolder.instance;
    }

}
