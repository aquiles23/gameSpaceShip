
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Image;
import static java.lang.Math.random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JLabel;

public class Map extends JPanel implements ActionListener {

    private final int SPACESHIP_X = 220;
    private final int SPACESHIP_Y = 430;
    private final Timer timer_map;


    private final Image background;
    private final SpaceShip spaceship;
    private int cont=0;
    
    public Map() {

        addKeyListener(new KeyListerner());

        setFocusable(true);
        setDoubleBuffered(true);
        ImageIcon image = new ImageIcon("images/space.jpg");
        this.background = image.getImage();

        spaceship = new SpaceShip(SPACESHIP_X, SPACESHIP_Y);
        

        timer_map = new Timer(Game.getDelay(), this);
        timer_map.start();
        

 

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
int a=0,p=0,b=0,dif=3,l1=3,l2=6;
    private void draw(Graphics g) throws InterruptedException {

//        if(a == 0){
//            spaceship.aliens.add(new Alien(p,0));
//        }
        //spaceship.aliens.add(new Alien(p,0));
        // Draw spaceship
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
       
       if(spaceship.cont==0){
    System.out.println(b);
            for(int i=0;i<dif;i++){   
                if(p>=400){
                    p=0;
                }else{
                p+=40;
                }
            spaceship.aliens.add(new Alien(p,0));
            if(spaceship.q == 3){
                spaceship.aliens.get(i).loadImage("images/alien_MEDIUM.png");   
                         
            }
            if(spaceship.q == 6){
                spaceship.aliens.get(i).loadImage("images/alien_HARD.png");   
                         
            }
            }   
       
            spaceship.cont=1;
            //b++;
            if(spaceship.q >= l1){
                dif=dif+1;
                
            }
            if(spaceship.q >=l2){
                dif = dif+2;
                
            }
       }
       }
     
    

    @Override
    public void actionPerformed(ActionEvent e) {

        updateSpaceship();

        repaint();
    }

    private void dranMissionAccomplished(Graphics g) {

        String message = "MISSION ACCOMPLISHED";
        Font font = new Font("Helvetica", Font.BOLD, 14);
        FontMetrics metric = getFontMetrics(font);

        g.setColor(Color.white);
        g.setFont(font);
        g.drawString(message, (Game.getWidth() - metric.stringWidth(message)) / 2, Game.getHeight() / 2);
    }

    private void drawGameOver(Graphics g) {

        String message = "Game Over";
        Font font = new Font("Helvetica", Font.BOLD, 14);
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
