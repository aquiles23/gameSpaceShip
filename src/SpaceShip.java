
import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
import java.awt.Graphics;
import java.awt.List;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.Timer;

public class SpaceShip extends Sprite {
    
    private static final int MAX_SPEED_X = 2;
    private static final int MAX_SPEED_Y = 1;
   
    private int speed_x;
    private int speed_y;
    protected Missil missil;
    //protected Alien alien,alien2;
    protected ArrayList <Alien> aliens;
    protected int aux,cont=0,q=0;

    public int getSpeed_x() {
        return speed_x;
    }

    public void setSpeed_x(int speed_x) {
        this.speed_x = speed_x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSpeed_y() {
        return speed_y;
    }

    public void setSpeed_y(int speed_y) {
        this.speed_y = speed_y;
    }
    

    public SpaceShip(int x, int y) {
        super(x, y);
         aliens = new ArrayList();
        aux=0;
        missil = new Missil(x,y);
        //alien = new Alien(0,0);
        //alien2 = new Alien(20,20);
        initSpaceShip();
    }


    private void initSpaceShip() {
        
        noThrust();
        
    }
    
    private void noThrust(){
        loadImage("images/spaceship.png"); 
    }
    
    private void thrust(){
        loadImage("images/spaceship_thrust.png"); 
    }    

    public void move() {
      
        // Limits the movement of the spaceship to the side edges.
        if((speed_x < 0 && x <= 0) || (speed_x > 0 && x + width >= Game.getWidth())){
            speed_x = 0;
        }
        
        // Moves the spaceship on the horizontal axis
        x += speed_x;
        
        // Limits the movement of the spaceship to the vertical edges.
        if((speed_y < 0 && y <= 0) || (speed_y > 0 && y + height >= Game.getHeight())){
            speed_y = 0;
        }

        // Moves the spaceship on the verical axis
        y += speed_y;
        
    }

    public void keyPressed(KeyEvent e) throws InterruptedException {

        int key = e.getKeyCode();
        
        // Set speed to move to the left
        if (key == KeyEvent.VK_LEFT) { 
            speed_x = -1 * MAX_SPEED_X;
        }

        // Set speed to move to the right
        if (key == KeyEvent.VK_RIGHT) {
            speed_x = MAX_SPEED_X;
        }
        
        // Set speed to move to up and set thrust effect
        if (key == KeyEvent.VK_UP) {
            speed_y = -1 * MAX_SPEED_Y;
            thrust();
        }
        
        // Set speed to move to down
        if (key == KeyEvent.VK_DOWN) {
            speed_y = MAX_SPEED_Y;
        }
           if(key == KeyEvent.VK_SPACE){
              aux = 1;
              
              missil.setX(x);
              if(missil.getY()<=0){
                  missil.setY(y);
              }

              for(int i=0;i<aliens.size();i++){
              if(aliens.get(i).getX() == missil.getX()){
                      aliens.get(i).loadImage("images/explosion.png");   
                      aliens.remove(i);
                      
                      q++;
                      if(q==3){
                          cont=0;
                      }
                      if(q==6){
                          cont=0;
                      }
                        if(q>=9){
                          cont=0;
                          
                      }
                 }
                
              }
              System.out.println("aaaa");
        }
        
    }
    
    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT) {
            speed_x = 0;
        }

        if (key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN) {
            speed_y = 0;
            noThrust();
        }
    }
}