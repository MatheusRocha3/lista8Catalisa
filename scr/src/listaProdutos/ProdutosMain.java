package listaProdutos;

import java.util.Scanner;

public class ProdutosMain {
    public static void main(String[] args) {

        boolean produto = true;
        Scanner scan = new Scanner(System.in);
        Produtos produtos = new Produtos();
        while(produto == true){
            System.out.println("O que quer fazer hoje? Segue as opções: ");
            System.out.println("Digite 1 - adicionar produto");
            System.out.println("Digite 2 - exibir produtos");
            System.out.println("Digite 3 - excluir produtos");
            System.out.println("Digite 4 - sair");

            int escolhaDoUser = scan.nextInt();

            switch (escolhaDoUser){

                case 1:
                    produtos.adicionarProduto();
                    break;

                case 2:
                    produtos.exibir();
                    break;

                case 3:
                    produtos.excluir();
                    break;

                case 4:
                    System.out.println("Fim do programa");
                    produto = false;
                    break;

                default:
                    System.out.println("Escolha inválida");
            }

        }

    }
}