package modelo;

import java.util.ArrayList;

public class Conjunto {
    
    private String nome;
    private ArrayList<Elemento> elementos = new ArrayList<>();
    
    public Conjunto(String nome) {
        this.nome = nome;
    }
    
    public Conjunto(String nome, ArrayList<Elemento> elementos) {
        this.nome = nome;
        this.elementos = elementos;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public ArrayList<Elemento> getElementos() {
        return (ArrayList<Elemento>) elementos.clone();
    }
      
    public void setElementos(ArrayList<Elemento> elementos) {
        this.elementos = elementos;
    }
    
    public void addElemento(Elemento elemento) {
        this.elementos.add(elemento);
    }
    
    public void removeElemento(Elemento elemento) {
        this.elementos.remove(elemento);
    }
}
