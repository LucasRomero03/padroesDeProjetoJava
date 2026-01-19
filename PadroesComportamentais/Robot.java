package PadroesComportamentais;

public class Robot {
    private String nome;
    private ComportamentoStrategy comportamento;

    public Robot(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ComportamentoStrategy getComportamento() {
        return comportamento;
    }

    public void setComportamento(ComportamentoStrategy comportamento) {
        this.comportamento = comportamento;
    }

    public void mover(){
        comportamento.andar();
    }

    public void pular(){
        comportamento.pular();
    }
}

