package relacoes;

import java.util.ArrayList;
import modelo.Conjunto;
import modelo.Elemento;
import modelo.ParRelacao;

public class Relacao {

    public static ArrayList<ParRelacao> menorQue(Conjunto conjuntoDominio, Conjunto conjuntoContraDominio) {
        ArrayList<ParRelacao> pares = new ArrayList<>();
        for (int i = 0; i < conjuntoDominio.getElementos().size(); i++) {
            for (int j = 0; j < conjuntoContraDominio.getElementos().size(); j++) {
                if (conjuntoDominio.getElementos().get(i).getValor() < conjuntoContraDominio.getElementos().get(j).getValor()) {
                    ParRelacao par = new ParRelacao(conjuntoDominio.getElementos().get(i), conjuntoContraDominio.getElementos().get(j));

                    pares.add(par);
                }
            }

        }
        return pares;
    }

    public static ArrayList<ParRelacao> maiorQue(Conjunto conjuntoDominio, Conjunto conjuntoContraDominio) {
        ArrayList<ParRelacao> pares = new ArrayList<>();
        for (int i = 0; i < conjuntoDominio.getElementos().size(); i++) {
            for (int j = 0; j < conjuntoContraDominio.getElementos().size(); j++) {
                if (conjuntoDominio.getElementos().get(i).getValor() > conjuntoContraDominio.getElementos().get(j).getValor()) {
                    ParRelacao par = new ParRelacao(conjuntoDominio.getElementos().get(i), conjuntoContraDominio.getElementos().get(j));

                    pares.add(par);
                }
            }

        }
        return pares;
    }

    public static ArrayList<ParRelacao> igualA(Conjunto conjuntoDominio, Conjunto conjuntoContraDominio) {
        ArrayList<ParRelacao> pares = new ArrayList<>();
        for (int i = 0; i < conjuntoDominio.getElementos().size(); i++) {
            for (int j = 0; j < conjuntoContraDominio.getElementos().size(); j++) {
                if (conjuntoDominio.getElementos().get(i).getValor() == conjuntoContraDominio.getElementos().get(j).getValor()) {
                    ParRelacao par = new ParRelacao(conjuntoDominio.getElementos().get(i), conjuntoContraDominio.getElementos().get(j));

                    pares.add(par);
                }
            }

        }
        return pares;
    }

    public static ArrayList<ParRelacao> quadradoDe(Conjunto conjuntoDominio, Conjunto conjuntoContraDominio) {
        ArrayList<ParRelacao> pares = new ArrayList<>();
        for (int i = 0; i < conjuntoDominio.getElementos().size(); i++) {
            for (int j = 0; j < conjuntoContraDominio.getElementos().size(); j++) {
                if (conjuntoDominio.getElementos().get(i).getValor() * conjuntoDominio.getElementos().get(i).getValor() == conjuntoContraDominio.getElementos().get(j).getValor()) {
                    ParRelacao par = new ParRelacao(conjuntoDominio.getElementos().get(i), conjuntoContraDominio.getElementos().get(j));

                    pares.add(par);
                }
            }

        }
        return pares;
    }

    public static ArrayList<ParRelacao> raizQuadradaDe(Conjunto conjuntoDominio, Conjunto conjuntoContraDominio) {
        ArrayList<ParRelacao> pares = quadradoDe(conjuntoContraDominio, conjuntoDominio);
        for (int i = 0; i < pares.size(); i++) {
            Elemento contraDominioAux = pares.get(i).getElementoDominio();
            Elemento dominioAux = pares.get(i).getElementoContraDominio();
            pares.get(i).setElementoDominio(dominioAux);
            pares.get(i).setElementoContraDominio(contraDominioAux);

        }
        return pares;
    }

    public static ArrayList<ParRelacao> relacaoComposta(ArrayList<ParRelacao> AB, ArrayList<ParRelacao> BC) {
        ArrayList<ParRelacao> composta = new ArrayList<>();
        for (int i = 0; i < AB.size(); i++) {
            for (int j = 0; j < BC.size(); j++) {
                if (AB.get(i).getElementoContraDominio().getNome().equals(BC.get(j).getElementoDominio().getNome())) {
                    if (composta.isEmpty()) {
                        ParRelacao par = new ParRelacao(AB.get(i).getElementoDominio(), BC.get(j).getElementoContraDominio());
                        composta.add(par);
                    } else {
                        int cont = 0;
                        for (int k = 0; k < composta.size(); k++) {
                            if (!composta.get(k).getElementoDominio().getNome().equals(AB.get(i).getElementoDominio().getNome())
                                    || !composta.get(k).getElementoContraDominio().getNome().equals(BC.get(j).getElementoContraDominio().getNome())) {
                                cont++;
                            }
                        }
                        if (cont == composta.size()) {
                            ParRelacao par = new ParRelacao(AB.get(i).getElementoDominio(), BC.get(j).getElementoContraDominio());
                            composta.add(par);
                        }
                    }

                }
            }
        }
        return composta;
    }

}
