package br.univille;

public class Main {
    public static void main(String[] args) {
        
        Cliente zezinho = new Cliente("Zezinho");
        zezinho.setNome("Zezinho da Silva");
        Cliente mariazinha = new Cliente("Mariazinha");
        mariazinha.setNome("Mariazinha de Souza");


        System.out.println(zezinho);
        System.out.println(mariazinha);
    }
}