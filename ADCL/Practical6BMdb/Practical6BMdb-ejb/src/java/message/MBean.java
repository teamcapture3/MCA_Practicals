/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package message;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
//import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 *
 * @author ninad
 */
//@JMSDestinationDefinition(name = "jms/dest", interfaceName = "javax.jms.Queue", destinationName = "dest")
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/dest"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class MBean implements MessageListener {
    
    public MBean() {
    }
    
    @Override
    public void onMessage(Message message) {
        TextMessage tmsg = null;
        tmsg = (TextMessage)message;
        try {
            System.out.println(tmsg.getText());
        } catch (JMSException ex) {
            Logger.getLogger(MBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
