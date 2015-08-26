
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A base class for storing values of the {@link CreativeTemplateVariable}.
 *           
 * 
 * <p>Java class for BaseCreativeTemplateVariableValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseCreativeTemplateVariableValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uniqueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseCreativeTemplateVariableValue.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseCreativeTemplateVariableValue", propOrder = {
    "uniqueName",
    "baseCreativeTemplateVariableValueType"
})
@XmlSeeAlso({
    LongCreativeTemplateVariableValue.class,
    UrlCreativeTemplateVariableValue.class,
    StringCreativeTemplateVariableValue.class,
    AssetCreativeTemplateVariableValue.class
})
public abstract class BaseCreativeTemplateVariableValue {

    protected String uniqueName;
    @XmlElement(name = "BaseCreativeTemplateVariableValue.Type")
    protected String baseCreativeTemplateVariableValueType;

    /**
     * Gets the value of the uniqueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueName() {
        return uniqueName;
    }

    /**
     * Sets the value of the uniqueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueName(String value) {
        this.uniqueName = value;
    }

    /**
     * Gets the value of the baseCreativeTemplateVariableValueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCreativeTemplateVariableValueType() {
        return baseCreativeTemplateVariableValueType;
    }

    /**
     * Sets the value of the baseCreativeTemplateVariableValueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCreativeTemplateVariableValueType(String value) {
        this.baseCreativeTemplateVariableValueType = value;
    }

}
