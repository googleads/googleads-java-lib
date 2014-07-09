
package com.google.api.ads.adwords.jaxws.v201406.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Interface for ad specifications to implement. See individual spec
 *             documentation for more details on how to use each type, and
 *             {@link AdSpecListSearchParameter} to understand what these specs are for.
 *           
 * 
 * <p>Java class for AdSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdSpec">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="DisplayAdSpec" type="{https://adwords.google.com/api/adwords/o/v201406}DisplayAdSpec"/>
 *         &lt;element name="InStreamAdSpec" type="{https://adwords.google.com/api/adwords/o/v201406}InStreamAdSpec"/>
 *         &lt;element name="TextAdSpec" type="{https://adwords.google.com/api/adwords/o/v201406}TextAdSpec"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdSpec", propOrder = {
    "displayAdSpec",
    "inStreamAdSpec",
    "textAdSpec"
})
public class AdSpec {

    @XmlElement(name = "DisplayAdSpec")
    protected DisplayAdSpec displayAdSpec;
    @XmlElement(name = "InStreamAdSpec")
    protected InStreamAdSpec inStreamAdSpec;
    @XmlElement(name = "TextAdSpec")
    protected TextAdSpec textAdSpec;

    /**
     * Gets the value of the displayAdSpec property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayAdSpec }
     *     
     */
    public DisplayAdSpec getDisplayAdSpec() {
        return displayAdSpec;
    }

    /**
     * Sets the value of the displayAdSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayAdSpec }
     *     
     */
    public void setDisplayAdSpec(DisplayAdSpec value) {
        this.displayAdSpec = value;
    }

    /**
     * Gets the value of the inStreamAdSpec property.
     * 
     * @return
     *     possible object is
     *     {@link InStreamAdSpec }
     *     
     */
    public InStreamAdSpec getInStreamAdSpec() {
        return inStreamAdSpec;
    }

    /**
     * Sets the value of the inStreamAdSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link InStreamAdSpec }
     *     
     */
    public void setInStreamAdSpec(InStreamAdSpec value) {
        this.inStreamAdSpec = value;
    }

    /**
     * Gets the value of the textAdSpec property.
     * 
     * @return
     *     possible object is
     *     {@link TextAdSpec }
     *     
     */
    public TextAdSpec getTextAdSpec() {
        return textAdSpec;
    }

    /**
     * Sets the value of the textAdSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextAdSpec }
     *     
     */
    public void setTextAdSpec(TextAdSpec value) {
        this.textAdSpec = value;
    }

}
