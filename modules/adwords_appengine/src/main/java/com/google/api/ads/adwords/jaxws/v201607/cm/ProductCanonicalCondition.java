
package com.google.api.ads.adwords.jaxws.v201607.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A canonical condition. Only supported by campaigns of
 *             {@link AdvertisingChannelType#SHOPPING}.
 *           
 * 
 * <p>Java class for ProductCanonicalCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductCanonicalCondition">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201607}ProductDimension">
 *       &lt;sequence>
 *         &lt;element name="condition" type="{https://adwords.google.com/api/adwords/cm/v201607}ProductCanonicalCondition.Condition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductCanonicalCondition", propOrder = {
    "condition"
})
public class ProductCanonicalCondition
    extends ProductDimension
{

    @XmlSchemaType(name = "string")
    protected ProductCanonicalConditionCondition condition;

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCanonicalConditionCondition }
     *     
     */
    public ProductCanonicalConditionCondition getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCanonicalConditionCondition }
     *     
     */
    public void setCondition(ProductCanonicalConditionCondition value) {
        this.condition = value;
    }

}
