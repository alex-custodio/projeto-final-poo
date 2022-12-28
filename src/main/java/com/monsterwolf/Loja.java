/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.monsterwolf;

import javax.swing.JOptionPane;


public class Loja extends javax.swing.JFrame {
    static Produto whey,creatina, pasta;
    CarrinhoDeComprasDAO objeto = new CarrinhoDeComprasDAO();
    
    /**
     * Creates new form TelaInicial
     */
    public Loja() {
        initComponents();
        whey = new Produto( "Whey Protein", "Whey Protein Growth é a proteína ideal para quem treina hipertrofia e quer ganhar massa muscular", 1, "R$99,00");
        creatina = new Produto( "Creatina", "A Creatina auxilia na manutenção dos níveis de energia durante o treino", 1, "R$45,00");
        pasta = new Produto( "Pasta de Amendoim", "O amendoim é um alimento de excelentes propriedades nutricionais; seus grãos contém 26% de proteínas, 46% de óleo, além de sais minerais e um leque de vitaminas e compostos antioxidantes", 1, "R$25,00");
 
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
        panelWhey = new javax.swing.JPanel();
        imagemWhey = new javax.swing.JLabel();
        valorWhey = new javax.swing.JLabel();
        nomeWhey = new javax.swing.JLabel();
        adicionarCarrinho1 = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        carrinhoButton = new javax.swing.JButton();
        pedidosButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();
        panelCreatina = new javax.swing.JPanel();
        imagemCreatina = new javax.swing.JLabel();
        valorCreatina = new javax.swing.JLabel();
        nomeCreatina = new javax.swing.JLabel();
        adicionarCarrinho2 = new javax.swing.JButton();
        panelPasta = new javax.swing.JPanel();
        imagemPasta = new javax.swing.JLabel();
        valorPasta = new javax.swing.JLabel();
        nomePasta = new javax.swing.JLabel();
        adicionarCarrinho3 = new javax.swing.JButton();
        panelDemo1 = new javax.swing.JPanel();
        panelDemo2 = new javax.swing.JPanel();
        panelDemo3 = new javax.swing.JPanel();
        comprarPasta = new javax.swing.JButton();
        comprarWhey = new javax.swing.JButton();
        comprarCreatina = new javax.swing.JButton();
        detalhesPasta = new javax.swing.JButton();
        detalhesWhey = new javax.swing.JButton();
        detalhesCreatina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tela1.setBackground(new java.awt.Color(32, 27, 44));

        panelWhey.setBackground(new java.awt.Color(47, 40, 65));
        panelWhey.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelWhey.setForeground(new java.awt.Color(102, 0, 102));

        imagemWhey.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://raw.githubusercontent.com/alex-custodio/projeto-final-poo/main/src/main/java/com/monsterwolf/whey-protein.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        valorWhey.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        valorWhey.setForeground(new java.awt.Color(119, 255, 192));
        valorWhey.setText("R$99,00");

        nomeWhey.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        nomeWhey.setForeground(new java.awt.Color(255, 204, 102));
        nomeWhey.setText("Whey Protein");

        adicionarCarrinho1.setBackground(new java.awt.Color(255, 102, 102));
        adicionarCarrinho1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        adicionarCarrinho1.setForeground(new java.awt.Color(255, 255, 255));
        adicionarCarrinho1.setText("+");
        adicionarCarrinho1.setBorder(null);
        adicionarCarrinho1.setBorderPainted(false);
        adicionarCarrinho1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarCarrinho1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelWheyLayout = new javax.swing.GroupLayout(panelWhey);
        panelWhey.setLayout(panelWheyLayout);
        panelWheyLayout.setHorizontalGroup(
            panelWheyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWheyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adicionarCarrinho1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(valorWhey)
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelWheyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelWheyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nomeWhey)
                    .addComponent(imagemWhey))
                .addGap(35, 35, 35))
        );
        panelWheyLayout.setVerticalGroup(
            panelWheyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWheyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nomeWhey)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemWhey)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelWheyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valorWhey)
                    .addComponent(adicionarCarrinho1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        header.setBackground(new java.awt.Color(47, 40, 65));
        header.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        header.setForeground(new java.awt.Color(102, 0, 102));

        logo.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        logo.setForeground(new java.awt.Color(101, 241, 215));
        logo.setText("Monster Wolf");

        carrinhoButton.setBackground(new java.awt.Color(255, 102, 102));
        carrinhoButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        carrinhoButton.setText("Carrinho");
        carrinhoButton.setBorder(null);
        carrinhoButton.setBorderPainted(false);
        carrinhoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrinhoButtonActionPerformed(evt);
            }
        });

        pedidosButton.setBackground(new java.awt.Color(255, 102, 102));
        pedidosButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        pedidosButton.setText("Pedidos");
        pedidosButton.setBorder(null);
        pedidosButton.setBorderPainted(false);
        pedidosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidosButtonActionPerformed(evt);
            }
        });

        sairButton.setBackground(new java.awt.Color(119, 255, 192));
        sairButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        sairButton.setText("Sair");
        sairButton.setBorder(null);
        sairButton.setBorderPainted(false);
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(carrinhoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(pedidosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logo)
                    .addComponent(carrinhoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pedidosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        panelCreatina.setBackground(new java.awt.Color(47, 40, 65));
        panelCreatina.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelCreatina.setForeground(new java.awt.Color(102, 0, 102));

        imagemCreatina.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://raw.githubusercontent.com/alex-custodio/projeto-final-poo/main/src/main/java/com/monsterwolf/creatina.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        valorCreatina.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        valorCreatina.setForeground(new java.awt.Color(119, 255, 192));
        valorCreatina.setText("R$45,00");

        nomeCreatina.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        nomeCreatina.setForeground(new java.awt.Color(255, 204, 102));
        nomeCreatina.setText("Creatina");

        adicionarCarrinho2.setBackground(new java.awt.Color(255, 102, 102));
        adicionarCarrinho2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        adicionarCarrinho2.setForeground(new java.awt.Color(255, 255, 255));
        adicionarCarrinho2.setText("+");
        adicionarCarrinho2.setBorder(null);
        adicionarCarrinho2.setBorderPainted(false);
        adicionarCarrinho2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarCarrinho2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCreatinaLayout = new javax.swing.GroupLayout(panelCreatina);
        panelCreatina.setLayout(panelCreatinaLayout);
        panelCreatinaLayout.setHorizontalGroup(
            panelCreatinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCreatinaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCreatinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCreatinaLayout.createSequentialGroup()
                        .addComponent(adicionarCarrinho2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(valorCreatina)
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCreatinaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelCreatinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCreatinaLayout.createSequentialGroup()
                                .addComponent(nomeCreatina)
                                .addGap(68, 68, 68))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCreatinaLayout.createSequentialGroup()
                                .addComponent(imagemCreatina)
                                .addGap(38, 38, 38))))))
        );
        panelCreatinaLayout.setVerticalGroup(
            panelCreatinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCreatinaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(nomeCreatina)
                .addGap(31, 31, 31)
                .addComponent(imagemCreatina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(valorCreatina)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCreatinaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(adicionarCarrinho2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelPasta.setBackground(new java.awt.Color(47, 40, 65));
        panelPasta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelPasta.setForeground(new java.awt.Color(102, 0, 102));

        imagemPasta.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://raw.githubusercontent.com/alex-custodio/projeto-final-poo/main/src/main/java/com/monsterwolf/pasta-amendoim.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        valorPasta.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        valorPasta.setForeground(new java.awt.Color(119, 255, 192));
        valorPasta.setText("R$25,00");

        nomePasta.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        nomePasta.setForeground(new java.awt.Color(255, 204, 102));
        nomePasta.setText("Pasta de Amendoim");

        adicionarCarrinho3.setBackground(new java.awt.Color(255, 102, 102));
        adicionarCarrinho3.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        adicionarCarrinho3.setForeground(new java.awt.Color(255, 255, 255));
        adicionarCarrinho3.setText("+");
        adicionarCarrinho3.setBorder(null);
        adicionarCarrinho3.setBorderPainted(false);
        adicionarCarrinho3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarCarrinho3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPastaLayout = new javax.swing.GroupLayout(panelPasta);
        panelPasta.setLayout(panelPastaLayout);
        panelPastaLayout.setHorizontalGroup(
            panelPastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPastaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPastaLayout.createSequentialGroup()
                        .addComponent(adicionarCarrinho3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(valorPasta)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPastaLayout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addGroup(panelPastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPastaLayout.createSequentialGroup()
                                .addComponent(imagemPasta)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPastaLayout.createSequentialGroup()
                                .addComponent(nomePasta)
                                .addContainerGap())))))
        );
        panelPastaLayout.setVerticalGroup(
            panelPastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPastaLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(nomePasta)
                .addGap(18, 18, 18)
                .addComponent(imagemPasta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valorPasta)
                    .addComponent(adicionarCarrinho3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        panelDemo1.setBackground(new java.awt.Color(47, 40, 65));
        panelDemo1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelDemo1.setForeground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout panelDemo1Layout = new javax.swing.GroupLayout(panelDemo1);
        panelDemo1.setLayout(panelDemo1Layout);
        panelDemo1Layout.setHorizontalGroup(
            panelDemo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );
        panelDemo1Layout.setVerticalGroup(
            panelDemo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        panelDemo2.setBackground(new java.awt.Color(47, 40, 65));
        panelDemo2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelDemo2.setForeground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout panelDemo2Layout = new javax.swing.GroupLayout(panelDemo2);
        panelDemo2.setLayout(panelDemo2Layout);
        panelDemo2Layout.setHorizontalGroup(
            panelDemo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelDemo2Layout.setVerticalGroup(
            panelDemo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelDemo3.setBackground(new java.awt.Color(47, 40, 65));
        panelDemo3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelDemo3.setForeground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout panelDemo3Layout = new javax.swing.GroupLayout(panelDemo3);
        panelDemo3.setLayout(panelDemo3Layout);
        panelDemo3Layout.setHorizontalGroup(
            panelDemo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        panelDemo3Layout.setVerticalGroup(
            panelDemo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        comprarPasta.setBackground(new java.awt.Color(119, 255, 192));
        comprarPasta.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        comprarPasta.setText("Comprar");
        comprarPasta.setBorder(null);
        comprarPasta.setBorderPainted(false);
        comprarPasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarPastaActionPerformed(evt);
            }
        });

        comprarWhey.setBackground(new java.awt.Color(119, 255, 192));
        comprarWhey.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        comprarWhey.setText("Comprar");
        comprarWhey.setBorder(null);
        comprarWhey.setBorderPainted(false);
        comprarWhey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarWheyActionPerformed(evt);
            }
        });

        comprarCreatina.setBackground(new java.awt.Color(119, 255, 192));
        comprarCreatina.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        comprarCreatina.setText("Comprar");
        comprarCreatina.setBorder(null);
        comprarCreatina.setBorderPainted(false);
        comprarCreatina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarCreatinaActionPerformed(evt);
            }
        });

        detalhesPasta.setBackground(new java.awt.Color(209, 217, 228));
        detalhesPasta.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        detalhesPasta.setText("Detalhes");
        detalhesPasta.setBorder(null);
        detalhesPasta.setBorderPainted(false);
        detalhesPasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detalhesPastaActionPerformed(evt);
            }
        });

        detalhesWhey.setBackground(new java.awt.Color(209, 217, 228));
        detalhesWhey.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        detalhesWhey.setText("Detalhes");
        detalhesWhey.setBorder(null);
        detalhesWhey.setBorderPainted(false);
        detalhesWhey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detalhesWheyActionPerformed(evt);
            }
        });

        detalhesCreatina.setBackground(new java.awt.Color(209, 217, 228));
        detalhesCreatina.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        detalhesCreatina.setText("Detalhes");
        detalhesCreatina.setBorder(null);
        detalhesCreatina.setBorderPainted(false);
        detalhesCreatina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detalhesCreatinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Tela1Layout = new javax.swing.GroupLayout(Tela1);
        Tela1.setLayout(Tela1Layout);
        Tela1Layout.setHorizontalGroup(
            Tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Tela1Layout.createSequentialGroup()
                .addGroup(Tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tela1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(panelWhey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(Tela1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(Tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelDemo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Tela1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(comprarWhey, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(detalhesWhey, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(75, 75, 75)))
                .addGroup(Tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Tela1Layout.createSequentialGroup()
                        .addComponent(comprarCreatina, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(detalhesCreatina, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelCreatina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDemo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(Tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tela1Layout.createSequentialGroup()
                        .addComponent(comprarPasta, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(detalhesPasta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(panelDemo3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPasta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        Tela1Layout.setVerticalGroup(
            Tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tela1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelWhey, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCreatina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(Tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comprarWhey, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comprarPasta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comprarCreatina, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(detalhesPasta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(detalhesCreatina, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(detalhesWhey, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(Tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDemo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDemo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDemo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

    private void carrinhoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrinhoButtonActionPerformed
        new Carrinho().setVisible(true);
    }//GEN-LAST:event_carrinhoButtonActionPerformed

    private void comprarPastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarPastaActionPerformed
        ComprarPasta comprarPasta = new ComprarPasta();
        comprarPasta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_comprarPastaActionPerformed

    private void comprarWheyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarWheyActionPerformed
        ComprarWhey comprarWhey = new ComprarWhey();
        comprarWhey.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_comprarWheyActionPerformed

    private void comprarCreatinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarCreatinaActionPerformed
        ComprarCreatina comprarCreatina = new ComprarCreatina();
        comprarCreatina.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_comprarCreatinaActionPerformed

    private void detalhesPastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detalhesPastaActionPerformed
        JOptionPane.showMessageDialog(null, "Informações:\nid: " + 3 + "\nNome: " + pasta.getNome() + "\nDescrição: " + pasta.getDescricao());
    }//GEN-LAST:event_detalhesPastaActionPerformed

    private void detalhesWheyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detalhesWheyActionPerformed
        JOptionPane.showMessageDialog(null, "Informações:\nid: " + 1 + "\nNome: " + whey.getNome() + "\nDescrição: " + whey.getDescricao());
    }//GEN-LAST:event_detalhesWheyActionPerformed

    private void detalhesCreatinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detalhesCreatinaActionPerformed
        JOptionPane.showMessageDialog(null, "Informações:\nid: " + 2 + "\nNome: " + creatina.getNome() + "\nDescrição: " + creatina.getDescricao());
    }//GEN-LAST:event_detalhesCreatinaActionPerformed

    private void pedidosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidosButtonActionPerformed
        VendasDAO vendas = new VendasDAO();
        vendas.consultarTudo();
    }//GEN-LAST:event_pedidosButtonActionPerformed

    private void adicionarCarrinho2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarCarrinho2ActionPerformed
        objeto.inserirProduto(new Produto( "Creatina", "A Creatina auxilia na manutenção dos níveis de energia durante o treino", 1, "R$45,00"));
    }//GEN-LAST:event_adicionarCarrinho2ActionPerformed

    private void adicionarCarrinho1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarCarrinho1ActionPerformed
        objeto.inserirProduto(new Produto( "Whey Protein", "Whey Protein Growth é a proteína ideal para quem treina hipertrofia e quer ganhar massa muscular", 1, "R$99,00"));
    }//GEN-LAST:event_adicionarCarrinho1ActionPerformed

    private void adicionarCarrinho3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarCarrinho3ActionPerformed
        objeto.inserirProduto(new Produto( "Pasta de Amendoim", "O amendoim é um alimento de excelentes propriedades nutricionais; seus grãos contém 26% de proteínas, 46% de óleo, além de sais minerais e um leque de vitaminas e compostos antioxidantes", 1, "R$25,00"));
    }//GEN-LAST:event_adicionarCarrinho3ActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sairButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Loja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Loja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Tela1;
    private javax.swing.JButton adicionarCarrinho1;
    private javax.swing.JButton adicionarCarrinho2;
    private javax.swing.JButton adicionarCarrinho3;
    private javax.swing.JButton carrinhoButton;
    private javax.swing.JButton comprarCreatina;
    private javax.swing.JButton comprarPasta;
    private javax.swing.JButton comprarWhey;
    private javax.swing.JButton detalhesCreatina;
    private javax.swing.JButton detalhesPasta;
    private javax.swing.JButton detalhesWhey;
    private javax.swing.JPanel header;
    private javax.swing.JLabel imagemCreatina;
    private javax.swing.JLabel imagemPasta;
    private javax.swing.JLabel imagemWhey;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nomeCreatina;
    private javax.swing.JLabel nomePasta;
    private javax.swing.JLabel nomeWhey;
    private javax.swing.JPanel panelCreatina;
    private javax.swing.JPanel panelDemo1;
    private javax.swing.JPanel panelDemo2;
    private javax.swing.JPanel panelDemo3;
    private javax.swing.JPanel panelPasta;
    private javax.swing.JPanel panelWhey;
    private javax.swing.JButton pedidosButton;
    private javax.swing.JButton sairButton;
    private javax.swing.JLabel valorCreatina;
    private javax.swing.JLabel valorPasta;
    private javax.swing.JLabel valorWhey;
    // End of variables declaration//GEN-END:variables
}
