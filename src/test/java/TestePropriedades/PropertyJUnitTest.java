package TestePropriedades;

import java.io.IOException;
import java.util.Properties;
import spam.PropertiesGenerator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gustavo
 */
public class PropertyJUnitTest {
    
    Properties p;
    public PropertyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        p=new Properties();
    }
    
    @After
    public void tearDown() {
        p=null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testPropertiesPort() throws IOException{
        PropertiesGenerator pg=new PropertiesGenerator();
        p=pg.getProp();
        
        assertEquals(p.getProperty("mail.smtp.port"), "587");
        
    }
    
    @Test
    public void testStartTls() throws IOException{
        PropertiesGenerator pg=new PropertiesGenerator();
        p=pg.getProp();
        
        assertEquals(p.getProperty("mail.smtp.starttls.enable"), "true");
    }
    
}
