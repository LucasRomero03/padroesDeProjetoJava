package PadroesEstruturais.Sistema2ViaCep;

public class ViaCepService {

    private static  ViaCepService viaCepService;

    private ViaCepService() {}

    public static ViaCepService getInstance(){
        if (viaCepService == null){
            viaCepService = new ViaCepService();
        }
        return viaCepService;
    }

    public  String resgatarEstado(String cep){
        return "PE";
    }

    public  String resgatarCidade(String cep){
        return "Recife";
    }
}
