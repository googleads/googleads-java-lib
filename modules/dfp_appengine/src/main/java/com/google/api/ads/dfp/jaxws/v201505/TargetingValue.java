
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains a {@link Targeting} value.
 *             <p>
 *             <b>This object is experimental!
 *             <code>TargetingValue</code> is an experimental, innovative, and rapidly
 *             changing new feature for DFP. Unfortunately, being on the bleeding edge means that we may make
 *             backwards-incompatible changes to
 *             <code>TargetingValue</code>. We will inform the community when this feature
 *             is no longer experimental.</b>
 *           
 * 
 * <p>Java class for TargetingValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetingValue">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201505}ObjectValue">
 *       &lt;sequence>
 *         &lt;element name="value" type="{https://www.google.com/apis/ads/publisher/v201505}Targeting" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetingValue", propOrder = {
    "value"
})
public class TargetingValue
    extends ObjectValue
{

    protected Targeting value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Targeting }
     *     
     */
    public Targeting getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Targeting }
     *     
     */
    public void setValue(Targeting value) {
        this.value = value;
    }

}
