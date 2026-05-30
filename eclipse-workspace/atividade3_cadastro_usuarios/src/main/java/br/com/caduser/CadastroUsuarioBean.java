package br.com.caduser;

import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class CadastroUsuarioBean {

    private String nome;
    private static List<String> nomes = new ArrayList<>();

    public void cadastrar() {
        if (nome != null && !nome.trim().isEmpty()) {
            nomes.add(nome);
            nome = "";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getNomes() {
        return nomes;
    }
}