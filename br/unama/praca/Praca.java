package br.unama.praca;

public class Praca {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome ("Suzane Vitória O. Rodrigues");
        p1.setCpf("001.624.112-60");

        System.out.println("Nome: " + p1.getNome());
        System.out.println("CPF: " + p1.getCpf());

        p1.correr();
        p1.pular();
    }
}