public class SingletonEager {
    //SIngleton apressado, pois ele não faz a verificação,
    // ele na hora que é acionada já cria uma instancia nova e atribui a variavel statica

    private static SingletonEager singletonEager = new SingletonEager();

    private SingletonEager() {}

    public static SingletonEager getInstance() {
        return singletonEager;
    }
}
