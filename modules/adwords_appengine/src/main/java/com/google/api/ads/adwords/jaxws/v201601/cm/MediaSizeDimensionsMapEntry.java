
package com.google.api.ads.adwords.jaxws.v201601.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             This represents an entry in a map with a key of type Size
 *             and value of type Dimensions.
 *           
 * 
 * <p>Java class for Media_Size_DimensionsMapEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Media_Size_DimensionsMapEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{https://adwords.google.com/api/adwords/cm/v201601}Media.Size" minOccurs="0"/>
 *         &lt;element name="value" type="{https://adwords.google.com/api/adwords/cm/v201601}Dimensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Media_Size_DimensionsMapEntry", propOrder = {
    "key",
    "value"
})
public class MediaSizeDimensionsMapEntry {

    @XmlSchemaType(name = "string")
    protected MediaSize key;
    protected Dimensions value;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link MediaSize }
     *     
     */
    public MediaSize getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaSize }
     *     
     */
    public void setKey(MediaSize value) {
        this.key = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Dimensions }
     *     
     */
    public Dimensions getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dimensions }
     *     
     */
    public void setValue(Dimensions value) {
        this.value = value;
    }

}
