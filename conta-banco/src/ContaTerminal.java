
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numeroDaConta;
        String agencia;
        String nomeDoCliente;
        double saldo;

        System.out.println("Digite o número da conta: ");
        numeroDaConta = sc.nextInt();
        System.out.println("Digite o número da agência: ");
        agencia = sc.next();
        System.out.println("Digite o seu nome: ");
        nomeDoCliente = sc.next();
        System.out.println("Digite o seu saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Olá "+nomeDoCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroDaConta+" e seu saldo "+saldo+" já está disponível para saque");
        sc.close();
    }
}
