import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada agenda = new ListaEncadeada();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        String nome;
        int telefone;
        String email;

        do {
            System.out.println("==============================================");
            System.out.println("               Menu de Opções                 ");
            System.out.println("=============================================="); 
            System.out.println("1. Incluir um Contato");
            System.out.println("2. Remover um Contato pelo telefone");
            System.out.println("3. Listar todos os Contatos");
            System.out.println("4. Pesquisar um Contato pelo telefone");
            System.out.println("5. Mostrar contatos com um valor no telefone e verificar se existem valores repetidos");
            System.out.println("6. Remover contatos repetidos");
            System.out.println("7. Sair do Programa");
            System.out.println("==============================================");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            if (opcao == 1) {
                System.out.print("Digite o nome: ");
                nome = scanner.nextLine();
                System.out.print("Digite o telefone: ");
                telefone = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer
                System.out.print("Digite o email: ");
                email = scanner.nextLine();
                agenda.incluirContato(nome, telefone, email);

            } else if (opcao == 2) {
                System.out.print("Digite o telefone do contato a ser removido: ");
                telefone = scanner.nextInt();
                agenda.removerContato(telefone);

            } else if (opcao == 3) {
                agenda.listarContatos();

            } else if (opcao == 4) {
                System.out.print("Digite o telefone do contato a ser pesquisado: ");
                telefone = scanner.nextInt();
                agenda.pesquisarContato(telefone);

            } else if (opcao == 5) {
                System.out.print("Digite o telefone a ser pesquisado: ");
                telefone = scanner.nextInt();
                agenda.mostrarContatosComValor(telefone);

            } else if (opcao == 6) {
                agenda.removerContatosRepetidos();
            
            } else if (opcao == 7){
                System.out.print("Programa Finalizado.\n");
            } 

        } while (opcao != 7);

        scanner.close();
    }
}

