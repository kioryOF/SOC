
package modelo;

public class ParRelacao {
   Elemento elmentoDominio; //esquerda
   Elemento elmentoContraDominio; //direita

    public ParRelacao(Elemento elmentoDominio, Elemento elmentoContraDominio) {
        this.elmentoDominio = elmentoDominio;
        this.elmentoContraDominio = elmentoContraDominio;
    }

    public Elemento getElmentoDominio() {
        return elmentoDominio;
    }

    public void setElmentoDominio(Elemento elmentoDominio) {
        this.elmentoDominio = elmentoDominio;
    }

    public Elemento getElmentoContraDominio() {
        return elmentoContraDominio;
    }

    public void setElmentoContraDominio(Elemento elmentoContraDominio) {
        this.elmentoContraDominio = elmentoContraDominio;
    }
   
}
