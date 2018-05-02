
package modelo;

public class ParRelacao {
   Elemento elmentoDominio; //esquerda
   Elemento elmentoContraDominio; //direita

    public ParRelacao(Elemento elmentoDominio, Elemento elmentoContraDominio) {
        this.elmentoDominio = elmentoDominio;
        this.elmentoContraDominio = elmentoContraDominio;
    }

    public Elemento getElementoDominio() {
        return elmentoDominio;
    }

    public void setElementoDominio(Elemento elmentoDominio) {
        this.elmentoDominio = elmentoDominio;
    }

    public Elemento getElementoContraDominio() {
        return elmentoContraDominio;
    }

    public void setElementoContraDominio(Elemento elmentoContraDominio) {
        this.elmentoContraDominio = elmentoContraDominio;
    }
   
}
