import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando o objeto Scanner para receber os dados do usuário
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Declaração das variáveis que armazenarão os dados da conta
        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 0;

        try {
            // Solicitação dos dados ao usuário
            System.out.println("Por favor, digite o número da Conta!");
            numero = Integer.parseInt(scanner.nextLine());

            System.out.println("Por favor, digite o número da Agência!");
            agencia = scanner.nextLine();

            System.out.println("Por favor, digite o nome do Cliente!");
            nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o saldo (use ponto como separador decimal, ex: 123.45)!");

            try {
                saldo = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Formato de saldo inválido. Usando saldo zero.");
            }

            // Exibindo a mensagem formatada com os dados inseridos
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                    "sua agência é " + agencia + ", conta " + numero + " e seu saldo " +
                    saldo + " já está disponível para saque");

        } catch (Exception e) {
            System.out.println("Erro na entrada de dados: " + e.getMessage());
        } finally {
            // Fechando o scanner
            scanner.close();
        }
    }
}