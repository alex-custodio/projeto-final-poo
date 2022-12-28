
package com.monsterwolf;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class Carrinho extends javax.swing.JFrame {
    CarrinhoDeComprasDAO objeto = new CarrinhoDeComprasDAO();
    /**
     * Creates new form TelaInicial
     */
    public Carrinho() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        produtoField = new javax.swing.JTextField();
        produtoLabel = new javax.swing.JLabel();
        precoField = new javax.swing.JTextField();
        precoLabel = new javax.swing.JLabel();
        Tela1 = new javax.swing.JPanel();
        panelButtons = new javax.swing.JPanel();
        apagarButton = new javax.swing.JButton();
        editarButton = new javax.swing.JButton();
        quantidadeLabel = new javax.swing.JLabel();
        quantidadeField = new javax.swing.JTextField();
        indexLabel = new javax.swing.JLabel();
        compraButton = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        voltarButton = new javax.swing.JButton();

        produtoField.setBackground(new java.awt.Color(81, 72, 105));
        produtoField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        produtoField.setForeground(new java.awt.Color(255, 255, 255));
        produtoField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        produtoField.setToolTipText("Digite sua senha");
        produtoField.setBorder(null);
        produtoField.setMargin(new java.awt.Insets(2, 6, 2, 2));
        produtoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtoFieldActionPerformed(evt);
            }
        });

        produtoLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        produtoLabel.setForeground(java.awt.Color.white);
        produtoLabel.setText("Produto:");

        precoField.setBackground(new java.awt.Color(81, 72, 105));
        precoField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        precoField.setForeground(new java.awt.Color(255, 255, 255));
        precoField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        precoField.setToolTipText("Digite sua senha");
        precoField.setBorder(null);
        precoField.setMargin(new java.awt.Insets(2, 6, 2, 2));
        precoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoFieldActionPerformed(evt);
            }
        });

        precoLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        precoLabel.setForeground(java.awt.Color.white);
        precoLabel.setText("Preço:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        Tela1.setBackground(new java.awt.Color(32, 27, 44));

        panelButtons.setBackground(new java.awt.Color(47, 40, 65));
        panelButtons.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelButtons.setForeground(new java.awt.Color(102, 0, 102));

        apagarButton.setBackground(new java.awt.Color(119, 255, 192));
        apagarButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        apagarButton.setText("Apagar");
        apagarButton.setBorder(null);
        apagarButton.setBorderPainted(false);
        apagarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarButtonActionPerformed(evt);
            }
        });

        editarButton.setBackground(new java.awt.Color(119, 255, 192));
        editarButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        editarButton.setText("Editar");
        editarButton.setBorder(null);
        editarButton.setBorderPainted(false);
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        quantidadeLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        quantidadeLabel.setForeground(java.awt.Color.white);
        quantidadeLabel.setText("Quantidade:");

        quantidadeField.setBackground(new java.awt.Color(81, 72, 105));
        quantidadeField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        quantidadeField.setForeground(new java.awt.Color(255, 255, 255));
        quantidadeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        quantidadeField.setToolTipText("Digite sua senha");
        quantidadeField.setBorder(null);
        quantidadeField.setMargin(new java.awt.Insets(2, 6, 2, 2));
        quantidadeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantidadeFieldActionPerformed(evt);
            }
        });

        indexLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        indexLabel.setForeground(java.awt.Color.white);
        indexLabel.setText("0");

        compraButton.setBackground(new java.awt.Color(119, 255, 192));
        compraButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        compraButton.setText("Confirmar Compra");
        compraButton.setBorder(null);
        compraButton.setBorderPainted(false);
        compraButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButtonsLayout = new javax.swing.GroupLayout(panelButtons);
        panelButtons.setLayout(panelButtonsLayout);
        panelButtonsLayout.setHorizontalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonsLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(quantidadeLabel)
                    .addComponent(indexLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelButtonsLayout.createSequentialGroup()
                        .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(apagarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(quantidadeField))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(compraButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        panelButtonsLayout.setVerticalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelButtonsLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(indexLabel)
                .addGap(14, 14, 14)
                .addComponent(quantidadeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(quantidadeField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apagarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(compraButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        logo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        logo.setForeground(new java.awt.Color(101, 241, 215));
        logo.setText("Carrinho de Compras");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "produto", "preco", "quantidade"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        voltarButton.setBackground(new java.awt.Color(119, 255, 192));
        voltarButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        voltarButton.setText("Voltar");
        voltarButton.setBorder(null);
        voltarButton.setBorderPainted(false);
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Tela1Layout = new javax.swing.GroupLayout(Tela1);
        Tela1.setLayout(Tela1Layout);
        Tela1Layout.setHorizontalGroup(
            Tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tela1Layout.createSequentialGroup()
                .addGroup(Tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(Tela1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(panelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Tela1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        Tela1Layout.setVerticalGroup(
            Tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tela1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(Tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logo)
                    .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                    .addComponent(panelButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tela1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tela1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void apagarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarButtonActionPerformed
        int id_selecionado = Integer.parseInt(indexLabel.getText());
        objeto.apagarProduto(id_selecionado);
        this.dispose();
        new Carrinho().setVisible(true);
    }//GEN-LAST:event_apagarButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed

        Produto pd = new Produto(produtoField.getText(), "", Integer.parseInt(quantidadeField.getText()), precoField.getText());
        int id_selecionado = Integer.parseInt(indexLabel.getText());
        objeto.editarProduto(pd, id_selecionado);
        new Carrinho().setVisible(true);
    }//GEN-LAST:event_editarButtonActionPerformed

    private void quantidadeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantidadeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantidadeFieldActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        Loja loja = new Loja();
        loja.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
        ArrayList<Produto> lista_desejos = objeto.getListaDesejos();
        for (Produto produto : lista_desejos) {
            dtm.addRow(new Object[]{
                produto.getId(), 
                produto.getNome(),
                produto.getValor(),
                produto.getQuantidade()
            });
        }
    }//GEN-LAST:event_formComponentShown

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        
        TableModel modeloTabela = tabela.getModel();
        int id = tabela.getSelectedRow();
        String idText = modeloTabela.getValueAt(id, 0).toString();
        indexLabel.setText(idText);
        String produtoTexto = modeloTabela.getValueAt(id, 1).toString();
        produtoField.setText(produtoTexto);
        String precoTotalTexto = modeloTabela.getValueAt(id, 2).toString();
        precoField.setText(precoTotalTexto);
        String quantidadeTexto = modeloTabela.getValueAt(id, 3).toString();
        quantidadeField.setText(quantidadeTexto);
    }//GEN-LAST:event_tabelaMouseClicked

    private void produtoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produtoFieldActionPerformed

    private void precoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precoFieldActionPerformed

    private void compraButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraButtonActionPerformed
        ArrayList<Produto> lista_desejos = objeto.getListaDesejos();
        CarrinhoDeComprasDAO c = new CarrinhoDeComprasDAO();
        VendasDAO venda = new VendasDAO();
        for (Produto produto: lista_desejos){
            venda.inserirVenda(produto);
            c.apagarProduto(produto.getId());
        }
        Carrinho carrinho = new Carrinho();
        carrinho.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_compraButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrinho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Tela1;
    private javax.swing.JButton apagarButton;
    private javax.swing.JButton compraButton;
    private javax.swing.JButton editarButton;
    private javax.swing.JLabel indexLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JTextField precoField;
    private javax.swing.JLabel precoLabel;
    private javax.swing.JTextField produtoField;
    private javax.swing.JLabel produtoLabel;
    private javax.swing.JTextField quantidadeField;
    private javax.swing.JLabel quantidadeLabel;
    private javax.swing.JTable tabela;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
