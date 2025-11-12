package br.univille;

public class Cliente {
    //variável - atributo
    private String nome;

    //construtor - mesmo nome da classe e não tem retorno
    // iniciallizar atributos
    // obrigar a passagem de valores
    public Cliente(String nome) {
        this.nome = nome;
    }
    //polimorfismo - várias formas de existir a mesma coisa (métodos e construtores)
    public Cliente() {
        
    }

    @Override
    //toda vez que pega um objeto que não é texto (String) e tenta transformar em texto automaticamente,
    //o Java chama esse método toString()
    public String toString() {
        return getNome();
    }
    //método
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //encapsulamento = esconder os atributos (variáveis) da classe, ou seja,
    //implementação dentro do objeto

}
