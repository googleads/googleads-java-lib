
package com.google.api.ads.adwords.jaxws.v201409.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             {@link Attribute} type that contains an {@link OpportunityIdeaType} value.
 *             For example, if a
 *             {@link com.google.ads.api.services.optimization.bulkopportunity.OpportunityIdea}
 *             represents a keyword idea, its {@link OpportunityIdeaTypeAttribute} would
 *             contain a {@code KEYWORD} {@link OpportunityIdeaType}.
 *           
 * 
 * <p>Java class for OpportunityIdeaTypeAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpportunityIdeaTypeAttribute">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201409}Attribute">
 *       &lt;sequence>
 *         &lt;element name="value" type="{https://adwords.google.com/api/adwords/o/v201409}OpportunityIdeaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpportunityIdeaTypeAttribute", propOrder = {
    "value"
})
public class OpportunityIdeaTypeAttribute
    extends Attribute
{

    protected OpportunityIdeaType value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunityIdeaType }
     *     
     */
    public OpportunityIdeaType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunityIdeaType }
     *     
     */
    public void setValue(OpportunityIdeaType value) {
        this.value = value;
    }

}
