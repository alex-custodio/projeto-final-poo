/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.monsterwolf;

/**
 *
 * @author Vagner
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public Menu() {
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

        Tela1 = new javax.swing.JPanel();
        panelButtons = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        cadastroButton = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        nomeMenu = new javax.swing.JLabel();
        imagemLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tela1.setBackground(new java.awt.Color(32, 27, 44));

        panelButtons.setBackground(new java.awt.Color(47, 40, 65));
        panelButtons.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelButtons.setForeground(new java.awt.Color(102, 0, 102));

        loginButton.setBackground(new java.awt.Color(119, 255, 192));
        loginButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        loginButton.setText("Login");
        loginButton.setBorder(null);
        loginButton.setBorderPainted(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        cadastroButton.setBackground(new java.awt.Color(119, 255, 192));
        cadastroButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        cadastroButton.setText("Cadastro");
        cadastroButton.setBorder(null);
        cadastroButton.setBorderPainted(false);
        cadastroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButtonsLayout = new javax.swing.GroupLayout(panelButtons);
        panelButtons.setLayout(panelButtonsLayout);
        panelButtonsLayout.setHorizontalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonsLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        panelButtonsLayout.setVerticalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonsLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(cadastroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        logo.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        logo.setForeground(new java.awt.Color(101, 241, 215));
        logo.setText("Monster Wolf");

        nomeMenu.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        nomeMenu.setForeground(new java.awt.Color(119, 255, 192));
        nomeMenu.setText("Menu");

        imagemLogo.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn-icons-png.flaticon.com/128/3485/3485579.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        javax.swing.GroupLayout Tela1Layout = new javax.swing.GroupLayout(Tela1);
        Tela1.setLayout(Tela1Layout);
        Tela1Layout.setHorizontalGroup(
            Tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tela1Layout.createSequentialGroup()
                .addContainerGap(282, Short.MAX_VALUE)
                .addGroup(Tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tela1Layout.createSequentialGroup()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imagemLogo)
                        .addGap(182, 182, 182))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tela1Layout.createSequentialGroup()
                        .addComponent(panelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(228, 228, 228))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tela1Layout.createSequentialGroup()
                        .addComponent(nomeMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168))))
        );
        Tela1Layout.setVerticalGroup(
            Tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tela1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagemLogo)
                    .addGroup(Tela1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(logo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(nomeMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
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

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void cadastroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroButtonActionPerformed
        Cadastro cadastro = new Cadastro();
        cadastro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cadastroButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Tela1;
    private javax.swing.JButton cadastroButton;
    private javax.swing.JLabel imagemLogo;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nomeMenu;
    private javax.swing.JPanel panelButtons;
    // End of variables declaration//GEN-END:variables
}
