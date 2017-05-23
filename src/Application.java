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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;


public class Application extends JFrame {
       
    public Application() {
        
        //add(new Map());
        
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
//           Application score = new Application();
     
           Map mapa = new Map(app,pessoa);
           TelasJogo telas = new TelasJogo(pessoa,app);
           Audio inicial = new Audio();
           app.add(mapa);
   
          
      EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
           
           inicial.tocar("audio/ufo.wav");
           telas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           telas.setLocationRelativeTo(null);
           telas.setVisible(true);
          }
        });
         
       
    }
}
