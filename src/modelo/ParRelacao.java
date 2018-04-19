
package modelo;

public class ParRelacao {
   Elemento elmentoDominio; //esquerda
   Elemento elmentoImagem; //direita

    public ParRelacao(Elemento elmentoDominio, Elemento elmentoImagem) {
        this.elmentoDominio = elmentoDominio;
        this.elmentoImagem = elmentoImagem;
    }

    public Elemento getElmentoDominio() {
        return elmentoDominio;
    }

    public void setElmentoDominio(Elemento elmentoDominio) {
        this.elmentoDominio = elmentoDominio;
    }

    public Elemento getElmentoImagem() {
        return elmentoImagem;
    }

    public void setElmentoImagem(Elemento elmentoImagem) {
        this.elmentoImagem = elmentoImagem;
    }
   
}
