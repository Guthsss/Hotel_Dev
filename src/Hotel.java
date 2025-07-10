import java.util.Scanner;

public class Hotel {

    static short opcao;
    static String[] quartos = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public void checkin() {
        System.out.println("");
        System.out.println("Escolha o quarto: ");
        int quarto = scanner.nextInt();
        if (quartos[quarto] == " ") {

        }
    }
    public void checkout() {
    }
    public void exibirQuartos() {
    }
    public void procurarHospede() {
    }

    public static void main(String[] args) {

        for (short i = 0; i < 10; i++) {
            quartos[i] = " ";
        }

        while (opcao != 5) {

            System.out.println("==================================\nHotel Dev - O Código aconchegando\n==================================");
            System.out.println("[1] Check-in (Ocupar Quarto)\n[2] Check-out (Liberar Quarto)\n[3] Ver Lista de Quartos\n[4] Procurar Hóspede\n[5] Sair");

            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextShort();

            switch (opcao) {
                case 5 -> {
                    opcao = 5;
                    System.out.println("\nEncerrando o programa...");
                    scanner.close();
                }
                default -> {
                    System.out.println("Opção inválida.");
                }
            }
        }
    }
}