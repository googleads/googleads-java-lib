
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201309.billing.BudgetOrderReturnValue;
import com.google.api.ads.adwords.jaxws.v201309.rm.UserListReturnValue;


/**
 * 
 *             Base list return value type.
 *           
 * 
 * <p>Java class for ListReturnValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListReturnValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListReturnValue.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListReturnValue", propOrder = {
    "listReturnValueType"
})
@XmlSeeAlso({
    BudgetOrderReturnValue.class,
    UserListReturnValue.class,
    CampaignSharedSetReturnValue.class,
    FeedReturnValue.class,
    AdGroupFeedReturnValue.class,
    BiddingStrategyReturnValue.class,
    CampaignCriterionReturnValue.class,
    AdGroupAdReturnValue.class,
    CampaignReturnValue.class,
    BudgetReturnValue.class,
    SharedCriterionReturnValue.class,
    ConversionTrackerReturnValue.class,
    FeedMappingReturnValue.class,
    AdGroupBidModifierReturnValue.class,
    AdGroupReturnValue.class,
    FeedItemReturnValue.class,
    OfflineConversionFeedReturnValue.class,
    SharedSetReturnValue.class,
    ExperimentReturnValue.class,
    AdGroupCriterionReturnValue.class,
    CampaignAdExtensionReturnValue.class,
    CampaignFeedReturnValue.class
})
public abstract class ListReturnValue {

    @XmlElement(name = "ListReturnValue.Type")
    protected String listReturnValueType;

    /**
     * Gets the value of the listReturnValueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListReturnValueType() {
        return listReturnValueType;
    }

    /**
     * Sets the value of the listReturnValueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListReturnValueType(String value) {
        this.listReturnValueType = value;
    }

}
