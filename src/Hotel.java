import java.util.Scanner;

public class Hotel {

    static short opcao;
    static String[] quartos = new String[10];
    static Scanner sc = new Scanner(System.in);
    static String nome1;
    static String nome2;

    int quarto;

    public void checkin() {
        System.out.print("Qual seu nome: ");
        nome1 = sc.next();

        for (int i = 1; i <= quartos.length; i ++) {
            System.out.println("Quarto [" + i + "] - " + quartos[i - 1]);
        }
        System.out.print("Escolha o quarto: ");
        int quarto = sc.nextInt();
        if (quartos[quarto - 1] == "Livre") {
            quartos[quarto - 1] = "Ocupado - " + nome1;
        } else {
            System.out.println("Este quardo está ocupado");
        }
    }
    public void checkout() {
        for (int i = 1; i <= quartos.length; i ++) {
            System.out.println("Quarto [" + i + "] - " + quartos[i - 1]);
        }
        System.out.print("Qual seu quarto: ");
        quarto = sc.nextInt();
        if (quartos[quarto - 1].contains("Ocupado")) {
            quartos[quarto - 1] = "Livre";
        } else {
            System.out.println("Este quarto já está livre, escolha um quarto ocupado.");
        }
    }
    public void exibirQuartos() {
        for (int i = 1; i <= quartos.length; i ++) {
            System.out.println("Quarto [" + i + "] - " + quartos[i - 1]);
        }
    }
    public void procurarHospede() {
        System.out.print("Qual seu nome: ");
        nome2 = sc.next();
        for (int i = 1; i <= quartos.length; i ++) {
            if (quartos[i].contains(nome2)) {
                System.out.println(nome2 + " está no quarto[" + (i + 1) + "]");
                break;
            } else {
                System.out.println("Seu nome não está inserido no nosso banco de dados.");
                break;
            }
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < quartos.length; i ++) {
            quartos[i] = "Livre";
        }
        Hotel object = new Hotel();
        while (opcao != 5) {

            System.out.println("==================================\nHotel Dev - O Código aconchegando\n==================================");
            System.out.println("[1] Check-in (Ocupar Quarto)\n[2] Check-out (Liberar Quarto)\n[3] Ver Lista de Quartos\n[4] Procurar Hóspede\n[5] Sair");

            System.out.print("\nEscolha uma opção: ");
            opcao = sc.nextShort();

            switch (opcao) {
                case 1 -> object.checkin();
                case 2 -> object.checkout();
                case 3 -> object.exibirQuartos();
                case 4 -> object.procurarHospede();
                case 5 -> {
                    opcao = 5;
                    System.out.println("\nEncerrando o programa...");
                    sc.close();
                }
                default -> {
                    System.out.println("Opção inválida.");
                }
            }
        }
    }
}