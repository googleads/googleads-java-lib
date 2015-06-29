
package com.google.api.ads.adwords.jaxws.v201506.mcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Pending invitation result for the getPendingInvitations method.
 *           
 * 
 * <p>Java class for PendingInvitation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PendingInvitation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="manager" type="{https://adwords.google.com/api/adwords/mcm/v201506}ManagedCustomer" minOccurs="0"/>
 *         &lt;element name="client" type="{https://adwords.google.com/api/adwords/mcm/v201506}ManagedCustomer" minOccurs="0"/>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PendingInvitation", propOrder = {
    "manager",
    "client",
    "creationDate",
    "expirationDate"
})
public class PendingInvitation {

    protected ManagedCustomer manager;
    protected ManagedCustomer client;
    protected String creationDate;
    protected String expirationDate;

    /**
     * Gets the value of the manager property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedCustomer }
     *     
     */
    public ManagedCustomer getManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedCustomer }
     *     
     */
    public void setManager(ManagedCustomer value) {
        this.manager = value;
    }

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedCustomer }
     *     
     */
    public ManagedCustomer getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedCustomer }
     *     
     */
    public void setClient(ManagedCustomer value) {
        this.client = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDate(String value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

}
