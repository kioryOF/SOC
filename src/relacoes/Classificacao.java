package relacoes;

import java.util.ArrayList;
import modelo.Conjunto;
import modelo.Elemento;
import modelo.ParRelacao;
import operacoes.Operacao;

public class Classificacao {

    public static boolean isFuncional(Conjunto dominio, ArrayList<ParRelacao> relacao) {
        for (int j = 0; j < dominio.getElementos().size(); j++) {
            int contRelacao = 0;
            for (int i = 0; i < relacao.size(); i++) {
                if (relacao.get(i).getElmentoDominio().getNome().equals(dominio.getElementos().get(j).getNome())) {
                    contRelacao++;
                }
            }
            if (contRelacao > 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isInjetora(Conjunto contraDominio, ArrayList<ParRelacao> relacao) {
        for (int j = 0; j < contraDominio.getElementos().size(); j++) {
            int contRelacao = 0;
            for (int i = 0; i < relacao.size(); i++) {
                if (relacao.get(i).getElmentoContraDominio().getNome().equals(contraDominio.getElementos().get(j).getNome())) {
                    contRelacao++;
                }
            }
            if (contRelacao > 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isTotal(Conjunto dominio, ArrayList<ParRelacao> relacao) {
        Conjunto cnjtDominioDefinicao = getCnjtDominioDefinicao(relacao);
        if (Operacao.igual(dominio, cnjtDominioDefinicao)) {
            return true;
        }
        return false;
    }

    public static boolean isSobrejetora(Conjunto contraDominio, ArrayList<ParRelacao> relacao) {
        Conjunto cnjtImagem = getCnjtImagem(relacao);
        if (Operacao.igual(contraDominio, cnjtImagem)) {
            return true;
        }
        return false;
    }

    public static boolean isMonomorfismo(Conjunto dominio, Conjunto contraDominio, ArrayList<ParRelacao> relacao) {
        if (isTotal(dominio, relacao) && isInjetora(contraDominio, relacao)) {
            return true;
        }
        return false;
    }

    public static boolean isEpimorfismo(Conjunto dominio, Conjunto contraDominio, ArrayList<ParRelacao> relacao) {
        if (isFuncional(dominio, relacao) && isSobrejetora(contraDominio, relacao)) {
            return true;
        }
        return false;
    }

    public static boolean isIsomorfismo(Conjunto dominio, Conjunto contraDominio, ArrayList<ParRelacao> relacao) {
        if (isEpimorfismo(dominio, contraDominio, relacao) && isMonomorfismo(dominio, contraDominio, relacao)) {
            return true;
        }
        return false;
    }

   public static Conjunto getCnjtImagem(ArrayList<ParRelacao> relacao) {
        Conjunto cnjtImagem = new Conjunto("imagem");
        for (int i = 0; i < relacao.size(); i++) {
            if (!Operacao.pertence(cnjtImagem, relacao.get(i).getElmentoContraDominio())) {
                cnjtImagem.addElemento(relacao.get(i).getElmentoContraDominio());
            }
        }

        return cnjtImagem;
    }

    public static Conjunto getCnjtDominioDefinicao(ArrayList<ParRelacao> relacao) {
        Conjunto cnjtDominioDefinicao = new Conjunto("definicao");
        for (int i = 0; i < relacao.size(); i++) {
            if (!Operacao.pertence(cnjtDominioDefinicao, relacao.get(i).getElmentoDominio())) {
                cnjtDominioDefinicao.addElemento(relacao.get(i).getElmentoDominio());
            }
        }

        return cnjtDominioDefinicao;
    }
}
