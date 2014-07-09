
package com.google.api.ads.adwords.jaxws.v201406.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             {@link Attribute} type that contains a {@link WebpageDescriptor} value.
 *           
 * 
 * <p>Java class for WebpageDescriptorAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebpageDescriptorAttribute">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201406}Attribute">
 *       &lt;sequence>
 *         &lt;element name="value" type="{https://adwords.google.com/api/adwords/o/v201406}WebpageDescriptor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebpageDescriptorAttribute", propOrder = {
    "value"
})
public class WebpageDescriptorAttribute
    extends Attribute
{

    protected WebpageDescriptor value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link WebpageDescriptor }
     *     
     */
    public WebpageDescriptor getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebpageDescriptor }
     *     
     */
    public void setValue(WebpageDescriptor value) {
        this.value = value;
    }

}
