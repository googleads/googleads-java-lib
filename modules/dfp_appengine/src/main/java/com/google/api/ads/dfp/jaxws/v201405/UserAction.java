
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on {@link User} objects.
 *           
 * 
 * <p>Java class for UserAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserAction.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserAction", propOrder = {
    "userActionType"
})
@XmlSeeAlso({
    ActivateUsers.class,
    DeactivateUsers.class
})
public abstract class UserAction {

    @XmlElement(name = "UserAction.Type")
    protected String userActionType;

    /**
     * Gets the value of the userActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserActionType() {
        return userActionType;
    }

    /**
     * Sets the value of the userActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserActionType(String value) {
        this.userActionType = value;
    }

}
