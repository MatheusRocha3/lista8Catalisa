package listaProdutos;

import java.util.*;


public class Produtos {
    private String nomeDoProduto;
    private double preçoDoProduto;
    Scanner input = new Scanner(System.in);

    ArrayList<Produtos> listaDeProdutos = new ArrayList<>();

    public Produtos(String nomeDoProduto, double preçoDoProduto) {
        this.nomeDoProduto = (nomeDoProduto);
        this.preçoDoProduto = (preçoDoProduto);
    }

    public Produtos() {

    }




    public void adicionarProduto() {
        System.out.println("Qual o nome do produto?");
        String nome = input.next();

        System.out.println("Qual o preço do produto?");
        double preço = input.nextDouble();

        System.out.println("Novo produto adicionado");

        Produtos produto1 = new Produtos(nome, preço);
        listaDeProdutos.add(produto1);
    }

    public void exibir() {

        for (int i = 0; i < listaDeProdutos.size(); i++) {
            System.out.println("Nome do produto: " + listaDeProdutos.get(i).getNomeDoProduto() + " Preço do produto: " + listaDeProdutos.get(i).getpreçoDoPruduto());

        }

    }

    public void excluir() {

        System.out.println("Qual a matrícula você quer excluir? ");
        exibir();
        String excluirProduto = input.next();
        for (int i = 0; i < listaDeProdutos.size(); i++) {
            if (listaDeProdutos.get(i).getNomeDoProduto().equals(excluirProduto))
                listaDeProdutos.remove(i);
            System.out.println("Produto removido.");
        }
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public double getpreçoDoPruduto() {
        return preçoDoProduto;
    }

    public void setPreçoDoProduto(double preçoDoProduto) {
        this.preçoDoProduto = preçoDoProduto;
    }
}

