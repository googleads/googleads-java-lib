
package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Reports permission problems trying to access an entity.
 *           
 * 
 * <p>Java class for EntityAccessDenied complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityAccessDenied">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201603}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/cm/v201603}EntityAccessDenied.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityAccessDenied", propOrder = {
    "reason"
})
public class EntityAccessDenied
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected EntityAccessDeniedReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link EntityAccessDeniedReason }
     *     
     */
    public EntityAccessDeniedReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityAccessDeniedReason }
     *     
     */
    public void setReason(EntityAccessDeniedReason value) {
        this.reason = value;
    }

}
