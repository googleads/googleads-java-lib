
package com.google.api.ads.adwords.jaxws.v201502.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201502.cm.Placement;


/**
 * 
 *             {@link Attribute} type that contains a {@link Placement} value.
 *           
 * 
 * <p>Java class for PlacementAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlacementAttribute">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201502}Attribute">
 *       &lt;sequence>
 *         &lt;element name="value" type="{https://adwords.google.com/api/adwords/cm/v201502}Placement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacementAttribute", propOrder = {
    "value"
})
public class PlacementAttribute
    extends Attribute
{

    protected Placement value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Placement }
     *     
     */
    public Placement getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Placement }
     *     
     */
    public void setValue(Placement value) {
        this.value = value;
    }

}
