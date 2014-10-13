
package com.google.api.ads.adwords.jaxws.v201409.express;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201409.cm.SoapHeader;


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
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201409}SoapHeader">
 *       &lt;sequence>
 *         &lt;element name="expressBusinessId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "expressBusinessId",
    "pageId"
})
public class ExpressSoapHeader
    extends SoapHeader
{

    protected Long expressBusinessId;
    protected String pageId;

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

    /**
     * Gets the value of the pageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageId() {
        return pageId;
    }

    /**
     * Sets the value of the pageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageId(String value) {
        this.pageId = value;
    }

}
