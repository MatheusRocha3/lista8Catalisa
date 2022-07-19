package Restaurante;
import java.util.ArrayList;
import java.util.List;
public class Restaurante {

    private List<Prato> listaDePratos = new ArrayList<>();

    public void adicionar(String nome, List<String> ingredientes) {
        this.listaDePratos.add(new Prato(nome, ingredientes));
    }

    public void excluir(String nome) {
        this.listaDePratos.removeIf(prato -> nome.equalsIgnoreCase(prato.getNome()));
    }

    public void listar() {
        this.listaDePratos.forEach(prato -> {
            System.out.println("Nome do prato: " + prato.getNome() + "\nIngredientes " + prato.getIngredientes().toString());
        });
    }
}