
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Image;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Map extends JPanel implements ActionListener {

    private final int SPACESHIP_X = 220;
    private final int SPACESHIP_Y = 430;
    protected static  Timer timer_map;


    private  Image background;
    private final SpaceShip spaceship;
    private JLabel pontos;
    private boolean status;
    private Application app;
    private Cadastro pessoa;
    public boolean paused;
    public static  FileWriter arq;
    private int cont=0;
    private ImageIcon image3,image4;
    
    public Map(Application app,Cadastro pessoa) {
        this.app = app;
        this.pessoa = pessoa;
        this.status = true;
        addKeyListener(new KeyListerner());
        paused = false;
        setFocusable(true);
        setDoubleBuffered(true);
        ImageIcon image = new ImageIcon("images/space.jpg");
        this.background = image.getImage();
        spaceship = new SpaceShip(SPACESHIP_X, SPACESHIP_Y);

        timer_map = new Timer(Game.getDelay(), this);
        timer_map.start();
        image3 = new ImageIcon("images/inva.jpg");
        image4 = new ImageIcon("images/vit.jpg");     
    }
    

    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(this.background, 0, 0, null);
        try {
            draw(g);
        } catch (InterruptedException ex) {
            Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
        }

        Toolkit.getDefaultToolkit().sync();

    }
int p=0,dif=3,l1=50,x=0,y,contr=0,controle=0;
private void draw(Graphics g) throws InterruptedException {
       g.drawImage(spaceship.getImage(), spaceship.getX(), spaceship.getY(), this);
        for(int i=0;i<spaceship.aliens.size();i++){
            g.drawImage(spaceship.aliens.get(i).getImage(), spaceship.aliens.get(i).getX(), spaceship.aliens.get(i).getY(), this);
               spaceship.aliens.get(i).posicionar();
        }
        if(spaceship.aux == 1){
            g.drawImage(spaceship.missil.getImage(), spaceship.getX(), spaceship.missil.getY(), this);
                for(int i=0;i<spaceship.aliens.size();i++){
                    g.drawImage(spaceship.aliens.get(i).getImage(), spaceship.aliens.get(i).getX(), spaceship.aliens.get(i).getY(), this);
                }
            spaceship.missil.setX(spaceship.missil.getX());
            spaceship.missil.setY(spaceship.missil.getY()-80);
        }
        for(int i=0;i<spaceship.aliens.size();i++){
            if(spaceship.aliens.get(i).getY() == 499){
                spaceship.vidas--;
            }
        }
       dificuldade(); 
       statusDoJogo(g);
       pontuacao(g);
       explosaoColisao();
   
       if((SpaceShip.pausado == true)){
           pausa(g);
       }
}
    public void dificuldade(){
        if(spaceship.cont==0){
          for(int i=0;i<dif;i++){   
            if(p>=400){
                p=0;
            }else{
                p+=40;
            }   
              x = (int)(Math.random()*450);
              y=  (int)(Math.random()*1);
              spaceship.aliens.add(new Alien(x,y));
              
                if(spaceship.q > 50 && spaceship.q < 100){
                  spaceship.aliens.get(i).loadImage("images/alien_MEDIUM.png");  
                  ImageIcon image2 = new ImageIcon("images/space3.jpg");
                  this.background = image2.getImage();   
                }
                if(spaceship.q >= 100){
                    spaceship.aliens.get(i).loadImage("images/alien_HARD.png");        
                    ImageIcon image2 = new ImageIcon("images/space2.jpg");
                    this.background = image2.getImage(); 
                }
          }   
            spaceship.cont=1;
            if(spaceship.q >= l1){
                dif=dif+1;
                l1+=l1+10;                
            }else{
                dif = dif;
            }
       }
    }
    public void statusDoJogo(Graphics g){
          if(SpaceShip.vidas <= 0 ){
          this.status=false;
          SpaceShip.vidas = 0;
          drawGameOver(g);
          if(controle <= 0){
            gravaArq();
          }
       }
       if(spaceship.pontos > 300 && SpaceShip.vidas > 0){
           if(contr <= 0){
                 gravaArq();
           }
           dranMissionAccomplished(g);   
       }
    }
   public void explosaoColisao(){
        for(int i=0;i<spaceship.aliens.size();i++ ){
           if(spaceship.aliens.get(i).getBounds().intersects(spaceship.getBounds())){
              spaceship.loadImage("images/explosion.png");
              SpaceShip.vidas = 0;
              this.background = image3.getImage(); 
           }
       }
    }
    public void pontuacao(Graphics g){
        String auxLife = Integer.toString(SpaceShip.vidas);
        String auxPontos = Integer.toString(SpaceShip.pontos);
        
         String message = "Vidas: "+auxLife;
         String message2 ="Pontuacao: "+auxPontos;
         String message3 ="[P] pausar";
        Font font = new Font("Helvetica", Font.BOLD, 14);
        FontMetrics metric = getFontMetrics(font);

        g.setColor(Color.white);
        g.setFont(font);
        g.drawString(message, (metric.stringWidth(message))-40, Game.getHeight()-480);
        g.drawString(message2, (metric.stringWidth(message))-40, Game.getHeight()-455);   
        g.drawString(message3, (metric.stringWidth(message))+360, Game.getHeight()-480);   
    }
     
   public void gravaArq(){
          try {
           arq = new FileWriter("dados.txt",true);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Não foi encontrado o arquivos contendo os dados!","Erro",JOptionPane.PLAIN_MESSAGE);
        }
          PrintWriter gravar = new PrintWriter(arq);
          gravar.println(TelasJogo.pessoa.getApelido()+" __________________ "+SpaceShip.pontos);
             try {
            arq.close();
        } catch (IOException ex) {
            
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        updateSpaceship();

        repaint();
    }

    private void dranMissionAccomplished(Graphics g) {

        Audio vitoria = new Audio();
        if(TelasJogo.so == 1){
            vitoria.tocar("audio/vitoria.wav");
        }    
        String message = "Parabéns,voce salvou o seu planeta";
        Font font = new Font("Helvetica", Font.BOLD, 28);
        FontMetrics metric = getFontMetrics(font);

        g.setColor(Color.white);
        g.setFont(font);
        g.drawString(message, (Game.getWidth() - metric.stringWidth(message)) / 2, Game.getHeight() / 2);
        
           if(contr>0){
           contr=0; 
           timer_map.stop();    
        }else{
           this.background = image4.getImage();
           contr++;
        }
       
    }
   
    private void drawGameOver(Graphics g) {
               
        Audio loser = new Audio();
        if(TelasJogo.so == 1){
            Audio.controlesoerrado = 1;
            loser.tocar("audio/derrota.wav");
        }
        String message = "Game Over";
        Font font = new Font("Helvetica", Font.BOLD, 32);
        FontMetrics metric = getFontMetrics(font);
        g.setColor(Color.white);
        g.setFont(font);
        g.drawString(message, (Game.getWidth() - metric.stringWidth(message)) / 2, Game.getHeight() / 2);
        
        msgDerrota(g);
        if(controle>0){
           controle=0; 
           timer_map.stop();    
        }else{
           this.background = image3.getImage();
           controle++;
        }
    }
    private void msgDerrota(Graphics g){
             
         String message3 = "Seu planeta foi invadido.";
         Font font = new Font("Luminari", Font.BOLD, 22);
         FontMetrics metric = getFontMetrics(font);
         g.setColor(Color.white);
         g.setFont(font);
         g.setFont(font);
         g.drawString(message3,150,350);
    }
      public void pausa(Graphics g){
    
        String message = "Jogo pausado!";
        Font font = new Font("Helvetica", Font.BOLD, 28);
        FontMetrics metric = getFontMetrics(font);

        g.setColor(Color.white);
        g.setFont(font);
        g.drawString(message, (Game.getWidth() - metric.stringWidth(message)) / 2, Game.getHeight() / 2);

}
 
    private void updateSpaceship() {
        spaceship.move();
    }

    private class KeyListerner extends KeyAdapter {
        
        @Override
        public void keyPressed(KeyEvent e) {
            try {
                spaceship.keyPressed(e);
            } catch (InterruptedException ex) {
                Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            spaceship.keyReleased(e);
        }   
    }
}
