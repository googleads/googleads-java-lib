
package com.google.api.ads.adwords.jaxws.v201409.mcm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201409.cm.ApiError;


/**
 * 
 *             Error for {@link ManagedCustomerService}
 *           
 * 
 * <p>Java class for ManagedCustomerServiceError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagedCustomerServiceError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201409}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/mcm/v201409}ManagedCustomerServiceError.Reason" minOccurs="0"/>
 *         &lt;element name="customerIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedCustomerServiceError", propOrder = {
    "reason",
    "customerIds"
})
public class ManagedCustomerServiceError
    extends ApiError
{

    protected ManagedCustomerServiceErrorReason reason;
    @XmlElement(type = Long.class)
    protected List<Long> customerIds;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedCustomerServiceErrorReason }
     *     
     */
    public ManagedCustomerServiceErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedCustomerServiceErrorReason }
     *     
     */
    public void setReason(ManagedCustomerServiceErrorReason value) {
        this.reason = value;
    }

    /**
     * Gets the value of the customerIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getCustomerIds() {
        if (customerIds == null) {
            customerIds = new ArrayList<Long>();
        }
        return this.customerIds;
    }

}
