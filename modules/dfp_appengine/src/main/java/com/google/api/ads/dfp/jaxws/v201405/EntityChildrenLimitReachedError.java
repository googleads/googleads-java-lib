
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Lists errors relating to having too many children on an entity.
 *           
 * 
 * <p>Java class for EntityChildrenLimitReachedError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityChildrenLimitReachedError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201405}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201405}EntityChildrenLimitReachedError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityChildrenLimitReachedError", propOrder = {
    "reason"
})
public class EntityChildrenLimitReachedError
    extends ApiError
{

    protected EntityChildrenLimitReachedErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link EntityChildrenLimitReachedErrorReason }
     *     
     */
    public EntityChildrenLimitReachedErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityChildrenLimitReachedErrorReason }
     *     
     */
    public void setReason(EntityChildrenLimitReachedErrorReason value) {
        this.reason = value;
    }

}
