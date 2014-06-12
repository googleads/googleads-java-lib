
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The {@code CreativeWrapperHtmlSnippet} contains the HTML snippet that is
 *             delivered as the header or footer.
 *           
 * 
 * <p>Java class for CreativeWrapperHtmlSnippet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreativeWrapperHtmlSnippet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="htmlSnippet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreativeWrapperHtmlSnippet", propOrder = {
    "htmlSnippet"
})
public class CreativeWrapperHtmlSnippet {

    protected String htmlSnippet;

    /**
     * Gets the value of the htmlSnippet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtmlSnippet() {
        return htmlSnippet;
    }

    /**
     * Sets the value of the htmlSnippet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtmlSnippet(String value) {
        this.htmlSnippet = value;
    }

}
