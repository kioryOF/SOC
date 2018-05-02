
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import modelo.Conjunto;
import modelo.Elemento;

public class TesteLeitura {

    public static ArrayList<Conjunto> conjuntosGlobal = new ArrayList<>();
    public static ArrayList<Elemento> elementosGlobal = new ArrayList<>();

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        try {
            FileReader arq = new FileReader("C:\\Users\\Vitor\\Desktop\\oi.txt");
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();
            System.out.println(linha);

            while (linha != null) {
                verificaComando(linha);
                System.out.printf("%s\n", linha);

                linha = lerArq.readLine();

            }

            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }

        System.out.println("----------------------------");
        for (int i = 0; i < conjuntosGlobal.size(); i++) {
            System.out.println(conjuntosGlobal.get(i).getNome());
            for (int j = 0; j < conjuntosGlobal.get(i).getElementos().size(); j++) {
                System.out.println(conjuntosGlobal.get(i).getElementos().get(j).getNome());
            }

            System.out.println("***********");

        }
    }

    private static void verificaComando(String linha) {
        String[] t = separarLinha(linha);
        int contConjuntos = 0;
        for (int i = 0; i < t.length; i++) {
            if (Character.isUpperCase(t[i].charAt(0)) && Character.isLetter(t[i].charAt(0))) {
                contConjuntos++;
                System.out.println(t[i]);
                ArrayList<Elemento> elementos = adicionaElementos(linha, contConjuntos);
                Conjunto conjunto = new Conjunto(t[i], elementos);
                verificaConjunto(conjunto);

            }
            if (Character.isLowerCase(t[i].charAt(0))
                    && Character.isLetter(t[i].charAt(0))
                    && t[i + 1].equals("=")
                    && Character.isDigit(t[i + 2].charAt(0))) {
                Elemento elemento = new Elemento(t[i],Integer.parseInt(t[i + 2]));
                adicionaElementoGlobal(elemento);
            }
        }

    }

    private static ArrayList<Elemento> adicionaElementos(String linha, int contConjuntos) {
        ArrayList<Elemento> elementos = new ArrayList<>();
        String[] tudo = linha.split(Pattern.quote(""));
        int contAberturaChaves = 0;
        for (int i = 0; i < tudo.length; i++) {
            if (tudo[i].equals("{")) {
                contAberturaChaves++;
            }
            if (contAberturaChaves == contConjuntos) {
                for (int j = i; j < tudo.length; j++) {
                    if (Character.isLetter(tudo[j].charAt(0))
                            && Character.isLowerCase(tudo[j].charAt(0))
                            && tudo[j + 1].equals("=")
                            && Character.isDigit(tudo[j + 2].charAt(0))) {
                        Elemento elemento = new Elemento(tudo[j], Integer.parseInt(tudo[j + 2]));
                        i++;
                        if (verificaAdicionaElemento(elemento, elementos)) {
                            elementos.add(elemento);
                        }
                    }
                    if (Character.isDigit(tudo[j].charAt(0))) {
                        Elemento elemento = new Elemento(tudo[j], Integer.parseInt(tudo[j]));
                        if (verificaAdicionaElemento(elemento, elementos)) {
                            elementos.add(elemento);
                        }
                    }
                    if (tudo[j].equalsIgnoreCase("}")) {
                        break;
                    }
                }
            }
        }
        return elementos;
    }

    private static void verificaConjunto(Conjunto conjunto) {
        if (conjuntosGlobal.size() > 0) {
            for (int i = 0; i < conjuntosGlobal.size(); i++) {
                if (!conjuntosGlobal.get(i).getNome().equals(conjunto.getNome())) {
                    conjuntosGlobal.add(conjunto);
                }
            }
        } else {
            conjuntosGlobal.add(conjunto);
        }
    }

    private static void adicionaElementoGlobal(Elemento elemento) {
        if (elementosGlobal.size() > 0) {
            for (int i = 0; i < elementosGlobal.size(); i++) {
                if (!elementosGlobal.get(i).getNome().equals(elemento.getNome())) {
                    elementosGlobal.add(elemento);
                }
            }
        } else {
            elementosGlobal.add(elemento);
        }
    }

    private static boolean verificaAdicionaElemento(Elemento elemento, ArrayList<Elemento> elementos) {
        if (elementos.size() > 0) {
            for (int i = 0; i < elementos.size(); i++) {
                if (elementos.get(i).getNome().equals(elemento.getNome())) {
                    return false;
                }
            }

        } else {
            return true;
        }
        return true;
    }

    private static String[] separarLinha(String linha) {
        String[] a = linha.split(Pattern.quote(" "));
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            }
        
        return a;
    }

}
