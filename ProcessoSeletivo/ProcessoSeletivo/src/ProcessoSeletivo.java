import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args){
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        for(String candidato : candidatos) {
            entrandoemcontato(candidato);
        }
    }

    static void entrandoemcontato(String candidato) {
        int tentativasrealizadas = 1;
        boolean continuartentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuartentando = !atendeu;
            if (continuartentando)
                tentativasrealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
        }while(continuartentando && tentativasrealizadas < 3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasrealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO TENTATIVAS " + tentativasrealizadas + " REALIZADA");
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirselecionados() {
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for (int indice = 0; indice < candidatos.length;indice++){
            System.out.println("O candidato de nº " + (indice + 1) + " é " + candidatos[indice]);
        }
        
        System.out.println("Forma abreviada de interação for each");
        for(String candidato:candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }

    }

    static void selecaocandidatos() {
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};

        int candidatosselecionados = 0;
        int candidatosatual = 0;
        double salariobase = 2000.0;

        while(candidatosselecionados < 5 && candidatosatual < candidatos.length){
            String candidato = candidatos[candidatosatual];
            double salariopretendido = valorpretendido();

            System.out.println("O candidato solicitou " + candidato + " este valor de salário " + salariopretendido);

            if(salariobase >= salariopretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado!");
                candidatosselecionados++;
            }
            candidatosatual++;
        }
    }

    static double valorpretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarcandidato(double salariopretendido){
        double salariobase = 2000.0;
        if(salariobase > salariopretendido){
            System.out.println("LIGAR PARA CANDIDATO");
        }else if(salariobase == salariopretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

}