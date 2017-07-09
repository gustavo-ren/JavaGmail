package spam;

import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import java.util.Properties;
import javax.mail.internet.MimeMessage;
/**
 *
 * @author Gustavo
 */
public class MessageFactory {
    
    /**
     *
     * @param to
     * @param from
     * @param subject
     * @param body
     * @return
     */
    public MimeMessage createMessage(String to, String from, String subject, String body) throws MessagingException{
        
        Properties props=new Properties();
        
        
        
        return null;
    }
}
