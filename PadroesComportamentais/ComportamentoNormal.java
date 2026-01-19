package PadroesComportamentais;

public class ComportamentoNormal implements ComportamentoStrategy {
    @Override
    public void andar() {
        System.out.println("Comportamento Normal");
    }

    @Override
    public void pular() {
        System.out.println("Comportamento Normal");

    }
}
