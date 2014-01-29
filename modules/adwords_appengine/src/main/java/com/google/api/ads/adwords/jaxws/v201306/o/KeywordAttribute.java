
package com.google.api.ads.adwords.jaxws.v201306.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201306.cm.Keyword;


/**
 * 
 *             {@link Attribute} type that contains a {@link Keyword} value.
 *           
 * 
 * <p>Java class for KeywordAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeywordAttribute">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201306}Attribute">
 *       &lt;sequence>
 *         &lt;element name="value" type="{https://adwords.google.com/api/adwords/cm/v201306}Keyword" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordAttribute", propOrder = {
    "value"
})
public class KeywordAttribute
    extends Attribute
{

    protected Keyword value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Keyword }
     *     
     */
    public Keyword getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Keyword }
     *     
     */
    public void setValue(Keyword value) {
        this.value = value;
    }

}
