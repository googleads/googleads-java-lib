
package com.google.api.ads.adwords.jaxws.v201306.rm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a particular interest based vertical to be targeted.
 *             User interest may be used for defining logical user lists.
 *           
 * 
 * <p>Java class for UserInterest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserInterest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sizeRange" type="{https://adwords.google.com/api/adwords/rm/v201306}SizeRange" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserInterest", propOrder = {
    "id",
    "name",
    "sizeRange"
})
public class UserInterest {

    protected Long id;
    protected String name;
    protected SizeRange sizeRange;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the sizeRange property.
     * 
     * @return
     *     possible object is
     *     {@link SizeRange }
     *     
     */
    public SizeRange getSizeRange() {
        return sizeRange;
    }

    /**
     * Sets the value of the sizeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeRange }
     *     
     */
    public void setSizeRange(SizeRange value) {
        this.sizeRange = value;
    }

}
