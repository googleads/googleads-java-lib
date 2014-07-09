
package com.google.api.ads.adwords.jaxws.v201406.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Manual click based bidding where user pays per click.
 *             <span class="constraint AdxEnabled">This is disabled for AdX.</span>
 *           
 * 
 * <p>Java class for ManualCpcBiddingScheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManualCpcBiddingScheme">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201406}BiddingScheme">
 *       &lt;sequence>
 *         &lt;element name="enhancedCpcEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManualCpcBiddingScheme", propOrder = {
    "enhancedCpcEnabled"
})
public class ManualCpcBiddingScheme
    extends BiddingScheme
{

    protected Boolean enhancedCpcEnabled;

    /**
     * Gets the value of the enhancedCpcEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnhancedCpcEnabled() {
        return enhancedCpcEnabled;
    }

    /**
     * Sets the value of the enhancedCpcEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnhancedCpcEnabled(Boolean value) {
        this.enhancedCpcEnabled = value;
    }

}
