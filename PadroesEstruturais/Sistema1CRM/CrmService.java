package PadroesEstruturais.Sistema1CRM;

public class CrmService {
    private CrmService() {
    }

    public static void salvarCLiente(String nome, String cep,String cidade, String estado){
        System.out.println("Salvando CLiente");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);

    }
}
