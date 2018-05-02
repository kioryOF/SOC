/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Conjunto;
import modelo.Elemento;
import modelo.ParRelacao;

public class RelacaoPersonalizada extends javax.swing.JFrame {

    private Conjunto cnjtA;
    private Conjunto cnjtB;
    private ArrayList<ParRelacao> relacaoPersonalizada;
    private String tipo;

    public RelacaoPersonalizada(Conjunto cnjtA, Conjunto cnjtB, String tipo) {
        initComponents();
        this.tipo = tipo;
        relacaoPersonalizada = new ArrayList<>();
        this.cnjtA = cnjtA;
        this.cnjtB = cnjtB;
        for (int j = 0; j < this.cnjtA.getElementos().size(); j++) {
            this.jComboBoxDominio.addItem(this.cnjtA.getElementos().get(j).getNome());
        }
        for (int j = 0; j < this.cnjtB.getElementos().size(); j++) {
            this.jComboBoxContraDominio.addItem(this.cnjtB.getElementos().get(j).getNome());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxDominio = new javax.swing.JComboBox<>();
        jComboBoxContraDominio = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonAddPar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonConcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jComboBoxDominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDominioActionPerformed(evt);
            }
        });

        jLabel1.setText("Elemento dominio:");

        jLabel2.setText("Elemento contra dominio");

        jButtonAddPar.setText("Adicionar par Relação");
        jButtonAddPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddParActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonConcluir.setText("Concluir");
        jButtonConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConcluirActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jComboBoxDominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCancelar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jComboBoxContraDominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonConcluir))
                        .addGap(23, 23, 23))))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jButtonAddPar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxContraDominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButtonAddPar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConcluir)
                    .addComponent(jButtonCancelar))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxDominioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDominioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDominioActionPerformed

    private void jButtonAddParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddParActionPerformed
        Elemento elementoDomonio = pegarElemento(cnjtA, this.jComboBoxDominio.getSelectedItem().toString());
        Elemento elementoContraDomonio = pegarElemento(cnjtB, this.jComboBoxContraDominio.getSelectedItem().toString());
        ParRelacao par = new ParRelacao(elementoDomonio, elementoContraDomonio);
        adicionaPar(par);
        imprimeRelacao();


    }//GEN-LAST:event_jButtonAddParActionPerformed

    private void jButtonConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConcluirActionPerformed

        if (tipo.equals("AB")) {
            Principal.setRelacaoPersonalizadaAB(relacaoPersonalizada, cnjtA,cnjtB);
        }
        if (tipo.equals("BC")) {
            Principal.setRelacaoPersonalizadaBC(relacaoPersonalizada,cnjtA,cnjtB);
        }
        this.dispose();
    }//GEN-LAST:event_jButtonConcluirActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed
    private Elemento pegarElemento(Conjunto cnjt, String nome) {
        for (int i = 0; i < cnjt.getElementos().size(); i++) {
            if (cnjt.getElementos().get(i).getNome().equals(nome)) {
                return cnjt.getElementos().get(i);
            }

        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddPar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConcluir;
    private javax.swing.JComboBox<String> jComboBoxContraDominio;
    private javax.swing.JComboBox<String> jComboBoxDominio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    private void imprimeRelacao() {
        String str = "A relação persnalizada é:";
        for (int i = 0; i < relacaoPersonalizada.size(); i++) {
            str += "<" + relacaoPersonalizada.get(i).getElementoDominio().getNome() + "," + relacaoPersonalizada.get(i).getElementoContraDominio().getNome() + ">";
            if (!(i == relacaoPersonalizada.size() - 1)) {
                str += ", ";
            }
            if (i % 5 == 0 && i != 0) {
                str += "\n";
            }
        }
        this.jTextArea1.setText(str);
    }

    private void adicionaPar(ParRelacao par) {
        int cont = 0;
        if (relacaoPersonalizada.isEmpty()) {
            relacaoPersonalizada.add(par);
        } else {
            for (int i = 0; i < relacaoPersonalizada.size(); i++) {
                if (par.getElementoDominio().getNome().equalsIgnoreCase(relacaoPersonalizada.get(i).getElementoDominio().getNome())
                        && par.getElementoContraDominio().getNome().equalsIgnoreCase(relacaoPersonalizada.get(i).getElementoContraDominio().getNome())) {
                    JOptionPane.showMessageDialog(null, "Par de relação já adicionado!");
                    break;
                } else {
                    cont++;

                }
            }
            if (cont == relacaoPersonalizada.size()) {
                relacaoPersonalizada.add(par);
            }

        }
    }
}
