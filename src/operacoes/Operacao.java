package operacoes;

import modelo.Conjunto;
import modelo.Elemento;

public class Operacao {

    public static boolean pertence(Conjunto conjunto, Elemento elemento) {

        for (int i = 0; i < conjunto.getElementos().size(); i++) {

            if (conjunto.getElementos().get(i).getNome().equals(elemento.getNome())) {
                return true;
            }
        }

        return false;
    }

    public static boolean naoPertence(Conjunto conjunto, Elemento elemento) {
        if (pertence(conjunto, elemento)) {
            return false;
        }
        return true;
    }

    public static boolean contidoOuIgual(Conjunto conjunto1, Conjunto conjunto2) {
        int elementosIguais = 0;
        for (int i = 0; i < conjunto1.getElementos().size(); i++) {
            if (pertence(conjunto2, conjunto1.getElementos().get(i))) {
                elementosIguais++;
            }
        }
        if (conjunto1.getElementos().size() == elementosIguais) {
            return true;
        }
        return false;
    }

    public static boolean naoContidoOuIgual(Conjunto conjunto1, Conjunto conjunto2) {
        if (contidoOuIgual(conjunto1, conjunto2)) {
            return false;
        }
        return true;
    }

    public static boolean contidoPropriamente(Conjunto conjunto1, Conjunto conjunto2) {
        int elementosIguais = 0;
        for (int i = 0; i < conjunto1.getElementos().size(); i++) {
            if (pertence(conjunto2, conjunto1.getElementos().get(i))) {
                elementosIguais++;
            }
        }
        if (conjunto1.getElementos().size() == elementosIguais && conjunto1.getElementos().size() < conjunto2.getElementos().size()) {
            return true;
        }
        return false;
    }

    public static boolean naoContidoPropriamente(Conjunto conjunto1, Conjunto conjunto2) {
        if (contidoPropriamente(conjunto1, conjunto2)) {
            return false;
        }
        return true;
    }

    public static Conjunto uniao(Conjunto conjunto1, Conjunto conjunto2) {
        Conjunto conjuntoUniao = new Conjunto(conjunto1.getNome() + "∪" + conjunto2.getNome());
        conjuntoUniao.setElementos(conjunto1.getElementos());
        for (int i = 0; i < conjunto2.getElementos().size(); i++) {
            if (naoPertence(conjunto1, conjunto2.getElementos().get(i))) {
                conjuntoUniao.addElemento(conjunto2.getElementos().get(i));
            }
        }
        return conjuntoUniao;
    }

    public static Conjunto intersecao(Conjunto conjunto1, Conjunto conjunto2) {
        Conjunto conjuntoIntersecao = new Conjunto(conjunto1.getNome() + "∩" + conjunto2.getNome());
        for (int i = 0; i < conjunto2.getElementos().size(); i++) {
            if (pertence(conjunto1, conjunto2.getElementos().get(i))) {
                conjuntoIntersecao.addElemento(conjunto2.getElementos().get(i));
            }
        }
        return conjuntoIntersecao;
    }

    public static Conjunto produtoCartesiano(Conjunto conjunto1, Conjunto conjunto2) {
//produto cartesiano não é a mesma coisa que conjunto, contudo é utilizado aqui assim para simplificar o codigo
        Conjunto produtoCartesiano = new Conjunto("produtoCartesiano");
        for (int i = 0; i < conjunto1.getElementos().size(); i++) {
            for (int j = 0; j < conjunto2.getElementos().size(); j++) {
                Elemento elemento = new Elemento("<" + conjunto1.getElementos().get(i).getNome() + "," + conjunto2.getElementos().get(j).getNome() + ">");
                produtoCartesiano.addElemento(elemento);
            }
        }
        return produtoCartesiano;
    }
}
