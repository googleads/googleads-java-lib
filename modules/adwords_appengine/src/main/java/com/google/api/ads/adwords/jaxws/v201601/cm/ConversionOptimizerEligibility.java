
package com.google.api.ads.adwords.jaxws.v201601.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Eligibility data for Campaign to transition to Conversion Optimizer
 *           
 * 
 * <p>Java class for ConversionOptimizerEligibility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversionOptimizerEligibility">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eligible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rejectionReasons" type="{https://adwords.google.com/api/adwords/cm/v201601}ConversionOptimizerEligibility.RejectionReason" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionOptimizerEligibility", propOrder = {
    "eligible",
    "rejectionReasons"
})
public class ConversionOptimizerEligibility {

    protected Boolean eligible;
    @XmlSchemaType(name = "string")
    protected List<ConversionOptimizerEligibilityRejectionReason> rejectionReasons;

    /**
     * Gets the value of the eligible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligible() {
        return eligible;
    }

    /**
     * Sets the value of the eligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligible(Boolean value) {
        this.eligible = value;
    }

    /**
     * Gets the value of the rejectionReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rejectionReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRejectionReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConversionOptimizerEligibilityRejectionReason }
     * 
     * 
     */
    public List<ConversionOptimizerEligibilityRejectionReason> getRejectionReasons() {
        if (rejectionReasons == null) {
            rejectionReasons = new ArrayList<ConversionOptimizerEligibilityRejectionReason>();
        }
        return this.rejectionReasons;
    }

}
