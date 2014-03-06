
package com.google.api.ads.dfp.jaxws.v201403;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Dynamic allocation creative with a backfill code snippet.
 *           
 * 
 * <p>Java class for HasHtmlSnippetDynamicAllocationCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HasHtmlSnippetDynamicAllocationCreative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201403}BaseDynamicAllocationCreative">
 *       &lt;sequence>
 *         &lt;element name="codeSnippet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HasHtmlSnippetDynamicAllocationCreative", propOrder = {
    "codeSnippet"
})
@XmlSeeAlso({
    AdSenseCreative.class,
    AdExchangeCreative.class
})
public abstract class HasHtmlSnippetDynamicAllocationCreative
    extends BaseDynamicAllocationCreative
{

    protected String codeSnippet;

    /**
     * Gets the value of the codeSnippet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSnippet() {
        return codeSnippet;
    }

    /**
     * Sets the value of the codeSnippet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSnippet(String value) {
        this.codeSnippet = value;
    }

}
