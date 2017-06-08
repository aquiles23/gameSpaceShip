
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eduardojunio
 */
public class CadastroTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
   
    @Test
    public void testGetApelido() {
        String apelido = "eduardo";
        Cadastro instance = new Cadastro();
        instance.setApelido(apelido);
        assertEquals("eduardo",instance.getApelido());
    }

   
    @Test
    public void testSetApelido() {
        
        String apelido = "eduardo";
        Cadastro instance = new Cadastro();
        instance.setApelido(apelido);
      
    }

    @Test
    public void testGetVitorias() {
        int vitorias = 150;
        Cadastro instance = new Cadastro();
        instance.setVitorias(vitorias);
        assertEquals(150,instance.getVitorias());
    }

    @Test
    public void testSetVitorias() {   
        int vitorias = 0;
        Cadastro instance = new Cadastro();
        instance.setVitorias(vitorias);
    }


    @Test
    public void testIsVivo() {
         boolean vivo = false;
        Cadastro instance = new Cadastro();
        instance.setVivo(vivo);
        assertEquals(false,instance.isGanhou());
    }

    @Test
    public void testSetVivo() {
        boolean vivo = false;
        Cadastro instance = new Cadastro();
        instance.setVivo(vivo);
    
       
    }


    @Test
    public void testIsGanhou() {
       
         boolean ganhou = false;
        Cadastro instance = new Cadastro();
        instance.setGanhou(ganhou);
        assertEquals(false,instance.isGanhou());
       
    }

    @Test
    public void testSetGanhou() {
      
        boolean ganhou = false;
        Cadastro instance = new Cadastro();
        instance.setGanhou(ganhou);

    }
    
}
