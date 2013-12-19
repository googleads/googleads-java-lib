
package com.google.api.ads.adwords.jaxws.v201309.mcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Detail refers to a single event or condition that triggered its owning {@link Alert}.
 *             Multiple details can cause the same {@code Alert} to occur.
 *           
 * 
 * <p>Java class for Detail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Detail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="triggerTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Detail", propOrder = {
    "triggerTime"
})
public class Detail {

    protected String triggerTime;

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

}
