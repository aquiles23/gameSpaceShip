public class MinhaThreads implements Runnable {
     protected String audio;
     protected Audio som;
     
     public MinhaThreads(String end ){
         this.audio=end;
         som = new Audio();
     }
    @Override
    public void run() {
        som.tocar(audio);
    } 
}
