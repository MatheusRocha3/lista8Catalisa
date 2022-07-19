package Restaurante;

import java.util.ArrayList;
import java.util.List;
public class Prato {
    private String nome;
    private List<String> ingredientes = new ArrayList<>();

    public Prato(String nome, List<String> ingredientes) {
        this.setNome(nome);
        this.setIngredientes(ingredientes);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
}