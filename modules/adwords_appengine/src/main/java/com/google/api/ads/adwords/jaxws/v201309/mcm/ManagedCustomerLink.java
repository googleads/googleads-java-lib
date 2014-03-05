
package com.google.api.ads.adwords.jaxws.v201309.mcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents an AdWords manager-client link.
 *           
 * 
 * <p>Java class for ManagedCustomerLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagedCustomerLink">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="managerCustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="clientCustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="linkStatus" type="{https://adwords.google.com/api/adwords/mcm/v201309}LinkStatus" minOccurs="0"/>
 *         &lt;element name="pendingDescriptiveName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedCustomerLink", propOrder = {
    "managerCustomerId",
    "clientCustomerId",
    "linkStatus",
    "pendingDescriptiveName"
})
public class ManagedCustomerLink {

    protected Long managerCustomerId;
    protected Long clientCustomerId;
    protected LinkStatus linkStatus;
    protected String pendingDescriptiveName;

    /**
     * Gets the value of the managerCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getManagerCustomerId() {
        return managerCustomerId;
    }

    /**
     * Sets the value of the managerCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setManagerCustomerId(Long value) {
        this.managerCustomerId = value;
    }

    /**
     * Gets the value of the clientCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClientCustomerId() {
        return clientCustomerId;
    }

    /**
     * Sets the value of the clientCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClientCustomerId(Long value) {
        this.clientCustomerId = value;
    }

    /**
     * Gets the value of the linkStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LinkStatus }
     *     
     */
    public LinkStatus getLinkStatus() {
        return linkStatus;
    }

    /**
     * Sets the value of the linkStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkStatus }
     *     
     */
    public void setLinkStatus(LinkStatus value) {
        this.linkStatus = value;
    }

    /**
     * Gets the value of the pendingDescriptiveName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPendingDescriptiveName() {
        return pendingDescriptiveName;
    }

    /**
     * Sets the value of the pendingDescriptiveName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPendingDescriptiveName(String value) {
        this.pendingDescriptiveName = value;
    }

}
