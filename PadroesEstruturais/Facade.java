package PadroesEstruturais;

import PadroesEstruturais.Sistema1CRM.CrmService;
import PadroesEstruturais.Sistema2ViaCep.ViaCepService;

public class Facade {

    private Facade(){}

    public static void salvarCLiente(String nome, String cep){
        var estado = ViaCepService.getInstance().resgatarEstado(cep);
        var cidade = ViaCepService.getInstance().resgatarCidade(cep);
        CrmService.salvarCLiente(nome,cep,cidade,estado);
    }
}
