
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a url variable defined in a creative template.
 *             <p>
 *             Use {@link UrlCreativeTemplateVariableValue} to specify the value
 *             for this variable when creating {@link TemplateCreative} from the {@link TemplateCreative}
 *           
 * 
 * <p>Java class for UrlCreativeTemplateVariable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UrlCreativeTemplateVariable">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201511}CreativeTemplateVariable">
 *       &lt;sequence>
 *         &lt;element name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isTrackingUrl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrlCreativeTemplateVariable", propOrder = {
    "defaultValue",
    "isTrackingUrl"
})
public class UrlCreativeTemplateVariable
    extends CreativeTemplateVariable
{

    protected String defaultValue;
    protected Boolean isTrackingUrl;

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the isTrackingUrl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTrackingUrl() {
        return isTrackingUrl;
    }

    /**
     * Sets the value of the isTrackingUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTrackingUrl(Boolean value) {
        this.isTrackingUrl = value;
    }

}
