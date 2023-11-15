package product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n[1] Adicionar Produto");
            System.out.println("[2] Listar Produtos");
            System.out.println("[3] Atualizar Produto");
            System.out.println("[4] Remover Produto");
            System.out.println("[0] Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> addProduct(scanner);
                case 2 -> ProductService.ProductsList();
                case 3 -> putProduct(scanner);
                case 4 -> deleteProduct(scanner);
                case 0 -> System.out.println("Saindo do programa. Até logo!");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 0);

        scanner.close();
    }


    private static void addProduct(Scanner scanner) {
        System.out.print("Digite o nome do produto: ");
        String name = scanner.nextLine();
        System.out.print("Digite o preço do produto: ");
        double price = scanner.nextDouble();

        Product product = Product.createProduct(name, price);
        ProductService.addProduct(product);
    }

    private static void putProduct(Scanner scanner) {
        System.out.print("Digite o ID do produto que deseja atualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o novo nome do produto: ");
        String newName = scanner.nextLine();
        System.out.print("Digite o novo preço do produto: ");
        double newPrice = scanner.nextDouble();

        ProductService.putProduct(id, newName, newPrice);
    }

    private static void deleteProduct(Scanner scanner) {
        System.out.print("Digite o ID do produto que deseja remover: ");
        int id = scanner.nextInt();

        ProductService.deleteProduct(id);
    }
}
