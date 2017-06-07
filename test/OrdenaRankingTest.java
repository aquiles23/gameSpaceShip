
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class OrdenaRankingTest {
    
    public OrdenaRankingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testOrdenar() throws Exception {
       OrdenaRanking ordena = new OrdenaRanking();
       ordena.ordenar();
    }
    
}
