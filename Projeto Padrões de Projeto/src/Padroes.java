import comportamento.ObraCondominio;
import comportamento.ProprietarioCasa;
import criacao.FerrariBuilder;
import criacao.Veiculo;
import estrutura.Coca;
import estrutura.Cocadiet;

public class Padroes {

    public static void main(String[] args) {
        padraoDecorator();
        padraoObserver();
        padraoBuilder();
    }

    private static void padraoDecorator() {
        System.out.println("--------ESTRUTURAL--------");

        //Instanciando objeto
        Coca Coca = new Cocadiet();
        Coca.imprimir();
    }

    private static void padraoObserver() {
        System.out.println("--------COMPORTAMENTAL--------");

        var pessoa1 = new ProprietarioCasa("Ze");
        var condominio = new ObraCondominio(20);
        condominio.registerObserver(pessoa1);
        condominio.setConstruidas(10);
        condominio.removeObserver(pessoa1);
        condominio.setConstruidas(15);
        condominio.setConstruidas(5);
        condominio.setConstruidas(1);
    }

    private static void padraoBuilder() {
        System.out.println("--------CRIACAO--------");

        construirFerrari(FerrariBuilder.Modelo.GTB, "Branca", "Automática");
    }

    private static void construirFerrari(FerrariBuilder.Modelo modelo, String cor, String transmissao) {

        Veiculo ferrari
                = new FerrariBuilder()
                        .modelo(modelo)
                        .cor(cor)
                        .transmissao(transmissao)
                        .builder();

        System.out.println("\n***");
        System.out.println(ferrari);
    }
}