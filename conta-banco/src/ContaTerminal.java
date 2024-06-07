import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TO DO: Conhecer  e importar classe Scanner
        Scanner scanner = new Scanner(System.in);

        //Exibir as mensagens para o novo usuario
        //Obter pela Scanner os valores digitados no terminal


        System.out.println("Insira a agencia bancaria: ");
        String agencia = scanner.nextLine();
        

        System.out.println("Insira o numero da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner


        System.out.println("Insira o nome do cliente: ");
        String nomeCliente = scanner.nextLine();


        System.out.println("Insira o saldo da conta: ");
        Double saldo = scanner.nextDouble();

        System.out.println("\n");
        //Exibir mensagem criada
        System.out.println("olá " + nomeCliente + ", Obrigado por criar uma conta em nosso Banco, sua agencia é " + agencia + ", conta " + numero + "e seu saldo " + saldo + "\n já está dispoível para saque.");





    }
}
      
