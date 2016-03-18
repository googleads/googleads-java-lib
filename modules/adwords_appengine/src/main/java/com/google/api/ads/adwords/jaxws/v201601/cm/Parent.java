
package com.google.api.ads.adwords.jaxws.v201601.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Parent criterion.
 *             <p>A criterion of this type can only be created using an ID. A criterion of this type can be either targeted or excluded.
 *             <span class="constraint AdxEnabled">This is disabled for AdX when it is contained within Operators: ADD, SET.</span>
 *           
 * 
 * <p>Java class for Parent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Parent">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201601}Criterion">
 *       &lt;sequence>
 *         &lt;element name="parentType" type="{https://adwords.google.com/api/adwords/cm/v201601}Parent.ParentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parent", propOrder = {
    "parentType"
})
public class Parent
    extends Criterion
{

    @XmlSchemaType(name = "string")
    protected ParentParentType parentType;

    /**
     * Gets the value of the parentType property.
     * 
     * @return
     *     possible object is
     *     {@link ParentParentType }
     *     
     */
    public ParentParentType getParentType() {
        return parentType;
    }

    /**
     * Sets the value of the parentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentParentType }
     *     
     */
    public void setParentType(ParentParentType value) {
        this.parentType = value;
    }

}
