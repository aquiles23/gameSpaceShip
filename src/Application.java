
import java.awt.EventQueue;
import javax.swing.JFrame;


public class Application extends JFrame {
          protected static int som;
    public Application() {
        Application.som = 1;
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
          
           app.add(mapa);
           telas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           telas.setLocationRelativeTo(null);
           telas.setVisible(true);
          
      EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
           Audio inicial = new Audio();
           inicial.tocar("audio/ufo.wav");
        
          }
        });
         
       
    }

}
