package br.unama.praca;

public class Pessoa {
    private String nome;
    private String cpf;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        
        return this.cpf;
    }

    void correr() {
        System.out.println("Correndo! >:)");
    }

    void pular() {
        System.out.println("Pulando! >;D");
    }
}