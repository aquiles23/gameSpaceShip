import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Application extends JFrame {
    
    public Application() {

        add(new Map());

        setSize(Game.getWidth(), Game.getHeight());

        setTitle("Space Combat Game");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(false);
    }
    
    public static void main(String[] args) {
           Cadastro pessoa = new Cadastro();
           Application app = new Application();
           TelasJogo telas = new TelasJogo(pessoa,app);
       
           
            
      EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
          
          
           telas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           telas.setLocationRelativeTo(null);
           telas.setVisible(true);
    
            }
        });
         
       
    }
}
