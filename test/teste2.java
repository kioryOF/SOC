
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import modelo.Conjunto;
import modelo.Elemento;

public class teste2 {
    
    public static ArrayList<Conjunto> conjuntosGlobal = new ArrayList<>();
    public static ArrayList<Elemento> elementosGlobal = new ArrayList<>();
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        String textoArquivo = "";
        try {
            FileReader arq = new FileReader("C:\\Users\\Vitor\\Desktop\\oi.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            
            String linha = lerArq.readLine();
           
            
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
        System.out.println(elementosGlobal.get(0).getNome());
    }
    
    private static void verificaComando(String linha) {
        if (Character.isLetter(linha.charAt(0))) {
            if (linha.charAt(2) == '=') {
                if (Character.isUpperCase(linha.charAt(0))) {
                    String nomeConjunto = "" + linha.charAt(0);
                    Conjunto conjunto = new Conjunto(nomeConjunto, criaElementos(linha));
                    adicionaConjunto(conjunto);
                }
                if (Character.isLowerCase(linha.charAt(0))) {
                    Elemento elemento = new Elemento("" + linha.charAt(0));
                    adicionaElemento(elemento);
                }
            } else {
                System.out.println("Erro na notação falta '=' ");
            }
        } else {
            System.out.println("Erro ao ler a linha pois não é um conjunto ou um elemento,Maiuscula para conjunto e minuscula para elemento ");
        }
    }
    
    private static ArrayList<Elemento> criaElementos(String linha) {
        ArrayList<Elemento> elementos = new ArrayList<>();
        String particao1 = linha.substring(linha.indexOf("{") + 1, linha.indexOf("}"));
        String particao2[] = particao1.split(Pattern.quote(", "));
        for (int i = 0; i < particao2.length; i++) {
            Elemento elemento = new Elemento(particao2[i], Integer.parseInt(particao2[i]));
            if (elementos.size() > 0) {
                int a = 0;
                for (int j = 0; j < elementos.size(); j++) {
                    if (elementos.get(j).getNome().equals(elemento.getNome())) {
                        a++;
                        break;
                    }
                }
                if (a == 0) {
                    elementos.add(elemento);
                }
            } else {
                elementos.add(elemento);
            }
        }
        return elementos;
    }
    
    private static void adicionaConjunto(Conjunto conjunto) {
        if (conjuntosGlobal.isEmpty()) {
            conjuntosGlobal.add(conjunto);
        } else {
            int a = 0;
            for (int i = 0; i < conjuntosGlobal.size(); i++) {
                if (conjuntosGlobal.get(i).getNome().equals(conjunto.getNome())) {
                    a++;
                }
            }
            if (a == 0) {
                conjuntosGlobal.add(conjunto);
            }
        }
    }
    
    private static void adicionaElemento(Elemento elemento) {
        if (elementosGlobal.isEmpty()) {
            elementosGlobal.add(elemento);
        } else {
            int a = 0;
            for (int i = 0; i < elementosGlobal.size(); i++) {
                if (elementosGlobal.get(i).getNome().equals(elemento.getNome())) {
                    a++;
                }
            }
            if (a == 0) {
                elementosGlobal.add(elemento);
            }
        }
    }
    
}
