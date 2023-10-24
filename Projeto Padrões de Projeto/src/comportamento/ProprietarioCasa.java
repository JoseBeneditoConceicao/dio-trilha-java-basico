package comportamento;

public class ProprietarioCasa implements Observer {

    private final String nome;

    public ProprietarioCasa(String nome) {
        this.nome = nome.toUpperCase();
    }

    public void update(double porcentagem) {
        if (porcentagem == 100) {
            System.out.println(
                    String.format("\tPARABÉNS, %s! A OBRA ACABOU!!!", nome)
            );
        } else {
            System.out.println(
                    String.format(
                            "Mais um pouquinho de paciência, %s... A obra do condomínio está em %.2f%%",nome, porcentagem
                    )
            );
        }
    }
}
