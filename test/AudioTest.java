
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AudioTest {
        
    @Test
    public void testTocar() {
        Audio test = new Audio();
        test.tocar("audio/play.wav");
    }
    
}
