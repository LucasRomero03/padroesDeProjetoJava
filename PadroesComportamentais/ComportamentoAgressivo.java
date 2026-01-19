package PadroesComportamentais;

public class ComportamentoAgressivo implements  ComportamentoStrategy {
    @Override
    public void andar() {
        System.out.println("Comportamento Agressivo");
    }

    @Override
    public void pular() {
        System.out.println("Comportamento Agressivo");
    }
}
