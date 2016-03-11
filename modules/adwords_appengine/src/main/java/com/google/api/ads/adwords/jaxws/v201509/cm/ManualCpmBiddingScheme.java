
package com.google.api.ads.adwords.jaxws.v201509.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Manual impression based bidding where user pays per thousand impressions.
 *             <span class="constraint AdxEnabled">This is enabled for AdX.</span>
 *           
 * 
 * <p>Java class for ManualCpmBiddingScheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManualCpmBiddingScheme">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201509}BiddingScheme">
 *       &lt;sequence>
 *         &lt;element name="activeViewCpmEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManualCpmBiddingScheme", propOrder = {
    "activeViewCpmEnabled"
})
public class ManualCpmBiddingScheme
    extends BiddingScheme
{

    protected Boolean activeViewCpmEnabled;

    /**
     * Gets the value of the activeViewCpmEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveViewCpmEnabled() {
        return activeViewCpmEnabled;
    }

    /**
     * Sets the value of the activeViewCpmEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveViewCpmEnabled(Boolean value) {
        this.activeViewCpmEnabled = value;
    }

}
