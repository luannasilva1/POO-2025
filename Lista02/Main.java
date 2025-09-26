import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        boolean exibirMenu = true;

        while (Menu) {
            System.out.println("\n=== ZOOLOGICO ===");
            System.out.println("1 - Adicionar Animal");
            System.out.println("2 - Listar todos os animais");
            System.out.println("3 - Remover Animal");
            System.out.println("4 - Emitir Som de um animal");
            System.out.println("5 - Testar Habilidade de um animal");
            System.out.println("6 - Sair do programa");
            System.out.println("Escolha uma opção: ");

            int opcao = sc.nextInt();

            if (opcao == 1) {
                adicionarAnimal(zoo);
            } else if (opcao == 2) {
                listarAnimais(zoo);
            } else if (opcao == 3) {
                removerAnimal(zoo);
            } else if (opcao == 4) {
                emitirSomAnimal(zoo);
            } else if (opcao == 5) {
                testarHabilidadeAnimal(zoo);
            } else if (opcao == 6) {
                System.out.println("Saindo do programa...");
                Menu = false;
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    public static void adicionarAnimal(Zoo zoo) {
        System.out.println("\n=== ADICIONAR ANIMAL ===");
        System.out.println("Tipos disponíveis:");
        System.out.println("1 - Gato (Cat)");
        System.out.println("2 - Cachorro (Dog)");
        System.out.println("3 - Pássaro (Bird)");
        System.out.print("Escolha o tipo do animal: ");

        int tipo = sc.nextInt();

        System.out.print("Digite o ID do animal: ");
        long id = sc.nextLong();

        System.out.print("Digite a idade do animal: ");
        int idade = sc.nextInt();

        System.out.print("Digite o peso do animal: ");
        double peso = sc.nextDouble();

        Animal animal = null;

        if (tipo == 1) {
            animal = new Cat(id, idade, peso);
            System.out.println("Gato adicionado com sucesso!");
        } else if (tipo == 2) {
            animal = new Dog(id, idade, peso);
            System.out.println("Cachorro adicionado com sucesso!");
        } else if (tipo == 3) {
            animal = new Bird(id, idade, peso);
            System.out.println("Pássaro adicionado com sucesso!");
        } else {
            System.out.println("Tipo de animal inválido!");
            return;
        }

        zoo.addAnimal(animal);
    }

    public static void listarAnimais(Zoo zoo) {
        System.out.println("\n=== LISTA DE ANIMAIS ===");
        ArrayList<Animal> animais = zoo.listAnimals();

        if (animais.isEmpty()) {
            System.out.println("Nenhum animal encontrado no zoológico.");
        } else {
            System.out.println("Animais no zoológico:");
            for (Animal animal : animais) {
                System.out.println("ID: " + animal.id +
                    " | Nome: " + animal.name +
                    " | Idade: " + animal.age +
                    " | Peso: " + animal.weight + "kg" +
                    " | Tipo: " + animal.getClass().getSimpleName());
            }
        }
    }

    public static void removerAnimal(Zoo zoo) {
        System.out.println("\n=== REMOVER ANIMAL ===");
        System.out.print("Digite o ID do animal que deseja remover: ");
        long id = sc.nextLong();

        boolean removido = zoo.removeAnimal(id);
        System.out.println("Animal Removido: " + removido);
    }

    public static void emitirSomAnimal(Zoo zoo) {
        System.out.println("\n=== EMITIR SOM DO ANIMAL ===");
        System.out.print("Digite o ID do animal: ");
        long id = sc.nextLong();

        Animal animal = encontrarAnimalPorId(zoo, id);
        if (animal != null) {
            System.out.println(animal.sound());
        } else {
            System.out.println("Animal com ID " + id + " não encontrado.");
        }
    }

    public static void testarHabilidadeAnimal(Zoo zoo) {
        System.out.println("\n=== TESTAR HABILIDADE DO ANIMAL ===");
        System.out.print("Digite o ID do animal: ");
        long id = sc.nextLong();

        Animal animal = encontrarAnimalPorId(zoo, id);
        if (animal != null) {
            input.nextLine(); 
            System.out.print("Digite a habilidade para testar: ");
            String habilidade = input.nextLine();
            System.out.println(animal.performAbility(habilidade));
        } else {
            System.out.println("Animal com ID " + id + " não encontrado.");
        }
    }

    public static Animal encontrarAnimalPorId(Zoo zoo, long id) {
        ArrayList<Animal> animais = zoo.listAnimals();
        for (Animal animal : animais) {
            if (animal.id == id) {
                return animal;
            }
        }
        return null;
    }
    
}
