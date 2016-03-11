
package com.google.api.ads.adwords.jaxws.v201601.rm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201601.cm.ApiError;


/**
 * 
 *             Represents possible error codes from {@code UserListService#mutateMembers}.
 *           
 * 
 * <p>Java class for MutateMembersError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MutateMembersError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201601}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/rm/v201601}MutateMembersError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MutateMembersError", propOrder = {
    "reason"
})
public class MutateMembersError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected MutateMembersErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link MutateMembersErrorReason }
     *     
     */
    public MutateMembersErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link MutateMembersErrorReason }
     *     
     */
    public void setReason(MutateMembersErrorReason value) {
        this.reason = value;
    }

}
