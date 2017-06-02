
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class SpaceShip extends Sprite {
    
    private static final int MAX_SPEED_X = 3;
    private static final int MAX_SPEED_Y = 2;
    
    private int speed_x;
    private int speed_y;
    protected static boolean pausado;
    protected Missil missil;
    protected ArrayList <Alien> aliens;
    protected Audio tiro;
    protected  static  int vidas;
    protected  static int pontos;
    protected Application app;
    protected static boolean vivo;
    protected int aux,cont=0,q=0;
    protected static int nave;

    
    
    public SpaceShip(int x, int y) {
        super(x, y);
        this.vivo = true;
        this.vidas = 5;
        this.nave = 0;
        this.app = app;
        this.aliens = new ArrayList();
        this.aux=0;
        this.missil = new Missil(x,y);
        this.pontos = 0;
        this.tiro = new Audio();
        this.pausado = false;
        initSpaceShip();
    }
    public int getSpeed_x() {
        return speed_x;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
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
    



    private void initSpaceShip() {
        
        noThrust();
        
    }
    
    private void noThrust(){
        
        loadImage("images/go1.png");
     
     
        if(nave == 1 ){
         loadImage("images/spaceship21.png"); 
        }else if(nave == 2){
         loadImage("images/spaceship.png");   
        }
    }
    
    private void thrust(){
        
        if(nave == 1){
           loadImage("images/spaceship2.png"); 
        }else if(nave==2){
           loadImage("images/spaceship_thrust.png"); 
        }
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
    int controle = 0;
    
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
        if(key == KeyEvent.VK_P && SpaceShip.vidas > 0){
            if(pausado == false){
                Map.timer_map.stop();
                this.pausado = true;
            }else if(pausado == true){ 
                Map.timer_map.start();
                this.pausado = false;        
            }
        }
           if(key == KeyEvent.VK_SPACE){
              aux = 1;
              if(TelasJogo.so == 1){ 
                 tiro.tocar("audio/tiro.wav");
              }
              missil.setX(x);
              if(missil.getY()<=0){
                  missil.setY(y);
              }
              colisaoMissilAlien();
        }
        if(controle == 0){
          noThrust();
          controle++;
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
    private void colisaoMissilAlien(){
        
        for(int i=0;i<aliens.size();i++){
            if(((aliens.get(i).getX() == missil.getX()-20) ||(aliens.get(i).getX() == missil.getX()-19) ||(aliens.get(i).getX() == missil.getX()-18) ||(aliens.get(i).getX() == missil.getX()-17) ||(aliens.get(i).getX() == missil.getX()-16) ||(aliens.get(i).getX() == missil.getX()-15) ||(aliens.get(i).getX() == missil.getX()-14) ||(aliens.get(i).getX() == missil.getX()-13) ||(aliens.get(i).getX() == missil.getX()-12) ||(aliens.get(i).getX() == missil.getX()-11) ||(aliens.get(i).getX() == missil.getX()-10) ||(aliens.get(i).getX() == missil.getX()-9) ||(aliens.get(i).getX() == missil.getX()-8) ||(aliens.get(i).getX() == missil.getX()-7) ||(aliens.get(i).getX() == missil.getX()-6) ||(aliens.get(i).getX() == missil.getX()-3)||(aliens.get(i).getX() == missil.getX()-4) ||(aliens.get(i).getX() == missil.getX()-5) || (aliens.get(i).getX() == missil.getX()-2) || (aliens.get(i).getX() == missil.getX()-1) || (aliens.get(i).getX() == missil.getX()) || (aliens.get(i).getX()+1 == missil.getX()) || (aliens.get(i).getX() == missil.getX()+2) || (aliens.get(i).getX()+3 == missil.getX()) || (aliens.get(i).getX()+4 == missil.getX()) || (aliens.get(i).getX()+5 == missil.getX())|| (aliens.get(i).getX()+6 == missil.getX()) || (aliens.get(i).getX()+7 == missil.getX()) || (aliens.get(i).getX()+8 == missil.getX())|| (aliens.get(i).getX()+9 == missil.getX()) || (aliens.get(i).getX()+10 == missil.getX())|| (aliens.get(i).getX()+11 == missil.getX())
                 || (aliens.get(i).getX()+12 == missil.getX()) || (aliens.get(i).getX()+13 == missil.getX()) || (aliens.get(i).getX()+14 == missil.getX())||(aliens.get(i).getX()+15 == missil.getX()) || (aliens.get(i).getX()+16 == missil.getX()) || (aliens.get(i).getX()+17 == missil.getX())|| (aliens.get(i).getX()+18 == missil.getX()) || (aliens.get(i).getX()+19 == missil.getX()) || (aliens.get(i).getX()+20 == missil.getX())) && (aliens.get(i).getY() < missil.getY())){
                aliens.get(i).loadImage("images/explosion.png");
                aliens.remove(i);
                pontos++;
                q++;
                    if((q==50) || (q==100) || (q==150) || (q==200) || (aliens.isEmpty())){
                         cont=0;
                    }               
                 }  
        }
    }
}