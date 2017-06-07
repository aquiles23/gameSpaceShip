
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
 

public class OrdenaRanking {
        public static ArrayList <String> listaFinal;
        public static ArrayList <String> lista ; 

    public void ordenar() throws IOException{

      listaFinal = new ArrayList();
      lista = new ArrayList(); 
       String nome;
       String pontos;
       int l;
       FileReader arq=new FileReader("dados.txt");
       BufferedReader lerArq = new BufferedReader(arq);
       String linha ="" ;
       linha = lerArq.readLine();
       
       while(linha != null){
         nome =  linha.substring(0,linha.length());
         pontos = linha.substring(linha.indexOf("-")+1,linha.length());
         
         lista.add(pontos+" "+nome);
         Collections.sort(lista);
         linha = lerArq.readLine();

       }
         String aux2;
         int a=0;
         while(a < lista.size()){
            aux2 = lista.get(a).substring(lista.get(a).indexOf(" ")+1,lista.get(a).length());
            listaFinal.add(aux2);
            linha = lerArq.readLine();
            a++;
         }       
       for(int i=lista.size()-1;i>=0;i--){
           TelasJogo.rank.setText(TelasJogo.rank.getText() + listaFinal.get(i) + "\n");  
       }
    
    }

}