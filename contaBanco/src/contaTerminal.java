import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Digite a conta: ");
        numero = scanner.nextInt();

        /*System.out.print("Digite a agência: ");
        String agencia = scanner.next();

        System.out.print("Digite o nome do cliente: ");
        String nome_cliente = scanner.next();

        System.out.print("Digite o saldo: ");
        Double saldo = scanner.nextDouble();*/

        System.out.println("Olá " + numero);
        //"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".
    }
}