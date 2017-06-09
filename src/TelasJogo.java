
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class TelasJogo extends javax.swing.JFrame {

    private Application app;
    protected static int so;
    protected static Cadastro pessoa;
    private SpaceShip nave;
    private boolean aberto;
    public static JPanel painel;
    public static boolean jogoAberto = false;
    protected static JTextPane r;

    public TelasJogo(Cadastro pessoa, Application app) {
        this.so = 0;
        this.app = app;
        this.pessoa = new Cadastro();
        this.nave = nave;
        this.painel = new JPanel();
        setTitle("Space Combat Game");
        initComponents();
        setResizable(false);
        this.aberto = true;
        r = this.rank;
        instrucoes.setEnabled(false);
        tela1.setVisible(true);
        tela2.setVisible(false);
        tela3.setVisible(false);
        tela4.setVisible(false);

    }
    
    public TelasJogo() {

        initComponents();
        setResizable(false);

    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Application getApp() {
        return app;
    }

    public void setApp(Application app) {
        this.app = app;
    }

    public Cadastro getPessoa() {
        return pessoa;
    }

    public void setPessoa(Cadastro pessoa) {
        this.pessoa = pessoa;
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        tela1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tut = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        tela3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        gtnome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        gtfrase = new javax.swing.JTextArea();
        btsalvar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        voltar = new javax.swing.JLabel();
        linux = new javax.swing.JRadioButton();
        macos = new javax.swing.JRadioButton();
        nv1 = new javax.swing.JRadioButton();
        nv2 = new javax.swing.JRadioButton();
        nave1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tela4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        rank = new javax.swing.JTextPane();
        tela2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        instrucoes = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        tela1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/alien_nave_02.gif"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Luminari", 0, 44)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Space Combat Game");

        tut.setText("Como jogar");
        tut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutActionPerformed(evt);
            }
        });

        jButton2.setText("Jogar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Luminari", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));

        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Ranking");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tela1Layout = new javax.swing.GroupLayout(tela1);
        tela1.setLayout(tela1Layout);
        tela1Layout.setHorizontalGroup(
            tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(tela1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(337, 337, 337))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(32, 32, 32))))
        );
        tela1Layout.setVerticalGroup(
            tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addGroup(tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tut, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addGap(26, 26, 26))
        );

        getContentPane().add(tela1, "card2");

        tela3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel5.setFont(new java.awt.Font("Luminari", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Informações do jogador");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nome:");

        gtnome.setForeground(new java.awt.Color(204, 204, 204));
        gtnome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gtnomeMouseClicked(evt);
            }
        });
        gtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gtnomeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Frase de batalha:");

        gtfrase.setColumns(20);
        gtfrase.setForeground(new java.awt.Color(204, 204, 204));
        gtfrase.setRows(5);
        gtfrase.setText("\n");
        gtfrase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gtfraseMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(gtfrase);

        btsalvar.setText("Salvar");
        btsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalvarActionPerformed(evt);
            }
        });

        jButton1.setText("Iniciar Jogo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/v.png"))); // NOI18N
        voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarMouseClicked(evt);
            }
        });

        linux.setBackground(new java.awt.Color(0, 153, 153));
        linux.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        linux.setForeground(new java.awt.Color(255, 255, 255));
        linux.setText("Linux");
        linux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linuxActionPerformed(evt);
            }
        });

        macos.setBackground(new java.awt.Color(0, 153, 153));
        macos.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        macos.setForeground(new java.awt.Color(255, 255, 255));
        macos.setText("Mac Os");
        macos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                macosActionPerformed(evt);
            }
        });

        nv1.setBackground(new java.awt.Color(0, 153, 153));
        nv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nv1ActionPerformed(evt);
            }
        });

        nv2.setBackground(new java.awt.Color(0, 153, 153));
        nv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nv2ActionPerformed(evt);
            }
        });

        nave1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/spaceship2.gif"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/spaceship.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nave");

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Sistema");

        javax.swing.GroupLayout tela3Layout = new javax.swing.GroupLayout(tela3);
        tela3.setLayout(tela3Layout);
        tela3Layout.setHorizontalGroup(
            tela3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(voltar)
                .addGap(18, 18, 18)
                .addGroup(tela3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tela3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tela3Layout.createSequentialGroup()
                            .addComponent(nv2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                        .addGroup(tela3Layout.createSequentialGroup()
                            .addComponent(nv1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nave1)
                            .addGap(49, 49, 49)))
                    .addGroup(tela3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(9, 9, 9)))
                .addGroup(tela3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(macos)
                    .addComponent(linux)
                    .addComponent(jLabel14))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(tela3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(tela3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(tela3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tela3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tela3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela3Layout.createSequentialGroup()
                        .addComponent(btsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        tela3Layout.setVerticalGroup(
            tela3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addGap(44, 44, 44)
                .addGroup(tela3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tela3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tela3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(tela3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tela3Layout.createSequentialGroup()
                        .addGroup(tela3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(tela3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nv1)
                            .addComponent(nave1)
                            .addComponent(macos))
                        .addGap(18, 31, Short.MAX_VALUE)
                        .addGroup(tela3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(linux)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nv2)))
                    .addGroup(tela3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(tela3, "card3");

        tela4.setBackground(new java.awt.Color(0, 153, 153));

        jLabel9.setFont(new java.awt.Font("Apple Chancery", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("           Ranking");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/v.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jScrollPane4.setViewportView(rank);

        javax.swing.GroupLayout tela4Layout = new javax.swing.GroupLayout(tela4);
        tela4.setLayout(tela4Layout);
        tela4Layout.setHorizontalGroup(
            tela4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela4Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tela4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela4Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)))
                .addContainerGap())
        );
        tela4Layout.setVerticalGroup(
            tela4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(tela4, "card4");

        tela2.setBackground(new java.awt.Color(0, 153, 153));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        instrucoes.setColumns(20);
        instrucoes.setFont(new java.awt.Font("Apple Chancery", 0, 24)); // NOI18N
        instrucoes.setRows(5);
        instrucoes.setText("Destrua todos os alienígenas que\nestão invadindo seu planeta.\nTome cuidado, a medida que você\nos mata,eles vão ficando mais\n furiosos.\n\nBoa sorte!\n");
        jScrollPane1.setViewportView(instrucoes);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/v.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Luminari", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Instruções");

        javax.swing.GroupLayout tela2Layout = new javax.swing.GroupLayout(tela2);
        tela2.setLayout(tela2Layout);
        tela2Layout.setHorizontalGroup(
            tela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela2Layout.createSequentialGroup()
                .addGap(0, 68, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(tela2Layout.createSequentialGroup()
                .addGroup(tela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tela2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel3))
                    .addGroup(tela2Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tela2Layout.setVerticalGroup(
            tela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(tela2, "card5");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        nave1.setVisible(true);
        tela1.setVisible(false);
        tela2.setVisible(false);
        tela3.setVisible(true);
        tela4.setVisible(false);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void tutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutActionPerformed
        tela3.setVisible(false);
        tela1.setVisible(false);
        tela2.setVisible(true);
        tela4.setVisible(false);

    }//GEN-LAST:event_tutActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        tela3.setVisible(false);
        tela2.setVisible(false);
        tela1.setVisible(true);
        tela4.setVisible(false);

    }//GEN-LAST:event_jLabel3MouseClicked

    private void gtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gtnomeActionPerformed

    }//GEN-LAST:event_gtnomeActionPerformed

    private void btsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvarActionPerformed

        boolean aux = false;
        if (gtnome.getText().equals("") || gtfrase.getText().equals("")) {
            aux = false;
        } else {
            aux = true;
        }
        if (aux == true) {
            pessoa.setApelido(gtnome.getText());
            pessoa.setFrase(gtfrase.getText());
            pessoa.setSalvo(true);

            JOptionPane.showConfirmDialog(null, "Dados salvos com sucesso!", "Confirmação de Registro", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showConfirmDialog(null, "Preencha todos os campos apresentados!", "Erro de Registro", JOptionPane.PLAIN_MESSAGE);
        }


    }//GEN-LAST:event_btsalvarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String sistema = null;
         if(so == 1){
            sistema = "Mac Os X";          
        }else if(so == 2){
            sistema = "Linux";
        }
         if(!System.getProperty("os.name").equalsIgnoreCase(sistema) && this.so != 0){
                Map.timer_map.stop();
                JOptionPane.showMessageDialog(null,"Foi detectado que você selecionou o sistema errado ou que a pasta contendo os efeitos do jogo está ausente,o jogo será encerrado!","Alerta",JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
         }
        Audio play = new Audio();
        JLabel lbpontos = new JLabel();
        JLabel lblvidas = new JLabel();
        lbpontos.setText("Vidas: ");
        lblvidas.setText("Pontos: ");

        if (pessoa.getSalvo() && TelasJogo.so != 0 && SpaceShip.nave !=0 ) {
            if(so == 1){
                play.tocar("audio/play.wav");
            }
            setAberto(false);
            this.dispose();
            jogoAberto = true;
            painel.setBackground(Color.white);

            app.setVisible(true);
        } else {
            JOptionPane.showConfirmDialog(null, "É necessário salvar os dados antes de iniciar o jogo, selecionar o Sistema operacional e escolher uma nave!", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void gtnomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gtnomeMouseClicked
        gtnome.setText("");
    }//GEN-LAST:event_gtnomeMouseClicked

    private void gtfraseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gtfraseMouseClicked
        gtfrase.setText("");
    }//GEN-LAST:event_gtfraseMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        tela4.setVisible(true);
        tela2.setVisible(false);
        tela3.setVisible(false);
        tela1.setVisible(false);

        rank.setEnabled(false);
        FileReader arq = null;
        try {
            arq = new FileReader("dados.txt");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir arquivo.Um novo arquivo de registro será criado!","Erro",JOptionPane.PLAIN_MESSAGE);
        }
        BufferedReader lerArq = new BufferedReader(arq);

        String linha = null;
        try {
            linha = lerArq.readLine();
        } catch (IOException ex) {
            Logger.getLogger(TelasJogo.class.getName()).log(Level.SEVERE, null, ex);
        }
           OrdenaRanking ordena = new OrdenaRanking(); 
        try {
            ordena.ordenar();
        } catch (IOException ex) {
            System.out.println("Não ordenado!");
        }
        
        try {
            arq.close();
        } catch (IOException ex) {
            Logger.getLogger(TelasJogo.class.getName()).log(Level.SEVERE, null, ex);
        }
                    

        

    }//GEN-LAST:event_jButton4ActionPerformed

    private void voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarMouseClicked
        tela2.setVisible(false);
        tela3.setVisible(false);
        tela1.setVisible(true);
        nave1.setVisible(false);

        
    }//GEN-LAST:event_voltarMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        tela4.setVisible(false);
        tela1.setVisible(true);
        rank.setText("");
    }//GEN-LAST:event_jLabel10MouseClicked

    private void macosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_macosActionPerformed
        macos.setSelected(true);
        linux.setSelected(false);
        
        so = 1;
    }//GEN-LAST:event_macosActionPerformed

    private void linuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linuxActionPerformed
       linux.setSelected(true);
       macos.setSelected(false);
       JOptionPane.showMessageDialog(null,"Os efeitos sonoros serão desativados por não serem suportados em seu sistema!","Alerta",JOptionPane.PLAIN_MESSAGE);
      
       so = 2;
    }//GEN-LAST:event_linuxActionPerformed

    private void nv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nv1ActionPerformed
        SpaceShip.nave = 1;
        nv1.setSelected(true);
        nv2.setSelected(false);
    }//GEN-LAST:event_nv1ActionPerformed

    private void nv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nv2ActionPerformed
        SpaceShip.nave = 2;
        nv1.setSelected(false);
        nv2.setSelected(true);
    }//GEN-LAST:event_nv2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btsalvar;
    private javax.swing.JTextArea gtfrase;
    private javax.swing.JTextField gtnome;
    private javax.swing.JTextArea instrucoes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JRadioButton linux;
    private javax.swing.JRadioButton macos;
    private javax.swing.JLabel nave1;
    private javax.swing.JRadioButton nv1;
    private javax.swing.JRadioButton nv2;
    private javax.swing.JTextPane rank;
    private javax.swing.JPanel tela1;
    private javax.swing.JPanel tela2;
    private javax.swing.JPanel tela3;
    private javax.swing.JPanel tela4;
    private javax.swing.JButton tut;
    private javax.swing.JLabel voltar;
    // End of variables declaration//GEN-END:variables
}
