package spam;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.Properties;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Gustavo
 */
public class MessageFactory {

    public MessageFactory(){}
    
    /**
     *
     * @param to
     * @param from
     * @param subject
     * @param body
     * @return
     * @throws javax.mail.MessagingException
     */    
    public MimeMessage createMessage(String to, String from, String subject, String body) throws MessagingException {

        Properties props = new Properties();
        PropertiesGenerator pg = new PropertiesGenerator();

        try {
            props = pg.getProp();
        } catch (IOException io) {
            System.out.println("erro: " + io);
        }

        Session session = Session.getDefaultInstance(props, null);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(from));
        } catch (AddressException ae) {
            System.out.println("erro " + ae);
        }
        
        message.addRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress(to));
        message.setSubject(subject);
        message.setText(body);

        return message;
    }
}
