
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;


public class Audio {
        private int controle;
        protected static int controlesoerrado;
        protected static String so;
        
        Audio(){
            this.controle=0;
            this.controlesoerrado=0;
          
           
        }
     

    public void tocar(String soundName) {
       
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            if(controle == 0 && controlesoerrado == 0 && Application.som > 0 && (!System.getProperty("os.name").equalsIgnoreCase("Mac Os X"))){
                JOptionPane.showMessageDialog(null,"Esse jogo foi projetado para Mac Os,pode ser que algumas telas do jogo e efeitos sonoros fiquem desformatados ou não funcionem em outros sistemas!","Alerta",JOptionPane.PLAIN_MESSAGE);          
                Application.som = -1;
                controle++;
            }

        }
    }

    
}
