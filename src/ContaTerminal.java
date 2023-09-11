import java.util.Scanner;

/**
 * ContaTerminal
 */
public class ContaTerminal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Programa de Conta Bancária");
    System.out.print("Digite o número da conta:");
    Integer numero = scanner.nextInt();
    System.out.println();
    scanner.nextLine();
    System.out.print("Digite a agência da conta:");
    String agencia = scanner.nextLine();
    System.out.println();
    
    System.out.print("Digite o nome do cliente:");
    
    String nomeCliente = scanner.nextLine();
    System.out.println();
    System.out.print("Digite o saldo da conta:");
    Double saldo = scanner.nextDouble();
    System.out.println();
    scanner.close();
    Conta conta = new Conta(numero, agencia, nomeCliente, saldo);
    System.out.println("Conta criada com sucesso!");
    System.out.println("Olá "+ conta.getNomeCliente() +", obrigado por criar uma conta " + 
                        "em nosso banco, sua agência é "+ conta.getAgencia() +", conta " +
                        conta.getNumero() +" e seu saldo " + conta.getSaldo() +" já está disponível " +
                        "para saque");
  }
}