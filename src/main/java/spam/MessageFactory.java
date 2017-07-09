package spam;

import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import java.io.IOException;
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
    public MimeMessage createMessage(String to, String from, String subject, String body) throws MessagingException {

        Properties props = new Properties();
        PropertiesGenerator pg = new PropertiesGenerator();

        try {
            props = pg.getProp();
        } catch (IOException io) {
            
        }

        return null;
    }
}
