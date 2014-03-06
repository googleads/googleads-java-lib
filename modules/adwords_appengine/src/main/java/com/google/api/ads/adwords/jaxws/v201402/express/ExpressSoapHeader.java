
package com.google.api.ads.adwords.jaxws.v201402.express;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201402.cm.SoapHeader;


/**
 * 
 *             {@link SoapHeader} for AdWords Express services.
 *           
 * 
 * <p>Java class for ExpressSoapHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpressSoapHeader">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201402}SoapHeader">
 *       &lt;sequence>
 *         &lt;element name="expressBusinessId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpressSoapHeader", propOrder = {
    "expressBusinessId"
})
public class ExpressSoapHeader
    extends SoapHeader
{

    protected Long expressBusinessId;

    /**
     * Gets the value of the expressBusinessId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExpressBusinessId() {
        return expressBusinessId;
    }

    /**
     * Sets the value of the expressBusinessId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExpressBusinessId(Long value) {
        this.expressBusinessId = value;
    }

}
