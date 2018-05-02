/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import leitorArquivo.LeArquivoTxt;
import modelo.Conjunto;
import modelo.Elemento;
import modelo.ParRelacao;
import operacoes.Operacao;
import relacoes.Classificacao;
import relacoes.Relacao;

public class Principal extends javax.swing.JFrame {

    ArrayList<Conjunto> conjuntosGlobal = new ArrayList<>();
    ArrayList<Elemento> elementosGlobal = new ArrayList<>();
    private RelacaoPersonalizada relacaoPersonalizada;
    static ArrayList<ParRelacao> relacaoPersonalizadaAB = new ArrayList<>();
    static ArrayList<ParRelacao> relacaoPersonalizadaBC = new ArrayList<>();

    public Principal() {
        initComponents();
        jPanelOperacoes.setVisible(false);
        jPanelRelacoes.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jPanelOperacoes = new javax.swing.JPanel();
        jButtonContidoPropriamente = new javax.swing.JButton();
        jButtonUniao = new javax.swing.JButton();
        jButtonPertence = new javax.swing.JButton();
        jButtonNaoPertence = new javax.swing.JButton();
        jButtonIntersecao = new javax.swing.JButton();
        jButtonContidoIgual = new javax.swing.JButton();
        jButtonProdutoCartesiano = new javax.swing.JButton();
        jButtonNaoContidoIgual = new javax.swing.JButton();
        jButtonNaoContidoPropriamente = new javax.swing.JButton();
        jComboBoxElemento = new javax.swing.JComboBox<>();
        jComboBoxConjunto1 = new javax.swing.JComboBox<>();
        jComboBoxConjunto2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonOperacoes = new javax.swing.JButton();
        jPanelRelacoes = new javax.swing.JPanel();
        jComboBoxConjuntos1 = new javax.swing.JComboBox<>();
        jComboBoxConjuntos2 = new javax.swing.JComboBox<>();
        jComboBoxConjuntos3 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxRelacoes1 = new javax.swing.JComboBox<>();
        jComboBoxRelacoes2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonRelacaoAB = new javax.swing.JButton();
        jButtonRelacaoAC = new javax.swing.JButton();
        jButtonRelacoes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Carregar Arquivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane1.setViewportView(jTextArea);

        jButtonContidoPropriamente.setText("Contido propriamente");
        jButtonContidoPropriamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContidoPropriamenteActionPerformed(evt);
            }
        });

        jButtonUniao.setText("União");
        jButtonUniao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUniaoActionPerformed(evt);
            }
        });

        jButtonPertence.setText("Pertence");
        jButtonPertence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPertenceActionPerformed(evt);
            }
        });

        jButtonNaoPertence.setText("Não pertence");
        jButtonNaoPertence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNaoPertenceActionPerformed(evt);
            }
        });

        jButtonIntersecao.setText("Interseção");
        jButtonIntersecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIntersecaoActionPerformed(evt);
            }
        });

        jButtonContidoIgual.setText("Contido ou igual");
        jButtonContidoIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContidoIgualActionPerformed(evt);
            }
        });

        jButtonProdutoCartesiano.setText("Produto cartesiano");
        jButtonProdutoCartesiano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProdutoCartesianoActionPerformed(evt);
            }
        });

        jButtonNaoContidoIgual.setText("Não contido ou igual");
        jButtonNaoContidoIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNaoContidoIgualActionPerformed(evt);
            }
        });

        jButtonNaoContidoPropriamente.setText("Não contido propriamente");
        jButtonNaoContidoPropriamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNaoContidoPropriamenteActionPerformed(evt);
            }
        });

        jLabel1.setText("Elemento :");

        jLabel2.setText("Conjuntos 1:");

        jLabel3.setText("Conjuntos 2:");

        javax.swing.GroupLayout jPanelOperacoesLayout = new javax.swing.GroupLayout(jPanelOperacoes);
        jPanelOperacoes.setLayout(jPanelOperacoesLayout);
        jPanelOperacoesLayout.setHorizontalGroup(
            jPanelOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonUniao, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIntersecao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonContidoIgual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNaoContidoIgual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonNaoContidoPropriamente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonContidoPropriamente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonNaoPertence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonPertence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonProdutoCartesiano)
                .addGap(0, 58, Short.MAX_VALUE))
            .addGroup(jPanelOperacoesLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanelOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxElemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxConjunto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(81, 81, 81)
                .addGroup(jPanelOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxConjunto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(149, 149, 149))
        );
        jPanelOperacoesLayout.setVerticalGroup(
            jPanelOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperacoesLayout.createSequentialGroup()
                .addGroup(jPanelOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOperacoesLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanelOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonUniao)
                            .addComponent(jButtonContidoIgual)
                            .addComponent(jButtonContidoPropriamente)
                            .addComponent(jButtonPertence)
                            .addComponent(jButtonProdutoCartesiano))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonNaoContidoIgual)
                            .addComponent(jButtonIntersecao)
                            .addComponent(jButtonNaoContidoPropriamente)
                            .addComponent(jButtonNaoPertence)))
                    .addGroup(jPanelOperacoesLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanelOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxConjunto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxConjunto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxElemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jButtonOperacoes.setText("Operações");
        jButtonOperacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOperacoesActionPerformed(evt);
            }
        });

        jLabel4.setText("Conjunto A:");

        jLabel5.setText("Conjunto B:");

        jLabel6.setText("Conjunto C:");

        jComboBoxRelacoes1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">", "<", "=", "^2", "^(1/2)", "Personalizada" }));
        jComboBoxRelacoes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRelacoes1ActionPerformed(evt);
            }
        });

        jComboBoxRelacoes2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">", "<", "=", "^2", "^(1/2)", "Personalizada" }));
        jComboBoxRelacoes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRelacoes2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Relação A->B:");

        jLabel8.setText("Relação B->C:");

        jButtonRelacaoAB.setText("Fazer Relação A->B");
        jButtonRelacaoAB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRelacaoABActionPerformed(evt);
            }
        });

        jButtonRelacaoAC.setText("Fazer Relação A->C");
        jButtonRelacaoAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRelacaoACActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRelacoesLayout = new javax.swing.GroupLayout(jPanelRelacoes);
        jPanelRelacoes.setLayout(jPanelRelacoesLayout);
        jPanelRelacoesLayout.setHorizontalGroup(
            jPanelRelacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRelacoesLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanelRelacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxConjuntos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(56, 56, 56)
                .addGroup(jPanelRelacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxRelacoes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanelRelacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxConjuntos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanelRelacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxRelacoes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanelRelacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxConjuntos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
            .addGroup(jPanelRelacoesLayout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jButtonRelacaoAB)
                .addGap(42, 42, 42)
                .addComponent(jButtonRelacaoAC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelRelacoesLayout.setVerticalGroup(
            jPanelRelacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRelacoesLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanelRelacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRelacoesLayout.createSequentialGroup()
                        .addGroup(jPanelRelacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(10, 10, 10)
                        .addGroup(jPanelRelacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxConjuntos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxRelacoes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelRelacoesLayout.createSequentialGroup()
                        .addGroup(jPanelRelacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(10, 10, 10)
                        .addGroup(jPanelRelacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxConjuntos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxRelacoes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelRelacoesLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(10, 10, 10)
                        .addComponent(jComboBoxConjuntos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanelRelacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRelacaoAB)
                    .addComponent(jButtonRelacaoAC))
                .addGap(33, 33, 33))
        );

        jButtonRelacoes.setText("Relações");
        jButtonRelacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRelacoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonOperacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonRelacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelOperacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelRelacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(41, 41, 41)
                        .addComponent(jButtonOperacoes)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRelacoes))
                    .addComponent(jPanelOperacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelRelacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooserArquivo = new JFileChooser();
        FileNameExtensionFilter txtfilter = new FileNameExtensionFilter(
                "txt files (*.txt)", "txt");
        chooserArquivo.setFileFilter(txtfilter);
        int escolha = chooserArquivo.showOpenDialog(getParent());
        String caminho = chooserArquivo.getSelectedFile().getAbsolutePath();
        LeArquivoTxt leitor = new LeArquivoTxt();
        this.conjuntosGlobal = leitor.getConjuntos(caminho);
        this.elementosGlobal = leitor.getElementos(caminho);
        String str = " ";
        for (int i = 0; i < conjuntosGlobal.size(); i++) {
            str += this.conjuntosGlobal.get(i).getNome() + " ={ ";
            for (int j = 0; j < this.conjuntosGlobal.get(i).getElementos().size(); j++) {
                str += this.conjuntosGlobal.get(i).getElementos().get(j).getNome();
                if (!(j == this.conjuntosGlobal.get(i).getElementos().size() - 1)) {
                    str += " ,  ";
                }
            }
            str += " }\n ";

        }
        jTextArea.setText(str);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonOperacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOperacoesActionPerformed
        if (conjuntosGlobal.size() > 0) {
            for (int j = 0; j < this.conjuntosGlobal.size(); j++) {
                this.jComboBoxConjunto1.addItem(this.conjuntosGlobal.get(j).getNome());
                this.jComboBoxConjunto2.addItem(this.conjuntosGlobal.get(j).getNome());
            }
            for (int j = 0; j < this.elementosGlobal.size(); j++) {
                this.jComboBoxElemento.addItem(this.elementosGlobal.get(j).getNome());

            }
            jPanelOperacoes.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Carregue um arquivo antes!");
        }
    }//GEN-LAST:event_jButtonOperacoesActionPerformed

    private void jButtonUniaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUniaoActionPerformed
        Conjunto conjunto1 = pegarConjunto(jComboBoxConjunto1.getSelectedItem().toString());
        Conjunto conjunto2 = pegarConjunto(jComboBoxConjunto2.getSelectedItem().toString());
        Conjunto uniao = Operacao.uniao(conjunto1, conjunto2);
        if (adicionaConjuntoGlobal(uniao)) {
            conjuntosGlobal.add(uniao);
            this.jComboBoxConjunto1.addItem(uniao.getNome());
            this.jComboBoxConjunto2.addItem(uniao.getNome());
        }
        String str = "O conjunto " + uniao.getNome() + "  é o conjunto = { ";
        for (int i = 0; i < uniao.getElementos().size(); i++) {
            str += uniao.getElementos().get(i).getNome();
            if (!(i == uniao.getElementos().size() - 1)) {
                str += " ,  ";
            }
        }
        str += " } ";
        jTextArea.setText(str);
    }//GEN-LAST:event_jButtonUniaoActionPerformed

    private void jButtonIntersecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIntersecaoActionPerformed
        Conjunto conjunto1 = pegarConjunto(jComboBoxConjunto1.getSelectedItem().toString());
        Conjunto conjunto2 = pegarConjunto(jComboBoxConjunto2.getSelectedItem().toString());
        Conjunto intersecao = Operacao.intersecao(conjunto1, conjunto2);
        if (adicionaConjuntoGlobal(intersecao)) {
            conjuntosGlobal.add(intersecao);
            this.jComboBoxConjunto1.addItem(intersecao.getNome());
            this.jComboBoxConjunto2.addItem(intersecao.getNome());
        }
        String str = "O conjunto " + intersecao.getNome() + "  é o conjunto = { ";
        for (int i = 0; i < intersecao.getElementos().size(); i++) {
            str += intersecao.getElementos().get(i).getNome();
            if (!(i == intersecao.getElementos().size() - 1)) {
                str += " ,  ";
            }
        }
        str += " } ";
        jTextArea.setText(str);
    }//GEN-LAST:event_jButtonIntersecaoActionPerformed

    private void jButtonContidoIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContidoIgualActionPerformed
        Conjunto conjunto1 = pegarConjunto(jComboBoxConjunto1.getSelectedItem().toString());
        Conjunto conjunto2 = pegarConjunto(jComboBoxConjunto2.getSelectedItem().toString());
        String str;
        if (Operacao.contidoOuIgual(conjunto1, conjunto2)) {
            str = "O conjunto " + conjunto1.getNome() + " está contido ou é igual ao conjunto  " + conjunto2.getNome();
        } else {
            str = "O conjunto  " + conjunto1.getNome() + " NÃO está contido ou é igual ao conjunto  " + conjunto2.getNome();
        }
        jTextArea.setText(str);
    }//GEN-LAST:event_jButtonContidoIgualActionPerformed

    private void jButtonNaoContidoIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNaoContidoIgualActionPerformed
        Conjunto conjunto1 = pegarConjunto(jComboBoxConjunto1.getSelectedItem().toString());
        Conjunto conjunto2 = pegarConjunto(jComboBoxConjunto2.getSelectedItem().toString());
        String str;
        if (!(Operacao.naoContidoOuIgual(conjunto1, conjunto2))) {
            str = "O conjunto " + conjunto1.getNome() + " está contido ou é igual ao conjunto  " + conjunto2.getNome();
        } else {
            str = "O conjunto  " + conjunto1.getNome() + " NÃO está contido ou é igual ao conjunto  " + conjunto2.getNome();
        }
        jTextArea.setText(str);
    }//GEN-LAST:event_jButtonNaoContidoIgualActionPerformed

    private void jButtonContidoPropriamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContidoPropriamenteActionPerformed
        Conjunto conjunto1 = pegarConjunto(jComboBoxConjunto1.getSelectedItem().toString());
        Conjunto conjunto2 = pegarConjunto(jComboBoxConjunto2.getSelectedItem().toString());
        String str;
        if (Operacao.contidoPropriamente(conjunto1, conjunto2)) {
            str = "O conjunto " + conjunto1.getNome() + " está contido propriamente no conjunto  " + conjunto2.getNome();
        } else {
            str = "O conjunto  " + conjunto1.getNome() + " NÃO está contido propriamente no conjunto  " + conjunto2.getNome();
        }
        jTextArea.setText(str);
    }//GEN-LAST:event_jButtonContidoPropriamenteActionPerformed

    private void jButtonNaoContidoPropriamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNaoContidoPropriamenteActionPerformed
        Conjunto conjunto1 = pegarConjunto(jComboBoxConjunto1.getSelectedItem().toString());
        Conjunto conjunto2 = pegarConjunto(jComboBoxConjunto2.getSelectedItem().toString());
        String str;
        if (!(Operacao.naoContidoPropriamente(conjunto1, conjunto2))) {
            str = "O conjunto " + conjunto1.getNome() + " está contido propriamente no conjunto  " + conjunto2.getNome();
        } else {
            str = "O conjunto  " + conjunto1.getNome() + " NÃO está contido propriamente no conjunto  " + conjunto2.getNome();
        }
        jTextArea.setText(str);
    }//GEN-LAST:event_jButtonNaoContidoPropriamenteActionPerformed

    private void jButtonPertenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPertenceActionPerformed
        Elemento elemento = pegarElemento(jComboBoxElemento.getSelectedItem().toString());
        Conjunto conjunto1 = pegarConjunto(jComboBoxConjunto1.getSelectedItem().toString());
        Conjunto conjunto2 = pegarConjunto(jComboBoxConjunto2.getSelectedItem().toString());
        String str;
        if (Operacao.pertence(conjunto1, elemento)) {
            str = "O elemento " + elemento.getNome() + " pertence ao conjunto  " + conjunto1.getNome();
        } else {
            str = "O elemento " + elemento.getNome() + " NÃO pertence ao conjunto  " + conjunto1.getNome();
        }
        if (Operacao.pertence(conjunto2, elemento)) {
            str += " \nO elemento " + elemento.getNome() + " pertence ao conjunto  " + conjunto2.getNome();
        } else {
            str += " \nO elemento " + elemento.getNome() + " NÃO pertence ao conjunto  " + conjunto2.getNome();
        }
        jTextArea.setText(str);
    }//GEN-LAST:event_jButtonPertenceActionPerformed

    private void jButtonNaoPertenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNaoPertenceActionPerformed
        Elemento elemento = pegarElemento(jComboBoxElemento.getSelectedItem().toString());
        Conjunto conjunto1 = pegarConjunto(jComboBoxConjunto1.getSelectedItem().toString());
        Conjunto conjunto2 = pegarConjunto(jComboBoxConjunto2.getSelectedItem().toString());
        String str;
        if (!(Operacao.naoPertence(conjunto1, elemento))) {
            str = "O elemento " + elemento.getNome() + " pertence ao conjunto  " + conjunto1.getNome();
        } else {
            str = "O elemento " + elemento.getNome() + " NÃO pertence ao conjunto  " + conjunto1.getNome();
        }
        if (!(Operacao.naoPertence(conjunto2, elemento))) {
            str += " \nO elemento " + elemento.getNome() + " pertence ao conjunto  " + conjunto2.getNome();
        } else {
            str += " \nO elemento " + elemento.getNome() + " NÃO pertence ao conjunto  " + conjunto2.getNome();
        }
        jTextArea.setText(str);
    }//GEN-LAST:event_jButtonNaoPertenceActionPerformed

    private void jButtonProdutoCartesianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProdutoCartesianoActionPerformed
        Conjunto conjunto1 = pegarConjunto(jComboBoxConjunto1.getSelectedItem().toString());
        Conjunto conjunto2 = pegarConjunto(jComboBoxConjunto2.getSelectedItem().toString());
        Conjunto produtoCartesiano = Operacao.produtoCartesiano(conjunto1, conjunto2);

        String str = "O produto cartesiano do conjunto " + conjunto1.getNome() + "  e o conjunto " + conjunto2.getNome() + "\n{ ";
        for (int i = 0; i < produtoCartesiano.getElementos().size(); i++) {
            str += produtoCartesiano.getElementos().get(i).getNome();
            if (!(i == produtoCartesiano.getElementos().size() - 1)) {
                str += " ,  ";
            }
            if (i % 5 == 0 && i != 0) {
                str += " \n ";
            }

        }
        str += " } ";
        jTextArea.setText(str);
    }//GEN-LAST:event_jButtonProdutoCartesianoActionPerformed

    private void jButtonRelacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRelacoesActionPerformed
        if (conjuntosGlobal.size() > 0) {
            for (int j = 0; j < this.conjuntosGlobal.size(); j++) {
                this.jComboBoxConjuntos1.addItem(this.conjuntosGlobal.get(j).getNome());
                this.jComboBoxConjuntos2.addItem(this.conjuntosGlobal.get(j).getNome());
                this.jComboBoxConjuntos3.addItem(this.conjuntosGlobal.get(j).getNome());

            }

            jPanelRelacoes.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Carregue um arquivo antes!");
        }
    }//GEN-LAST:event_jButtonRelacoesActionPerformed

    private void jComboBoxRelacoes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRelacoes2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRelacoes2ActionPerformed

    private void jButtonRelacaoABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRelacaoABActionPerformed
        int opcao = this.jComboBoxRelacoes1.getSelectedIndex();
        Conjunto conjuntoDominio = pegarConjunto(jComboBoxConjuntos1.getSelectedItem().toString());
        Conjunto conjuntoContraDominio = pegarConjunto(jComboBoxConjuntos2.getSelectedItem().toString());
        String str = "Os pares da relação  ";
        ArrayList<ParRelacao> paresRelacao = new ArrayList<>();
        switch (opcao) {
            case 0:
                str += " maior que  ";

                paresRelacao = Relacao.maiorQue(conjuntoDominio, conjuntoContraDominio);
                break;
            case 1:
                str += " menor que  ";
                paresRelacao = Relacao.menorQue(conjuntoDominio, conjuntoContraDominio);
                break;
            case 2:
                str += " igual a  ";
                paresRelacao = Relacao.igualA(conjuntoDominio, conjuntoContraDominio);
                break;
            case 3:
                str += " quadrado de  ";
                paresRelacao = Relacao.quadradoDe(conjuntoDominio, conjuntoContraDominio);
                break;
            case 4:
                str += " raiz de  ";
                paresRelacao = Relacao.raizQuadradaDe(conjuntoDominio, conjuntoContraDominio);
                break;
            case 5:
                str += " personalizada  ";
                relacaoPersonalizada = new RelacaoPersonalizada(conjuntoDominio, conjuntoContraDominio, "AB");
                relacaoPersonalizada.setVisible(true);

                break;
        }
        if (opcao != 5) {
            str += "  são: ";
            for (int i = 0; i < paresRelacao.size(); i++) {
                str += " <" + paresRelacao.get(i).getElementoDominio().getNome() + "," + paresRelacao.get(i).getElementoContraDominio().getNome() + "> ";
                if (!(i == paresRelacao.size() - 1)) {
                    str += " ,  ";
                }
                if (i % 5 == 0 && i != 0) {
                    str += " \n ";
                }
            }
            str += " \nO seu dominio de definição é: { ";
            Conjunto dominioDefificao = Classificacao.getCnjtDominioDefinicao(paresRelacao);
            for (int i = 0; i < dominioDefificao.getElementos().size(); i++) {
                str += dominioDefificao.getElementos().get(i).getNome();
                if (!(i == dominioDefificao.getElementos().size() - 1)) {
                    str += " ,  ";
                }
            }
            str += " }\n ";
            str += " \nA sua imagem  é: { ";
            Conjunto imagem = Classificacao.getCnjtImagem(paresRelacao);
            for (int i = 0; i < imagem.getElementos().size(); i++) {
                str += imagem.getElementos().get(i).getNome();
                if (!(i == imagem.getElementos().size() - 1)) {
                    str += " ,  ";
                }
            }
            str += " }\n ";
            str += " \n A relação é:  ";
            if (Classificacao.isIsomorfismo(conjuntoDominio, conjuntoContraDominio, paresRelacao)) {
                str += "  Isomorfismo ";
            }
            if (Classificacao.isEpimorfismo(conjuntoDominio, conjuntoContraDominio, paresRelacao)) {
                str += "  Epimorfismo ";
            }
            if (Classificacao.isMonomorfismo(conjuntoDominio, conjuntoContraDominio, paresRelacao)) {
                str += "  Monomorfismo ";
            }
            if (Classificacao.isInjetora(conjuntoDominio, paresRelacao)) {
                str += "  Injetora ";
            }
            if (Classificacao.isFuncional(conjuntoDominio, paresRelacao)) {
                str += "  Funcional ";
            }
            if (Classificacao.isSobrejetora(conjuntoContraDominio, paresRelacao)) {
                str += "  Sobrejetora ";
            }
            if (Classificacao.isTotal(conjuntoDominio, paresRelacao)) {
                str += "  Total ";
            }

            str += " . ";
            Principal.jTextArea.setText(str);
        }
    }//GEN-LAST:event_jButtonRelacaoABActionPerformed

    private void jComboBoxRelacoes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRelacoes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRelacoes1ActionPerformed

    private void jButtonRelacaoACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRelacaoACActionPerformed
        int opcaoAB = this.jComboBoxRelacoes1.getSelectedIndex();
        Conjunto conjuntoDominioAB = pegarConjunto(jComboBoxConjuntos1.getSelectedItem().toString());
        Conjunto conjuntoContraDominioAB = pegarConjunto(jComboBoxConjuntos2.getSelectedItem().toString());
        ArrayList<ParRelacao> paresRelacaoAB = new ArrayList<>();
        switch (opcaoAB) {
            case 0:
                paresRelacaoAB = Relacao.maiorQue(conjuntoDominioAB, conjuntoContraDominioAB);
                break;
            case 1:
                paresRelacaoAB = Relacao.menorQue(conjuntoDominioAB, conjuntoContraDominioAB);
                break;
            case 2:
                paresRelacaoAB = Relacao.igualA(conjuntoDominioAB, conjuntoContraDominioAB);
                break;
            case 3:
                paresRelacaoAB = Relacao.quadradoDe(conjuntoDominioAB, conjuntoContraDominioAB);
                break;
            case 4:
                paresRelacaoAB = Relacao.raizQuadradaDe(conjuntoDominioAB, conjuntoContraDominioAB);
                break;
            case 5:

                paresRelacaoAB = relacaoPersonalizadaAB;

                break;
        }
        relacaoPersonalizadaAB = paresRelacaoAB;
        int opcaoBC = this.jComboBoxRelacoes2.getSelectedIndex();
        Conjunto conjuntoDominioBC = pegarConjunto(jComboBoxConjuntos2.getSelectedItem().toString());
        Conjunto conjuntoContraDominioBC = pegarConjunto(jComboBoxConjuntos3.getSelectedItem().toString());
        ArrayList<ParRelacao> paresRelacaoBC = new ArrayList<>();
        switch (opcaoBC) {
            case 0:
                paresRelacaoBC = Relacao.maiorQue(conjuntoDominioBC, conjuntoContraDominioBC);
                break;
            case 1:
                paresRelacaoBC = Relacao.menorQue(conjuntoDominioBC, conjuntoContraDominioBC);
                break;
            case 2:
                paresRelacaoBC = Relacao.igualA(conjuntoDominioBC, conjuntoContraDominioBC);
                break;
            case 3:
                paresRelacaoBC = Relacao.quadradoDe(conjuntoDominioBC, conjuntoContraDominioBC);
                break;
            case 4:
                paresRelacaoBC = Relacao.raizQuadradaDe(conjuntoDominioBC, conjuntoContraDominioBC);
                break;
            case 5:
                relacaoPersonalizada = new RelacaoPersonalizada(conjuntoDominioBC, conjuntoContraDominioBC, "BC");
                relacaoPersonalizada.setVisible(true);
                break;
        }
        if (opcaoBC != 5) {
            Conjunto conjuntoDominioAC = pegarConjunto(jComboBoxConjuntos1.getSelectedItem().toString());
            Conjunto conjuntoContraDominioAC = pegarConjunto(jComboBoxConjuntos3.getSelectedItem().toString());
            String str = "Os pares da relação  ";

            ArrayList<ParRelacao> paresRelacaoAC = Relacao.relacaoComposta(paresRelacaoAB, paresRelacaoBC);
            for (int i = 0; i < paresRelacaoAC.size(); i++) {
                str += " <" + paresRelacaoAC.get(i).getElementoDominio().getNome() + "," + paresRelacaoAC.get(i).getElementoContraDominio().getNome() + "> ";
                if (!(i == paresRelacaoAC.size() - 1)) {
                    str += " ,  ";
                }
                if (i % 5 == 0 && i != 0) {
                    str += " \n ";
                }
            }
            str += " \nO seu dominio de definição é: { ";
            Conjunto dominioDefificao = Classificacao.getCnjtDominioDefinicao(paresRelacaoAC);
            for (int i = 0; i < dominioDefificao.getElementos().size(); i++) {
                str += dominioDefificao.getElementos().get(i).getNome();
                if (!(i == dominioDefificao.getElementos().size() - 1)) {
                    str += " ,  ";
                }
            }
            str += " }\n ";
            str += " \nA sua imagem  é: { ";
            Conjunto imagem = Classificacao.getCnjtImagem(paresRelacaoAC);
            for (int i = 0; i < imagem.getElementos().size(); i++) {
                str += imagem.getElementos().get(i).getNome();
                if (!(i == imagem.getElementos().size() - 1)) {
                    str += " ,  ";
                }
            }
            str += " }\n ";
            str += " \n A relação é:  ";
            if (Classificacao.isIsomorfismo(conjuntoDominioAC, conjuntoContraDominioAC, paresRelacaoAC)) {
                str += " Isomorfismo ";
            }
            if (Classificacao.isEpimorfismo(conjuntoDominioAC, conjuntoContraDominioAC, paresRelacaoAC)) {
                str += " Epimorfismo ";
            }
            if (Classificacao.isMonomorfismo(conjuntoDominioAC, conjuntoContraDominioAC, paresRelacaoAC)) {
                str += " Monomorfismo ";
            }
            if (Classificacao.isInjetora(conjuntoDominioAC, paresRelacaoAC)) {
                str += " Injetora ";
            }
            if (Classificacao.isFuncional(conjuntoDominioAC, paresRelacaoAC)) {
                str += " Funcional ";
            }
            if (Classificacao.isSobrejetora(conjuntoContraDominioAC, paresRelacaoAC)) {
                str += "  Sobrejetora  ";
            }
            if (Classificacao.isTotal(conjuntoDominioAC, paresRelacaoAC)) {
                str += "  Total  ";
            }

            str += " . ";
            jTextArea.setText(str);
        }

    }//GEN-LAST:event_jButtonRelacaoACActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonContidoIgual;
    private javax.swing.JButton jButtonContidoPropriamente;
    private javax.swing.JButton jButtonIntersecao;
    private javax.swing.JButton jButtonNaoContidoIgual;
    private javax.swing.JButton jButtonNaoContidoPropriamente;
    private javax.swing.JButton jButtonNaoPertence;
    private javax.swing.JButton jButtonOperacoes;
    private javax.swing.JButton jButtonPertence;
    private javax.swing.JButton jButtonProdutoCartesiano;
    private javax.swing.JButton jButtonRelacaoAB;
    private javax.swing.JButton jButtonRelacaoAC;
    private javax.swing.JButton jButtonRelacoes;
    private javax.swing.JButton jButtonUniao;
    private javax.swing.JComboBox<String> jComboBoxConjunto1;
    private javax.swing.JComboBox<String> jComboBoxConjunto2;
    private javax.swing.JComboBox<String> jComboBoxConjuntos1;
    private javax.swing.JComboBox<String> jComboBoxConjuntos2;
    private javax.swing.JComboBox<String> jComboBoxConjuntos3;
    private javax.swing.JComboBox<String> jComboBoxElemento;
    private javax.swing.JComboBox<String> jComboBoxRelacoes1;
    private javax.swing.JComboBox<String> jComboBoxRelacoes2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanelOperacoes;
    private javax.swing.JPanel jPanelRelacoes;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextArea jTextArea;
    // End of variables declaration//GEN-END:variables

    private Conjunto pegarConjunto(String toString) {
        for (int i = 0; i < conjuntosGlobal.size(); i++) {
            if (conjuntosGlobal.get(i).getNome().equals(toString)) {
                return conjuntosGlobal.get(i);
            }

        }
        return null;

    }

    private boolean adicionaConjuntoGlobal(Conjunto uniao) {
        for (int i = 0; i < conjuntosGlobal.size(); i++) {
            if (conjuntosGlobal.get(i).getNome().equals(uniao.getNome())) {
                return false;
            }
        }
        return true;
    }

    private Elemento pegarElemento(String toString) {
        for (int i = 0; i < elementosGlobal.size(); i++) {
            if (elementosGlobal.get(i).getNome().equals(toString)) {
                return elementosGlobal.get(i);
            }

        }
        return null;
    }

    public static void setRelacaoPersonalizadaAB(ArrayList<ParRelacao> paresRelacao, Conjunto conjuntoDominio, Conjunto conjuntoContraDominio) {
        relacaoPersonalizadaAB = paresRelacao;
        String str = " são: ";
        for (int i = 0; i < paresRelacao.size(); i++) {
            str += " <" + paresRelacao.get(i).getElementoDominio().getNome() + "," + paresRelacao.get(i).getElementoContraDominio().getNome() + "> ";
            if (!(i == paresRelacao.size() - 1)) {
                str += " ,  ";
            }
            if (i % 5 == 0 && i != 0) {
                str += " \n ";
            }
        }
        str += " \nO seu dominio de definição é: { ";
        Conjunto dominioDefificao = Classificacao.getCnjtDominioDefinicao(paresRelacao);
        for (int i = 0; i < dominioDefificao.getElementos().size(); i++) {
            str += dominioDefificao.getElementos().get(i).getNome();
            if (!(i == dominioDefificao.getElementos().size() - 1)) {
                str += " ,  ";
            }
        }
        str += " }\n ";
        str += " \nA sua imagem  é: { ";
        Conjunto imagem = Classificacao.getCnjtImagem(paresRelacao);
        for (int i = 0; i < imagem.getElementos().size(); i++) {
            str += imagem.getElementos().get(i).getNome();
            if (!(i == imagem.getElementos().size() - 1)) {
                str += " ,  ";
            }
        }
        str += " }\n ";
        str += " \n A relação é:  ";
        if (Classificacao.isIsomorfismo(conjuntoDominio, conjuntoContraDominio, paresRelacao)) {
            str += " Isomorfismo ";
        }
        if (Classificacao.isEpimorfismo(conjuntoDominio, conjuntoContraDominio, paresRelacao)) {
            str += " Epimorfismo ";
        }
        if (Classificacao.isMonomorfismo(conjuntoDominio, conjuntoContraDominio, paresRelacao)) {
            str += " Monomorfismo ";
        }
        if (Classificacao.isInjetora(conjuntoDominio, paresRelacao)) {
            str += " Injetora ";
        }
        if (Classificacao.isFuncional(conjuntoDominio, paresRelacao)) {
            str += " Funcional ";
        }
        if (Classificacao.isSobrejetora(conjuntoContraDominio, paresRelacao)) {
            str += "  Sobrejetora  ";
        }
        if (Classificacao.isTotal(conjuntoDominio, paresRelacao)) {
            str += "  Total  ";
        }

        str += " . ";
        jTextArea.setText(str);
    }

    public static void setRelacaoPersonalizadaBC(ArrayList<ParRelacao> paresRelacaoBC, Conjunto conjuntoDominioAC, Conjunto conjuntoContraDominioAC) {
        relacaoPersonalizadaBC = paresRelacaoBC;
        ArrayList<ParRelacao> paresRelacaoAB = relacaoPersonalizadaAB;

        String str = "Os pares da relação  ";

        ArrayList<ParRelacao> paresRelacaoAC = Relacao.relacaoComposta(paresRelacaoAB, paresRelacaoBC);
        for (int i = 0; i < paresRelacaoAC.size(); i++) {
            str += " <" + paresRelacaoAC.get(i).getElementoDominio().getNome() + "," + paresRelacaoAC.get(i).getElementoContraDominio().getNome() + "> ";
            if (!(i == paresRelacaoAC.size() - 1)) {
                str += " ,  ";
            }
            if (i % 5 == 0 && i != 0) {
                str += " \n ";
            }
        }
        str += " \nO seu dominio de definição é: { ";
        Conjunto dominioDefificao = Classificacao.getCnjtDominioDefinicao(paresRelacaoAC);
        for (int i = 0; i < dominioDefificao.getElementos().size(); i++) {
            str += dominioDefificao.getElementos().get(i).getNome();
            if (!(i == dominioDefificao.getElementos().size() - 1)) {
                str += " ,  ";
            }
        }
        str += " }\n ";
        str += " \nA sua imagem  é: { ";
        Conjunto imagem = Classificacao.getCnjtImagem(paresRelacaoAC);
        for (int i = 0; i < imagem.getElementos().size(); i++) {
            str += imagem.getElementos().get(i).getNome();
            if (!(i == imagem.getElementos().size() - 1)) {
                str += " ,  ";
            }
        }
        str += " }\n ";
        str += " \n A relação é:  ";
        if (Classificacao.isIsomorfismo(conjuntoDominioAC, conjuntoContraDominioAC, paresRelacaoAC)) {
            str += " Isomorfismo ";
        }
        if (Classificacao.isEpimorfismo(conjuntoDominioAC, conjuntoContraDominioAC, paresRelacaoAC)) {
            str += " Epimorfismo ";
        }
        if (Classificacao.isMonomorfismo(conjuntoDominioAC, conjuntoContraDominioAC, paresRelacaoAC)) {
            str += " Monomorfismo ";
        }
        if (Classificacao.isInjetora(conjuntoDominioAC, paresRelacaoAC)) {
            str += " Injetora ";
        }
        if (Classificacao.isFuncional(conjuntoDominioAC, paresRelacaoAC)) {
            str += " Funcional ";
        }
        if (Classificacao.isSobrejetora(conjuntoContraDominioAC, paresRelacaoAC)) {
            str += "  Sobrejetora  ";
        }
        if (Classificacao.isTotal(conjuntoDominioAC, paresRelacaoAC)) {
            str += "  Total  ";
        }

        str += " . ";
        jTextArea.setText(str);
    }
}
