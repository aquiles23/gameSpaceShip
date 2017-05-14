
import static java.lang.Math.random;


public class Alien extends Sprite {
    int s1,s2;
    public Alien(int x,int y) {
       
        super(x,y);
        s1=x;
        s2=y;
       
        loadImage("images/alien_EASY.png");
    }
    public void posicionar() throws InterruptedException{
        //Thread.sleep(5);
        setX(getX());
        setY(getY()+1);
        if(getY() == Game.getHeight()){
            setX(s1);
            setY(0);
        }
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
    
}
