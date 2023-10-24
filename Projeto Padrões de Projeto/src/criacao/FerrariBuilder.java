package criacao;

public class FerrariBuilder implements VeiculoBuilder {

    private final Veiculo veiculo;

    public FerrariBuilder() {
        this.veiculo = new Veiculo();
        this.veiculo.setMontadora("Ferrari");
    }

    public VeiculoBuilder modelo(Enum modelo) {
        Modelo m = (Modelo) modelo;

        veiculo.setModelo(m.getModelo());
        veiculo.setMotor(m.getMotor().getMotor());
        veiculo.setVelocidadeMaxima(m.getMotor().getVelocidade());

        return this;
    }

    public VeiculoBuilder transmissao(String transmissao) {
        veiculo.setTransmissao(transmissao);
        return this;
    }

    public Veiculo builder() {
        return veiculo;
    }

    public VeiculoBuilder cor(String cor) {
        veiculo.setCor(cor);
        return this;
    }

    public enum Modelo {

        GTB("Ferrari 296 GTB", Motor.V6),
        F8_TRIBUTO("Ferrari F8 Tributo", Motor.V8),
        SP51("Ferrari SP51", Motor.V12);

        public String modelo;
        public Motor motor;

        Modelo(String modelo, Motor motor) {
            this.modelo = modelo;
            this.motor = motor;
        }

        public Object getModelo() {
            return null;
        }
    }

    public enum Motor {

        V6("V6 | 3.0 Biturbo | 663cv", "330km/h"),
        V8("V8 | 3.9 Biturbo | 720cv", "340km/h"),
        V12("V12 | 6.5 Aspirado | 800cv", "340km/h");

        private final String motor;
        private final String velocidade;

        Motor(String motor, String velocidade) {
            this.motor = motor;
            this.velocidade = velocidade;
        }
    }
}
