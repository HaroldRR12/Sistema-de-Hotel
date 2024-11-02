/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */
package sistema.de.hotel;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author CALUFA
 */
public class BeanSesion implements Serializable {
    
    public static final String PROP_SAMPLE_PROPERTY = "userProperty";
    
    private String userProperty;
    
    private PropertyChangeSupport propertySupport;
    
    public BeanSesion() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getUserProperty() {
        return userProperty;
    }
    
    public void setUserProperty(String value) {
        String oldValue = userProperty;
        userProperty = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, userProperty);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
