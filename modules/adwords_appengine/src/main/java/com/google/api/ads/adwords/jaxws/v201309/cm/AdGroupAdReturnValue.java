
package com.google.api.ads.adwords.jaxws.v201309.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A container for return values from the AdGroupAdService.
 *           
 * 
 * <p>Java class for AdGroupAdReturnValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdGroupAdReturnValue">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201309}ListReturnValue">
 *       &lt;sequence>
 *         &lt;element name="value" type="{https://adwords.google.com/api/adwords/cm/v201309}AdGroupAd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partialFailureErrors" type="{https://adwords.google.com/api/adwords/cm/v201309}ApiError" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdGroupAdReturnValue", propOrder = {
    "value",
    "partialFailureErrors"
})
public class AdGroupAdReturnValue
    extends ListReturnValue
{

    protected List<AdGroupAd> value;
    protected List<ApiError> partialFailureErrors;

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdGroupAd }
     * 
     * 
     */
    public List<AdGroupAd> getValue() {
        if (value == null) {
            value = new ArrayList<AdGroupAd>();
        }
        return this.value;
    }

    /**
     * Gets the value of the partialFailureErrors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partialFailureErrors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartialFailureErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApiError }
     * 
     * 
     */
    public List<ApiError> getPartialFailureErrors() {
        if (partialFailureErrors == null) {
            partialFailureErrors = new ArrayList<ApiError>();
        }
        return this.partialFailureErrors;
    }

}
