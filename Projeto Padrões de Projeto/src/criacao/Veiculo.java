package criacao;

public class Veiculo {

    private String montadora;
    private String modelo;
    private String motor;
    private String cor;
    private String transmissao;
    private String velocidadeMaxima;

    public String toString() {
        return String.format(
                "CARRO: Montadora: %sModelo: %sMotor: %sCor: %sTransmissão: %sVelocidade Máxima: %s",montadora, modelo, motor, cor, transmissao, velocidadeMaxima);
    }
}
