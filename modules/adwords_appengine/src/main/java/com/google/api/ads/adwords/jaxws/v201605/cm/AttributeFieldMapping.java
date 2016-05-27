
package com.google.api.ads.adwords.jaxws.v201605.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a mapping between a feed attribute and a placeholder field.
 *             
 *             <p>For a list of feed placeholders, see
 *             <a href="/adwords/api/docs/appendix/placeholders">
 *             https://developers.google.com/adwords/api/docs/appendix/placeholders
 *             </a></p>
 *           
 * 
 * <p>Java class for AttributeFieldMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeFieldMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="feedAttributeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fieldId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeFieldMapping", propOrder = {
    "feedAttributeId",
    "fieldId"
})
public class AttributeFieldMapping {

    protected Long feedAttributeId;
    protected Integer fieldId;

    /**
     * Gets the value of the feedAttributeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFeedAttributeId() {
        return feedAttributeId;
    }

    /**
     * Sets the value of the feedAttributeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFeedAttributeId(Long value) {
        this.feedAttributeId = value;
    }

    /**
     * Gets the value of the fieldId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFieldId() {
        return fieldId;
    }

    /**
     * Sets the value of the fieldId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFieldId(Integer value) {
        this.fieldId = value;
    }

}
