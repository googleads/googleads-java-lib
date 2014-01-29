
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SharedCriterionOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SharedCriterionOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201306}Operation">
 *       &lt;sequence>
 *         &lt;element name="operand" type="{https://adwords.google.com/api/adwords/cm/v201306}SharedCriterion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharedCriterionOperation", propOrder = {
    "operand"
})
public class SharedCriterionOperation
    extends Operation
{

    protected SharedCriterion operand;

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link SharedCriterion }
     *     
     */
    public SharedCriterion getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharedCriterion }
     *     
     */
    public void setOperand(SharedCriterion value) {
        this.operand = value;
    }

}
