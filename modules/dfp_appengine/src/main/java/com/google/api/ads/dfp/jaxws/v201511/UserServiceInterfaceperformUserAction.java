
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Performs actions on {@link User} objects that match the given
 *             {@link Statement#query}.
 *             
 *             @param userAction the action to perform
 *             @param filterStatement a Publisher Query Language statement used to filter
 *             a set of users
 *             @return the result of the action performed
 *           
 * 
 * <p>Java class for performUserAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performUserAction">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="userAction" type="{https://www.google.com/apis/ads/publisher/v201511}UserAction" minOccurs="0"/>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v201511}Statement" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userAction",
    "filterStatement"
})
@XmlRootElement(name = "performUserAction")
public class UserServiceInterfaceperformUserAction {

    protected UserAction userAction;
    protected Statement filterStatement;

    /**
     * Gets the value of the userAction property.
     * 
     * @return
     *     possible object is
     *     {@link UserAction }
     *     
     */
    public UserAction getUserAction() {
        return userAction;
    }

    /**
     * Sets the value of the userAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAction }
     *     
     */
    public void setUserAction(UserAction value) {
        this.userAction = value;
    }

    /**
     * Gets the value of the filterStatement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getFilterStatement() {
        return filterStatement;
    }

    /**
     * Sets the value of the filterStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setFilterStatement(Statement value) {
        this.filterStatement = value;
    }

}
