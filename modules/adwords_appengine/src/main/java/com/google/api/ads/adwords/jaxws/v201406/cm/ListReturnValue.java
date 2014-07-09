
package com.google.api.ads.adwords.jaxws.v201406.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201406.billing.BudgetOrderReturnValue;
import com.google.api.ads.adwords.jaxws.v201406.rm.UserListReturnValue;


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
    UserListReturnValue.class,
    BudgetOrderReturnValue.class,
    CampaignSharedSetReturnValue.class,
    AdGroupAdLabelReturnValue.class,
    FeedReturnValue.class,
    AdGroupFeedReturnValue.class,
    BiddingStrategyReturnValue.class,
    CampaignCriterionReturnValue.class,
    AdGroupAdReturnValue.class,
    CampaignReturnValue.class,
    LabelReturnValue.class,
    BudgetReturnValue.class,
    SharedCriterionReturnValue.class,
    ConversionTrackerReturnValue.class,
    FeedMappingReturnValue.class,
    AdGroupBidModifierReturnValue.class,
    AdGroupReturnValue.class,
    FeedItemReturnValue.class,
    OfflineConversionFeedReturnValue.class,
    SharedSetReturnValue.class,
    CustomerFeedReturnValue.class,
    ExperimentReturnValue.class,
    AdGroupCriterionLabelReturnValue.class,
    AdGroupCriterionReturnValue.class,
    CampaignLabelReturnValue.class,
    CampaignAdExtensionReturnValue.class,
    CampaignFeedReturnValue.class,
    AdGroupLabelReturnValue.class
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
