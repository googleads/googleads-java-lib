
package com.google.api.ads.adwords.jaxws.v201506.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201506.cm.ApiError;


/**
 * 
 *             Base error class for
 *             {@link com.google.ads.api.services.trafficestimator.TrafficEstimatorService}.
 *           
 * 
 * <p>Java class for TrafficEstimatorError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficEstimatorError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201506}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/o/v201506}TrafficEstimatorError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficEstimatorError", propOrder = {
    "reason"
})
public class TrafficEstimatorError
    extends ApiError
{

    protected TrafficEstimatorErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficEstimatorErrorReason }
     *     
     */
    public TrafficEstimatorErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficEstimatorErrorReason }
     *     
     */
    public void setReason(TrafficEstimatorErrorReason value) {
        this.reason = value;
    }

}
