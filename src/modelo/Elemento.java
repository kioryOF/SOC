package modelo;

public class Elemento {

    private String nome;
    private int valor;

    public Elemento(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public Elemento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}
