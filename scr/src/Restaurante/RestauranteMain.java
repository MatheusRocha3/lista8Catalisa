package Restaurante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestauranteMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Restaurante restaurante = new Restaurante();
        boolean r = true;
        while (r) {
            System.out.println("O que quer fazer hoje? Segue as opções: ");
            System.out.println("Digite 1 - adicionar prato");
            System.out.println("Digite 2 - exibir pratos");
            System.out.println("Digite 3 - excluir pratod");
            System.out.println("Digite 4 - sair");
            int escolhaUsuario = input.nextInt();
            switch (escolhaUsuario) {
                case 1:
                    System.out.println("Qual a quantidade de pratos você deseja adicionar: ");
                    int qtd = input.nextInt();
                    for (int i = 1; i <= qtd; i++) {
                        System.out.println(i + "º Nome do prato: ");
                        String nome = input.next();
                        System.out.println("qual é a quantidade de ingredientes para o prato " + nome);
                        int quantidadeIngredientes = input.nextInt();
                        List<String> listaIngredientes = new ArrayList<>();
                        for (int j = 1; j <= quantidadeIngredientes; j++) {
                            System.out.println(j + "º ingrediente");
                            listaIngredientes.add(input.next());
                        }
                        restaurante.adicionar(nome, listaIngredientes);
                        break;
                    }
                case 2:
                    restaurante.listar();
                    break;

                case 3:
                    System.out.println("Digite corretamente o nome do prato para excluir");
                    String nome = input.next();
                    restaurante.excluir(nome);
                    break;
                case 4:
                    System.out.println("Fim do programa");
                    r = false;
                default:
                    System.out.println("Escolha inválida");
            }
        }
    }
}


