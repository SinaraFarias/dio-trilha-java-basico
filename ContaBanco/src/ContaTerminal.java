import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();
    

        System.out.println("Digite sua Agência: ");
        String agencia = scanner.next();
        
        System.out.println("Digite sua Conta:");
        int conta = scanner.nextInt();

        System.out.println("Digite seu saldo:");
        double saldo = scanner.nextDouble();

        
        
        System.out.println("Ola, " + nome + " " + sobrenome + ". Obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ".");
        System.out.println("Sua conta " + conta + "." );
        System.out.println("Seu saldo atual de R$ " + saldo + " já está disponível para saque.");
        
        
    }
}