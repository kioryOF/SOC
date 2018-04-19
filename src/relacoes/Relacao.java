package relacoes;

import java.util.ArrayList;
import static jdk.nashorn.internal.objects.NativeMath.sqrt;
import modelo.Conjunto;
import modelo.Elemento;
import modelo.ParRelacao;

public class Relacao {

    public static ArrayList<ParRelacao> menorQue(Conjunto conjuntoDominio, Conjunto conjuntoImagem) {
        ArrayList<ParRelacao> pares = new ArrayList<>();
        for (int i = 0; i < conjuntoDominio.getElementos().size(); i++) {
            for (int j = 0; j < conjuntoImagem.getElementos().size(); j++) {
                if (conjuntoDominio.getElementos().get(i).getValor() < conjuntoImagem.getElementos().get(j).getValor()) {
                    ParRelacao par = new ParRelacao(conjuntoDominio.getElementos().get(i), conjuntoImagem.getElementos().get(j));

                    pares.add(par);
                }
            }

        }
        return pares;
    }

    public static ArrayList<ParRelacao> maiorQue(Conjunto conjuntoDominio, Conjunto conjuntoImagem) {
        ArrayList<ParRelacao> pares = new ArrayList<>();
        for (int i = 0; i < conjuntoDominio.getElementos().size(); i++) {
            for (int j = 0; j < conjuntoImagem.getElementos().size(); j++) {
                if (conjuntoDominio.getElementos().get(i).getValor() > conjuntoImagem.getElementos().get(j).getValor()) {
                    ParRelacao par = new ParRelacao(conjuntoDominio.getElementos().get(i), conjuntoImagem.getElementos().get(j));

                    pares.add(par);
                }
            }

        }
        return pares;
    }

    public static ArrayList<ParRelacao> igualA(Conjunto conjuntoDominio, Conjunto conjuntoImagem) {
        ArrayList<ParRelacao> pares = new ArrayList<>();
        for (int i = 0; i < conjuntoDominio.getElementos().size(); i++) {
            for (int j = 0; j < conjuntoImagem.getElementos().size(); j++) {
                if (conjuntoDominio.getElementos().get(i).getValor() == conjuntoImagem.getElementos().get(j).getValor()) {
                    ParRelacao par = new ParRelacao(conjuntoDominio.getElementos().get(i), conjuntoImagem.getElementos().get(j));

                    pares.add(par);
                }
            }

        }
        return pares;
    }

    public static ArrayList<ParRelacao> quadradoDe(Conjunto conjuntoDominio, Conjunto conjuntoImagem) {
        ArrayList<ParRelacao> pares = new ArrayList<>();
        for (int i = 0; i < conjuntoDominio.getElementos().size(); i++) {
            for (int j = 0; j < conjuntoImagem.getElementos().size(); j++) {
                if (conjuntoDominio.getElementos().get(i).getValor() * conjuntoDominio.getElementos().get(i).getValor() == conjuntoImagem.getElementos().get(j).getValor()) {
                    ParRelacao par = new ParRelacao(conjuntoDominio.getElementos().get(i), conjuntoImagem.getElementos().get(j));

                    pares.add(par);
                }
            }

        }
        return pares;
    }

    public static ArrayList<ParRelacao> raizQuadradaDe(Conjunto conjuntoDominio, Conjunto conjuntoImagem) {
        ArrayList<ParRelacao> pares = quadradoDe(conjuntoImagem, conjuntoDominio);
        for (int i = 0; i < pares.size(); i++) {
            Elemento imagemAux = pares.get(i).getElmentoDominio();
            Elemento dominioAux = pares.get(i).getElmentoImagem();
            pares.get(i).setElmentoDominio(imagemAux);
            pares.get(i).setElmentoImagem(dominioAux);
            System.out.println("");

        }
        return pares;
    }

    public static ArrayList<ParRelacao> relacaoUsuario(ArrayList<ParRelacao> pares) {
        return pares;
    }
}
