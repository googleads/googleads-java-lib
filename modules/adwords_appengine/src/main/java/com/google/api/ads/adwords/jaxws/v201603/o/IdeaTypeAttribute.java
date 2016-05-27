
package com.google.api.ads.adwords.jaxws.v201603.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             {@link Attribute} type that contains an {@link IdeaType} value. For example, if a
 *             {@link TargetingIdea} represents a keyword idea, its {@link IdeaTypeAttribute} would contain a
 *             {@code KEYWORD} {@link IdeaType}.
 *           
 * 
 * <p>Java class for IdeaTypeAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdeaTypeAttribute">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201603}Attribute">
 *       &lt;sequence>
 *         &lt;element name="value" type="{https://adwords.google.com/api/adwords/o/v201603}IdeaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdeaTypeAttribute", propOrder = {
    "value"
})
public class IdeaTypeAttribute
    extends Attribute
{

    @XmlSchemaType(name = "string")
    protected IdeaType value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link IdeaType }
     *     
     */
    public IdeaType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdeaType }
     *     
     */
    public void setValue(IdeaType value) {
        this.value = value;
    }

}
