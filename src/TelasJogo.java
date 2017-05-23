
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TelasJogo extends javax.swing.JFrame {

    private Application app;
    protected static Cadastro pessoa;
    private SpaceShip nave;
    private boolean aberto;
    public static JFrame back;
    public static JLabel points;
    public static JPanel painel;
    public static JLabel life;
    public static boolean jogoAberto = false;
  

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

    public TelasJogo(Cadastro pessoa, Application app) {
        this.points = new JLabel();
        this.life = new JLabel();
        this.back = new JFrame();
        this.app = app;
        this.pessoa = new Cadastro();
        this.nave = nave;
        this.painel = new JPanel();
        setTitle("Space Combat Game");
        initComponents();
        setResizable(false);
        this.aberto = true;
        points.setText("0"); 
        life.setText(Integer.toString(SpaceShip.vidas));
        back.setResizable(false);
 
        tela1.setVisible(true);
        tela2.setVisible(false);
        tela3.setVisible(false);
        tela4.setVisible(false);
      
     
    }

  

    public TelasJogo() {
        this.back = new JFrame();
        initComponents();
        setResizable(false);

    }

    public JFrame getBack() {
        return back;
    }

    public void setBack(JFrame back) {
        this.back = back;
    }

    public JLabel getPoints() {
        return points;
    }

    public void setPoints(JLabel points) {
        this.points = points;
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        tela4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        rank = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tela2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));

        tela1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/alien_nave_02.gif"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Luminari", 0, 48)); // NOI18N
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
        jLabel8.setText("Criado por Eduardo Junio");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela1Layout.createSequentialGroup()
                        .addGroup(tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addGroup(tela1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(tut, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela1Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(79, 79, 79))))
            .addGroup(tela1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        tela1Layout.setVerticalGroup(
            tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(47, 47, 47)
                .addGroup(tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tut, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addGap(26, 26, 26))
        );

        tela3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel5.setFont(new java.awt.Font("Apple Chancery", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Informações do jogador");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nome:");

        gtnome.setForeground(new java.awt.Color(204, 204, 204));
        gtnome.setText("Digite o nome do seu personagem");
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
        gtfrase.setText("Digite uma frase ");
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

        javax.swing.GroupLayout tela3Layout = new javax.swing.GroupLayout(tela3);
        tela3.setLayout(tela3Layout);
        tela3Layout.setHorizontalGroup(
            tela3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(tela3Layout.createSequentialGroup()
                .addGroup(tela3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(jScrollPane2))))
                    .addGroup(tela3Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tela3Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(voltar)))
                .addGap(55, 55, 55))
        );
        tela3Layout.setVerticalGroup(
            tela3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addGap(45, 45, 45)
                .addGroup(tela3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tela3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tela3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        tela4.setBackground(new java.awt.Color(0, 153, 153));

        jScrollPane3.setViewportView(rank);

        jLabel9.setFont(new java.awt.Font("Apple Chancery", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("           Ranking");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/v.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tela4Layout = new javax.swing.GroupLayout(tela4);
        tela4.setLayout(tela4Layout);
        tela4Layout.setHorizontalGroup(
            tela4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tela4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela4Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela4Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))))
            .addGroup(tela4Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        tela4Layout.setVerticalGroup(
            tela4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        tela2.setBackground(new java.awt.Color(0, 153, 153));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea1.setBackground(new java.awt.Color(0, 153, 153));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Apple Chancery", 0, 24)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("Destrua a maior quantidade de \nalienigenas que conseguir e \nsalve o planeta Ecrypton.\nTome cuidado,a cada nivel os\nalienigenas vão ficando mais \nfuriosos!\n\n\n\n");
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/v.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Apple Chancery", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Instruções");

        javax.swing.GroupLayout tela2Layout = new javax.swing.GroupLayout(tela2);
        tela2.setLayout(tela2Layout);
        tela2Layout.setHorizontalGroup(
            tela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela2Layout.createSequentialGroup()
                .addGroup(tela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tela2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel3))
                    .addGroup(tela2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tela2Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        tela2Layout.setVerticalGroup(
            tela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tela3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tela1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tela4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tela2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tela1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tela4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tela3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tela2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//           
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
            
            JOptionPane.showConfirmDialog(null, "Dados salvos com sucesso!", "Confirmação de Cadastro", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showConfirmDialog(null, "Preencha todos os campos do cadastro!", "Erro de Cadastro", JOptionPane.PLAIN_MESSAGE);
        }
      

    }//GEN-LAST:event_btsalvarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Audio play = new Audio();
        JLabel lbpontos = new JLabel();
        JLabel lblvidas = new JLabel();
        lbpontos.setText("Vidas: ");
        lblvidas.setText("Pontos: ");
       
        if (pessoa.getSalvo()) {
             play.tocar("audio/play.wav");
            setAberto(false);
            this.dispose();
            jogoAberto = true;
             painel.setBackground(Color.white);
             back.add(painel);
            
             painel.add(lbpontos);
             painel.add(life);
             painel.add(lblvidas);
             painel.add(points);
             
             
             life.setAlignmentX(lblvidas.getAlignmentX()+20);
             life.setAlignmentY(lblvidas.getAlignmentY()+20);
             if(TelasJogo.jogoAberto == true){
              back.setLocationRelativeTo(null);
              back.setSize(50, 100);
              back.setTitle("Pontuacao");

              back.setVisible(true);
              back.setLocation(new Application().getX()-80, new Application().getY());
              back.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
             }
              
                
                app.setVisible(true);
        } else {
            JOptionPane.showConfirmDialog(null, "É necessário salvar os dados antes de iniciar o jogo!", "Alerta", JOptionPane.WARNING_MESSAGE);
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
       
      
    }//GEN-LAST:event_jButton4ActionPerformed

    private void voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarMouseClicked
        tela2.setVisible(false);
        tela1.setVisible(true);
    }//GEN-LAST:event_voltarMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        tela4.setVisible(false);
        tela1.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btsalvar;
    private javax.swing.JTextArea gtfrase;
    private javax.swing.JTextField gtnome;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JList<String> rank;
    private javax.swing.JPanel tela1;
    private javax.swing.JPanel tela2;
    private javax.swing.JPanel tela3;
    private javax.swing.JPanel tela4;
    private javax.swing.JButton tut;
    private javax.swing.JLabel voltar;
    // End of variables declaration//GEN-END:variables
}
