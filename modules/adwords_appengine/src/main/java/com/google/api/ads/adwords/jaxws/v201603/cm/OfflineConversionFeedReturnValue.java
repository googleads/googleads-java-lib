
package com.google.api.ads.adwords.jaxws.v201603.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A container for return values from the OfflineConversionFeedService.
 *           
 * 
 * <p>Java class for OfflineConversionFeedReturnValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfflineConversionFeedReturnValue">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201603}ListReturnValue">
 *       &lt;sequence>
 *         &lt;element name="value" type="{https://adwords.google.com/api/adwords/cm/v201603}OfflineConversionFeed" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partialFailureErrors" type="{https://adwords.google.com/api/adwords/cm/v201603}ApiError" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfflineConversionFeedReturnValue", propOrder = {
    "value",
    "partialFailureErrors"
})
public class OfflineConversionFeedReturnValue
    extends ListReturnValue
{

    protected List<OfflineConversionFeed> value;
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
     * {@link OfflineConversionFeed }
     * 
     * 
     */
    public List<OfflineConversionFeed> getValue() {
        if (value == null) {
            value = new ArrayList<OfflineConversionFeed>();
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
