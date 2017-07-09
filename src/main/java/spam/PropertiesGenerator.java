/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spam;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Gustavo
 */
public class PropertiesGenerator {

    public PropertiesGenerator() {
    }

    public Properties getProp() throws IOException {
        Properties props = new Properties();
        FileInputStream file;
        try {

            file = new FileInputStream(
                    "./properties/email.properties");
            props.load(file);
            file.close();
            return props;
        } catch (IOException e) {
            System.out.println("Não deu ");
        }
        return props;
    }
}
