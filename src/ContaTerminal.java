import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor, me informe o seu nome: ");
        String name = input.nextLine();
        System.out.println("Digite o número da Agência: ");
        String agency = input.nextLine();
        System.out.println("Digite o número da conta: ");
        int number = input.nextInt();
        System.out.println("Digite o seu saldo: ");
        float balance = input.nextFloat();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", name, agency, number, balance);
    }
}