import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia;
        String nome_cliente;
        double saldo;

        System.out.print("Digite a conta: ");
        numero = scanner.nextInt();

        System.out.print("Digite a agência: ");
        agencia = scanner.next();

        System.out.print("Digite o nome do cliente: ");
        nome_cliente = scanner.next();

        System.out.print("Digite o saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque!");
        scanner.close();
    }
}