import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
    while (true) {
        System.out.println("Menu\n1. Adicionar Animal\n2.Listar todos os animais\n3.Remover animais(por ID\n4. Emitir som de um animal (por ID)\n5.Testar habilidade de um animal(por ID\n6.Sair do programa)");
        int opcao = sc.nextInt();
        if(opcao == 1) {
            System.out.println("Digite o id do animal");
            long id = sc.nextLong();
            System.out.println("Digite nome do animal");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.println("Digite a idade do animal");
            int age = sc.nextInt();
        }
    }

    }