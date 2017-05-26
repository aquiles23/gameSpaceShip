
import java.awt.EventQueue;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Application extends JFrame {
          protected static int som;
    public Application() {
        this.som = 1;
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
