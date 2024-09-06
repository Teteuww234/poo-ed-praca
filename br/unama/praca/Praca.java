package br.unama.praca;

public class Praca {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome ("María Falcantino Letícia");
        p1.setCpf("089.567.455-70");

        System.out.println("Nome: " + p1.getNome());
        System.out.println("CPF: " + p1.getCpf());

        p1.correr();
        p1.pular();
    }
}