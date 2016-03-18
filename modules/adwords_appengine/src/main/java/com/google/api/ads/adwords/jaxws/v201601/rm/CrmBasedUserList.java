
package com.google.api.ads.adwords.jaxws.v201601.rm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             UserList of CRM users provided by the advertiser.
 *           
 * 
 * <p>Java class for CrmBasedUserList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrmBasedUserList">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/rm/v201601}UserList">
 *       &lt;sequence>
 *         &lt;element name="optOutLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrmBasedUserList", propOrder = {
    "optOutLink"
})
public class CrmBasedUserList
    extends UserList
{

    protected String optOutLink;

    /**
     * Gets the value of the optOutLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptOutLink() {
        return optOutLink;
    }

    /**
     * Sets the value of the optOutLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptOutLink(String value) {
        this.optOutLink = value;
    }

}
