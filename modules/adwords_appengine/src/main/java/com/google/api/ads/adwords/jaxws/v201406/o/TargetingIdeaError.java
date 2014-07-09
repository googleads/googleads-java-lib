
package com.google.api.ads.adwords.jaxws.v201406.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201406.cm.ApiError;


/**
 * 
 *             Base error class for the
 *             {@link com.google.ads.api.services.targetingideas.TargetingIdeaService}.
 *           
 * 
 * <p>Java class for TargetingIdeaError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetingIdeaError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201406}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/o/v201406}TargetingIdeaError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetingIdeaError", propOrder = {
    "reason"
})
public class TargetingIdeaError
    extends ApiError
{

    protected TargetingIdeaErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link TargetingIdeaErrorReason }
     *     
     */
    public TargetingIdeaErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetingIdeaErrorReason }
     *     
     */
    public void setReason(TargetingIdeaErrorReason value) {
        this.reason = value;
    }

}
