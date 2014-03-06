
package com.google.api.ads.adwords.jaxws.v201402.mcm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Alert for a single client. Triggering events are grouped by {@link AlertType} into the same alert
 *             with multiple {@link Details}.
 *           
 * 
 * <p>Java class for Alert complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Alert">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alertSeverity" type="{https://adwords.google.com/api/adwords/mcm/v201402}AlertSeverity" minOccurs="0"/>
 *         &lt;element name="alertType" type="{https://adwords.google.com/api/adwords/mcm/v201402}AlertType" minOccurs="0"/>
 *         &lt;element name="clientCustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="details" type="{https://adwords.google.com/api/adwords/mcm/v201402}Detail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Alert", propOrder = {
    "alertSeverity",
    "alertType",
    "clientCustomerId",
    "details"
})
public class Alert {

    protected AlertSeverity alertSeverity;
    protected AlertType alertType;
    protected Long clientCustomerId;
    protected List<Detail> details;

    /**
     * Gets the value of the alertSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link AlertSeverity }
     *     
     */
    public AlertSeverity getAlertSeverity() {
        return alertSeverity;
    }

    /**
     * Sets the value of the alertSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertSeverity }
     *     
     */
    public void setAlertSeverity(AlertSeverity value) {
        this.alertSeverity = value;
    }

    /**
     * Gets the value of the alertType property.
     * 
     * @return
     *     possible object is
     *     {@link AlertType }
     *     
     */
    public AlertType getAlertType() {
        return alertType;
    }

    /**
     * Sets the value of the alertType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertType }
     *     
     */
    public void setAlertType(AlertType value) {
        this.alertType = value;
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
     * Gets the value of the details property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the details property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Detail }
     * 
     * 
     */
    public List<Detail> getDetails() {
        if (details == null) {
            details = new ArrayList<Detail>();
        }
        return this.details;
    }

}
