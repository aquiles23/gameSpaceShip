
import java.awt.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author eduardojunio
 */
public class Movimento extends JPanel implements ActionListener, KeyListener {
    Timer tempo = new Timer(5,this);
    //SpaceShip nav = new SpaceShip(0,0);
    int x=0,y=0,vx=0,vy=0;
    
    public Movimento(){
        tempo.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }
    
    
    public void init(){
      
    }
    


    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
         g.setColor(Color.GREEN);         
         g.fillRect(x, y, 50, 40);
    }
    
 
    public void actionPerformed(ActionEvent e) {
        if(x<0){
            vx=0;
            x=0;
        }
        if(x>370){
            vx=0;
            x=370;
        }
        if(y<0){
            vy=0;
            y=0;
        }
        if(y>480){
            vy=0;
            y=480;
        }
      x = x + vx;
      y = y + vy;
      repaint();
    }

   
    @Override
      public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        //SpaceShip n = new SpaceShip(0,0);
        // Set speed to move to the left
        if (key == KeyEvent.VK_LEFT) { 
           vx = -1;
        }

        // Set speed to move to the right
        if (key == KeyEvent.VK_RIGHT) {
            vx = 1;
        }
        
        // Set speed to move to up and set thrust effect
        if (key == KeyEvent.VK_UP) {
            vy = -1;
            //thrust();
        }
        
        // Set speed to move to down
        if (key == KeyEvent.VK_DOWN) {
            vy = 1;
        }

        
    }
    
public static void main(String[] args) {
       Movimento ver = new Movimento();
       JFrame form = new JFrame();
        
        form.setTitle("Space Combat Game");
        form.setSize(600,500);
        form.setVisible(true);
        //form.setResizable(false);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //form.setLocationRelativeTo(null);
         form.add(ver);
       
       
       


   
         
       
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //To change body of generated methods, choose Tools | Templates.
    }

}
