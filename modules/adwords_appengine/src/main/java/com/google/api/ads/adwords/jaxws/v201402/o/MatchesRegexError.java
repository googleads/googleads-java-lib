
package com.google.api.ads.adwords.jaxws.v201402.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201402.cm.ApiError;


/**
 * 
 *             Errors associated with a given string not matching the provided
 *             regular expression.
 *           
 * 
 * <p>Java class for MatchesRegexError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchesRegexError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201402}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/o/v201402}MatchesRegexError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchesRegexError", propOrder = {
    "reason"
})
public class MatchesRegexError
    extends ApiError
{

    protected MatchesRegexErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link MatchesRegexErrorReason }
     *     
     */
    public MatchesRegexErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchesRegexErrorReason }
     *     
     */
    public void setReason(MatchesRegexErrorReason value) {
        this.reason = value;
    }

}
