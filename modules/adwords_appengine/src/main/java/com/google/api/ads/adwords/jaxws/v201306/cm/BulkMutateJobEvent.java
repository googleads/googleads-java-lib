
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An event defined by a status change of a bulk mutate job.
 *           
 * 
 * <p>Java class for BulkMutateJobEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BulkMutateJobEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201306}JobEvent">
 *       &lt;sequence>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/cm/v201306}BasicJobStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BulkMutateJobEvent", propOrder = {
    "status"
})
public class BulkMutateJobEvent
    extends JobEvent
{

    protected BasicJobStatus status;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link BasicJobStatus }
     *     
     */
    public BasicJobStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicJobStatus }
     *     
     */
    public void setStatus(BasicJobStatus value) {
        this.status = value;
    }

}
