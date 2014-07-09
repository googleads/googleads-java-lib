
package com.google.api.ads.adwords.jaxws.v201406.mcm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Querying criteria for getting alerts.
 *           
 * 
 * <p>Java class for AlertQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientSpec" type="{https://adwords.google.com/api/adwords/mcm/v201406}ClientSpec" minOccurs="0"/>
 *         &lt;element name="filterSpec" type="{https://adwords.google.com/api/adwords/mcm/v201406}FilterSpec" minOccurs="0"/>
 *         &lt;element name="types" type="{https://adwords.google.com/api/adwords/mcm/v201406}AlertType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="severities" type="{https://adwords.google.com/api/adwords/mcm/v201406}AlertSeverity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="triggerTimeSpec" type="{https://adwords.google.com/api/adwords/mcm/v201406}TriggerTimeSpec" minOccurs="0"/>
 *         &lt;element name="triggerTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientCustomerIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertQuery", propOrder = {
    "clientSpec",
    "filterSpec",
    "types",
    "severities",
    "triggerTimeSpec",
    "triggerTime",
    "clientCustomerIds"
})
public class AlertQuery {

    protected ClientSpec clientSpec;
    protected FilterSpec filterSpec;
    protected List<AlertType> types;
    protected List<AlertSeverity> severities;
    protected TriggerTimeSpec triggerTimeSpec;
    protected String triggerTime;
    @XmlElement(type = Long.class)
    protected List<Long> clientCustomerIds;

    /**
     * Gets the value of the clientSpec property.
     * 
     * @return
     *     possible object is
     *     {@link ClientSpec }
     *     
     */
    public ClientSpec getClientSpec() {
        return clientSpec;
    }

    /**
     * Sets the value of the clientSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientSpec }
     *     
     */
    public void setClientSpec(ClientSpec value) {
        this.clientSpec = value;
    }

    /**
     * Gets the value of the filterSpec property.
     * 
     * @return
     *     possible object is
     *     {@link FilterSpec }
     *     
     */
    public FilterSpec getFilterSpec() {
        return filterSpec;
    }

    /**
     * Sets the value of the filterSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterSpec }
     *     
     */
    public void setFilterSpec(FilterSpec value) {
        this.filterSpec = value;
    }

    /**
     * Gets the value of the types property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the types property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlertType }
     * 
     * 
     */
    public List<AlertType> getTypes() {
        if (types == null) {
            types = new ArrayList<AlertType>();
        }
        return this.types;
    }

    /**
     * Gets the value of the severities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the severities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeverities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlertSeverity }
     * 
     * 
     */
    public List<AlertSeverity> getSeverities() {
        if (severities == null) {
            severities = new ArrayList<AlertSeverity>();
        }
        return this.severities;
    }

    /**
     * Gets the value of the triggerTimeSpec property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerTimeSpec }
     *     
     */
    public TriggerTimeSpec getTriggerTimeSpec() {
        return triggerTimeSpec;
    }

    /**
     * Sets the value of the triggerTimeSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerTimeSpec }
     *     
     */
    public void setTriggerTimeSpec(TriggerTimeSpec value) {
        this.triggerTimeSpec = value;
    }

    /**
     * Gets the value of the triggerTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriggerTime() {
        return triggerTime;
    }

    /**
     * Sets the value of the triggerTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriggerTime(String value) {
        this.triggerTime = value;
    }

    /**
     * Gets the value of the clientCustomerIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientCustomerIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientCustomerIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getClientCustomerIds() {
        if (clientCustomerIds == null) {
            clientCustomerIds = new ArrayList<Long>();
        }
        return this.clientCustomerIds;
    }

}
